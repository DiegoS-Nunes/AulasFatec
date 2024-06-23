--1. Listar descrição dos produtos que tem valor unitário acima da media e não foram vendidos no mês de maio deste ano
SELECT pr.DESCRICAO 
FROM PRODUTO PR
WHERE pr.VALOR_UNITARIO >
      (SELECT AVG(pr.VALOR_UNITARIO)
        FROM PRODUTO) AND
COD_PRODUTO NOT IN
  (SELECT i.COD_PRODUTO
  FROM ITEM_PEDIDO I,  PEDIDO P
WHERE I.NUM_PEDIDO= P.NUM_PEDIDO
AND MONTH(p.DATA_COMPRA) = 5 AND
YEAR(p.DATA_COMPRA) = YEAR(GETDATE()))
--2.Listar nome dos vendedores e salários dos vendedores  com salário fixo acima da média
SELECT v.nome_vendedor, v.salario_fixo
FROM vendedor v
WHERE v.salario_fixo > (
	SELECT AVG(v.salario_fixo) AS mediaSalario
	FROM vendedor v
)
ORDER BY v.salario_fixo ASC

--3.Listar nome dos vendedores com salário fixo abaixo da média e que não realizaram vendas no primeiro trimestre
--deste ano
SELECT DISTINCT v.nome_vendedor, v.salario_fixo
FROM vendedor v
INNER JOIN pedido p ON p.cod_vendedor = v.cod_vendedor
WHERE v.cod_vendedor NOT IN(
	SELECT DISTINCT p.cod_vendedor
	FROM pedido p
	WHERE MONTH(p.data_compra) <= 4
	)
	AND v.salario_fixo < (
	SELECT AVG(v.salario_fixo) AS mediaSalario
	FROM vendedor v
	)
ORDER BY v.salario_fixo ASC

--4.Listar o nome do vendedor com maior salário 
SELECT v.nome_vendedor
FROM vendedor v
WHERE v.salario_fixo = (
	SELECT MAX(v.salario_fixo)
	FROM vendedor v
	)

--5.Listar descrição dos produtos que tem valor unitário abaixo da média e foram vendidos para o cliente ‘Osmar Celino’ 
SELECT pr.cod_produto, pr.descricao
FROM produto pr
WHERE pr.Valor_unitario < (
	SELECT AVG(pr.Valor_unitario)
	FROM produto pr
	)
--6.Listar nome dos vendedores que realizaram vendas em valores superiores ao vendedor “Jav Endi Tudo da Silva”
	SELECT v.nome_vendedor, SUM(ip.quantidade*pr.Valor_unitario) AS totalVenda
	FROM vendedor v
	INNER JOIN pedido p ON p.cod_vendedor = v.cod_vendedor
	INNER JOIN item_pedido ip ON ip.num_pedido = p.Num_pedido
	INNER JOIN produto pr ON pr.cod_produto = ip.cod_produto
	GROUP BY p.cod_vendedor, v.nome_vendedor
		HAVING SUM(ip.quantidade*pr.Valor_unitario) > (
		SELECT SUM(ip.quantidade*pr.Valor_unitario) AS totalVenda
		FROM vendedor v
		INNER JOIN pedido p ON p.cod_vendedor = v.cod_vendedor
		INNER JOIN item_pedido ip ON ip.num_pedido = p.Num_pedido
		INNER JOIN produto pr ON pr.cod_produto = ip.cod_produto
		WHERE v.nome_vendedor = 'Sandra Bullock'
		GROUP BY p.cod_vendedor, v.nome_vendedor
		)