--1.	Listar a maior quantidade que conste na tabela de item do pedido.
SELECT MAX(quantidade) as Maior_Quantidade
FROM item_pedido
--2.	Listar o menor valor unitário da tabela de produtos.
SELECT MIN(Valor_unitario) as Menor_Valor_Unitário
FROM produto
--3.	Mostrar a somatória dos salários fixos pago aos vendedores.
SELECT SUM(salario_fixo) as Total_Salário_fixo
FROM vendedor
--4.	Qual a média de valor unitário para os produtos cuja unidade seja igual a "Kg".
SELECT AVG(Valor_unitario) as Média_Valor_Unitário
FROM produto
WHERE Unidade = 'Kg'
--5.	Mostrar quantos tipos de unidades diferentes existem na tabela de produtos.
SELECT Unidade
FROM produto
GROUP BY Unidade 
--6.	Listar quantos produtos tem unidade igual a "Lt".
SELECT COUNT (*) Total_produtos_LT
FROM produto
WHERE Unidade = 'lt'
--7.	Listar a quantidade de clientes agrupados por cidade.
SELECT Cidade, COUNT (*) Cliente_Total
FROM cliente
GROUP BY Cidade
--8.	Listar quantos pedidos cada vendedor realizou.
SELECT v.nome_vendedor, COUNT(*) Vendas_Total
FROM pedido p
INNER JOIN vendedor v on v.cod_vendedor = p.cod_vendedor
GROUP BY v.nome_vendedor
ORDER BY nome_vendedor ASC
--9.	Listar o maior e o menor valor unitário para cada tipo de unidade de produto.
SELECT Unidade, MAX(Valor_unitario) as Maior_Valor_Unitario, MIN(Valor_unitario) as Menor_Valor_Unitario
FROM produto
GROUP BY Unidade
--10.	Listar o número de clientes, agrupados por cidade para todas as cidades que aparecem mais de 4 vezes na tabela de clientes.
SELECT Cidade, COUNT (Cod_cliente) AS Qtd_Clientes
From cliente
GROUP BY Cidade
HAVING COUNT(Cidade)>4

