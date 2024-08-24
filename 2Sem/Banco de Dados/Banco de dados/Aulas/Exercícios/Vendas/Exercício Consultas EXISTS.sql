--Quais produtos foram vendidos em quantidade superior a 100 unidades 
SELECT * FROM PRODUTO P
WHERE EXISTS
   (SELECT 1 FROM ITEM_PEDIDO I
     WHERE QUANTIDADE > 100 AND
     P.COD_PRODUTO = I.COD_PRODUTO)  
--2.Quais produtos foram vendidos em quantidade superior a 100 unidades OU com preço inferior a $2,00
SELECT * FROM PRODUTO P
WHERE EXISTS
   (SELECT 1 FROM ITEM_PEDIDO I
     WHERE (VALOR_UNITARIO < 2  OR QUANTIDADE > 100) AND
     P.COD_PRODUTO = I.COD_PRODUTO)
--3.Quais produtos foram vendidos em quantidade superior a 100 unidades E com preço inferior a $2,00
SELECT * FROM PRODUTO P
WHERE EXISTS
   (SELECT 1 FROM ITEM_PEDIDO I
     WHERE VALOR_UNITARIO < 2  and QUANTIDADE > 100 AND
     P.COD_PRODUTO = I.COD_PRODUTO)
SELECT * FROM PRODUTO P
WHERE  VALOR_UNITARIO < 2 and EXISTS
   (SELECT 1 FROM ITEM_PEDIDO I
     WHERE QUANTIDADE > 100 AND
     P.COD_PRODUTO = I.COD_PRODUTO)
SELECT * FROM PRODUTO P
WHERE EXISTS
   (SELECT 1 FROM ITEM_PEDIDO I
     WHERE QUANTIDADE > 100 AND
     P.COD_PRODUTO = I.COD_PRODUTO)
      AND  VALOR_UNITARIO < 2
--4.	Listar num-pedido e o código do produto para os produtos com valor-unitario inferior a $4,00.
SELECT ip.num_pedido, ip.cod_produto
FROM item_pedido ip
WHERE EXISTS (
	SELECT 1
	FROM produto pr
	WHERE pr.cod_produto = ip.cod_produto
		AND pr.Valor_unitario <4
)
--5.Listar o nome do clientes  QUE COMECE COM A LETRA “G” E que realizaram pedidos com data de entrega no ano de 2011
SELECT c.Nome_cliente
FROM cliente c
WHERE EXISTS (
	SELECT 1
	FROM pedido p
	WHERE YEAR(p.data_entrega) = 2011
	AND P.cod_cliente = C.Cod_cliente
) AND C.Nome_cliente LIKE 'G%'
--6.Listar o código e o nome dos vendedores que efetuaram vendas para o cliente com código 10.
SELECT v.cod_vendedor, v.nome_vendedor
FROM vendedor v
WHERE EXISTS (
	SELECT 1
	FROM pedido p
	WHERE p.cod_vendedor = v.cod_vendedor 
		AND p.cod_cliente =10
)
--7.Quais produtos (código, descrição, unidade) cuja quantidade (VENDIDA) seja maior que 50 e menor que 100.
SELECT p.cod_produto, p.descricao, p.Unidade
FROM produto p
WHERE EXISTS (
	SELECT 1
	FROM item_pedido ip
	WHERE ip.cod_produto = p.cod_produto
		HAVING SUM(ip.quantidade) BETWEEN 50 and 100
)
--8.Listar o nome completo dos clientes que realizaram mais de 3 pedidos no mês de outubro deste ano
SELECT c.Nome_cliente
FROM cliente c
WHERE EXISTS (
	SELECT 1
	FROM pedido p
	WHERE p.cod_cliente = c.Cod_cliente
		AND (MONTH (p.data_compra) = 10 AND YEAR(P.data_compra) = GETDATE())
		HAVING COUNT(p.Num_pedido) > 3
)
--9.Nome dos vendedores que efetuaram vendas com data de entrega dentro do primeiro trimestre deste ano
SELECT v.nome_vendedor
FROM vendedor v
WHERE EXISTS (
	SELECT 1
	FROM pedido p
	WHERE p.cod_vendedor = v.cod_vendedor
		AND DATEPART(QQ,p.data_entrega)=1
		AND YEAR(p.data_entrega) = GETDATE()
)
--10.Listar a descricao dos produtos que foram vendidos pelo vendedor com código 10
SELECT pr.descricao
FROM produto pr
WHERE EXISTS (
	SELECT 1
	FROM item_pedido ip
	WHERE ip.cod_produto=pr.cod_produto AND EXISTS (
		SELECT 1
		FROM pedido p
		WHERE P.cod_vendedor = 10
	)
)
--11.Listar a descrição dos produtos que foram vendidos pelo vendedor  “Osmar Mellada” em outubro deste ano
SELECT pr.descricao
FROM produto pr
WHERE EXISTS (
	SELECT 1
	FROM pedido p
	WHERE (MONTH (p.data_compra) = 10 AND YEAR(P.data_compra) = GETDATE())
		AND EXISTS (
		SELECT 1
		FROM vendedor v
		WHERE p.cod_vendedor = v.cod_vendedor
			AND V.nome_vendedor like 'Osmar Mellada'
			AND EXISTS(
			SELECT 1
			FROM item_pedido ip
			WHERE p.Num_pedido = ip.num_pedido 
				AND ip.cod_produto = pr.cod_produto
		)
	)
)
--12.Listar a descrição dos produtos comprados pelo cliente com código 2
SELECT pr.descricao
FROM produto pr
WHERE EXISTS (
	SELECT 1
	FROM pedido p
	WHERE EXISTS (
		SELECT 1
		FROM item_pedido ip
		WHERE ip.num_pedido = p.Num_pedido
			AND ip.cod_produto = pr.cod_produto
			AND p.cod_cliente = 2
		)
)
--13.Listar a descrição dos produtos comprados pelo cliente “Osmar Umorado”
SELECT DESCRICAO
FROM PRODUTO P WHERE EXISTS
    (SELECT 1 FROM ITEM_PEDIDO I
WHERE P.COD_PRODUTO= I.COD_PRODUTO AND EXISTS
        (SELECT 1 FROM PEDIDO PE
WHERE I.NUM_PEDIDO= PE.NUM_PEDIDO AND  EXISTS
      ( SELECT 1 FROM CLIENTE C
     WHERE PE.COD_CLIENTE = C.COD_CLIENTE AND 
NOME_CLIENTE = 'OSMAR UMORADO')))
--14.Listar o nome dos clientes que não moram na mesma cidade que “Osmar Myta”
SELECT c.Nome_cliente
FROM cliente c
WHERE NOT EXISTS (
	SELECT 1
	FROM cliente c2
	WHERE c2.Nome_cliente like 'Osmar Myta%'
		AND c2.Cidade = c.Cidade
)
--15.Listar o nome dos clientes que moram na mesma cidade que “Osmar Myta”
SELECT c.Nome_cliente
FROM cliente c
WHERE EXISTS (
	SELECT 1
	FROM cliente c2
	WHERE c2.Nome_cliente like 'Marcelo%'
		AND c2.Cidade = c.Cidade
)
--16.Listar a descrição, a unidade e o valor_unitario para os produtos vendidos em quantidade inferior a 15 unidades
SELECT pr.descricao, pr.Unidade, pr.Valor_unitario
FROM produto pr
WHERE EXISTS (
	SELECT *
	FROM item_pedido ip
	WHERE ip.cod_produto = pr.cod_produto
		HAVING SUM(IP.quantidade)<15
)