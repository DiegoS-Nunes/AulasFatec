--1.Listar o código e o nome dos vendedores que efetuaram vendas para o cliente com código 1.
SELECT v.cod_vendedor, v.nome_vendedor, p.cod_cliente
FROM pedido p
INNER JOIN cliente c on p.cod_cliente = c.Cod_cliente
INNER JOIN vendedor v on v.cod_vendedor = p.cod_vendedor
WHERE p.cod_cliente = 1

--2.Listar  o número do pedido, data de entrega, a quantidade e a descrição do produto com código 1.
SELECT pd.Num_pedido, pd.data_entrega, ip.quantidade, p.descricao
FROM pedido pd
INNER JOIN item_pedido ip ON PD.Num_pedido = ip.num_pedido
INNER JOIN produto p ON p.cod_produto = ip.cod_produto 
WHERE ip.cod_produto = 1   
ORDER BY PD.Num_pedido ASC

--3.Quais os vendedores (código e nome) fizeram pedidos para o cliente 'Ciclano da Silva'.
SELECT v.cod_vendedor, v.nome_vendedor, c.Nome_cliente
FROM cliente c
INNER JOIN pedido p ON p.cod_cliente = c.Cod_cliente
INNER JOIN vendedor v ON p.cod_vendedor = v.cod_vendedor
WHERE c.Nome_cliente = 'Ciclano da Silva'
ORDER BY cod_vendedor ASC

---------------------------------------------------------------------------------------------------------------------
--4.Listar o número do pedido, o código do produto, a descrição do produto, o código do vendedor, o nome do vendedor , 
--o nome do cliente, para todos os clientes que moram em Sorocaba.
SELECT p.Num_pedido, pr.cod_produto, pr.descricao, v.cod_vendedor, v.nome_vendedor, c.Nome_cliente
FROM pedido p, produto pr, vendedor v, cliente c, item_pedido ip
WHERE c.Cidade= 'Jundiaí' AND c.Cod_cliente = p.cod_cliente AND v.cod_vendedor = p.cod_vendedor 
	AND ip.num_pedido = p.Num_pedido AND pr.cod_produto = ip.cod_produto

--5.Listar todos os dados dos clientes cujo nome comece por “ maria” e que tenha o código do cliente entre 1 e 4, 
--que morem em Sorocaba, que tenham realizado compra em setembro deste ano,por ordem alfabetica de nome do cliente.
SELECT c.*
FROM cliente c
INNER JOIN pedido p ON P.cod_cliente = C.Cod_cliente
WHERE c.Nome_cliente like ('maria%') AND c.Cod_cliente BETWEEN 1 and 14 AND C.Cidade = 'Sorocaba'
	AND P.cod_cliente = C.Cod_cliente AND MONTH(P.data_compra)=9

--6.Listar o código e o nome dos clientes que tem data de entrega para 03/04/2011.
SELECT C.Cod_cliente, C.Nome_cliente, P.data_entrega
FROM cliente C
INNER JOIN pedido P ON P.cod_cliente = C.Cod_cliente 
WHERE P.data_entrega  = '2011-04-03'

select p.Num_pedido, p.data_entrega, c.Cod_cliente, c.Nome_cliente, c.UF, v.cod_vendedor, v.nome_vendedor
from pedido p
INNER JOIN vendedor v on v.cod_vendedor = p.cod_vendedor
INNER JOIN cliente c on p.cod_cliente = c.Cod_cliente
where c.UF =  'sp'
order by v.nome_vendedor asc

--7.Listar o código do produto, a descrição, a quantidade pedida e o data de entrega para o pedido número 12.
SELECT ip.cod_produto, pr.cod_produto, ip.quantidade, p.Num_pedido
FROM produto pr
INNER JOIN item_pedido ip ON ip.cod_produto = pr.cod_produto
INNER JOIN pedido p ON p.Num_pedido = ip.num_pedido
WHERE ip.num_pedido = 12

--8.Listar o nome dos clientes do estado de São Paulo (UF ='SP')  que têm data de entrega até o dia 03-12-2011 
--e fizeram pedido com o vendedor com código 20.
SELECT c.Nome_cliente, C.UF, p.data_entrega, p.cod_vendedor
FROM pedido p
INNER JOIN cliente c ON c.Cod_cliente=p.cod_cliente
WHERE c.UF='sp' AND P.cod_vendedor=3 and P.data_entrega <= '2011-12-03'

--9.Quais os cliente ( nome e endereço) da cidade de Itu ou Sorocaba tiveram seus pedidos tirados com 
--o vendedor  “Osmar Tello”.
SELECT c.Nome_cliente, C.Endereco, p.data_entrega, p.cod_vendedor
FROM pedido p
INNER JOIN cliente c ON c.Cod_cliente=p.cod_cliente
INNER JOIN vendedor v ON v.cod_vendedor = p.cod_vendedor
WHERE c.Cidade in ('Itu','Sorocaba') AND  v.nome_vendedor='matt damon'

--10.Quais produtos (código, descrição, unidade) cuja quantidade vendida seja maior que 150 e tenha sido 
--vendida pelo vendedor  ‘Osmar Garida’
SELECT PR.cod_produto, PR.descricao, PR.Unidade, IP.quantidade
FROM produto PR
INNER JOIN item_pedido IP ON IP.cod_produto = PR.cod_produto
INNER JOIN pedido P ON P.Num_pedido = IP.num_pedido
INNER JOIN vendedor V ON V.cod_vendedor = P.cod_vendedor
WHERE IP.quantidade > 150 AND V.nome_vendedor = 'Osmar Garida'

--11.Listar o número do pedido, o código do produto, a descrição do produto, o código do vendedor, o nome do vendedor ,
--o nome do cliente, para todos os clientes que moram em Itu.
SELECT p.Num_pedido, ip.cod_produto, pr.descricao, p.cod_vendedor, v.nome_vendedor, c.Nome_cliente, c.Cidade
FROM pedido p
INNER JOIN item_pedido ip on p.Num_pedido = ip.num_pedido
INNER JOIN produto pr on pr.cod_produto = ip.cod_produto
INNER JOIN vendedor v on v.cod_vendedor = p.cod_vendedor
INNER JOIN cliente c on p.cod_cliente = c.Cod_cliente
WHERE c.cidade = 'Itu'

--12.Listar todos os clientes (nome do cliente e cidade) que moram na mesma cidade que José Silva
SELECT *
FROM cliente c
WHERE c.Cidade in (
SELECT c.Cidade
FROM cliente c
where c.Nome_cliente = 'Marcelo Cruz'
)

--13.Listar nome dos clientes que realizaram compra com o vendedor ‘Ciclano alberto’, no mês de maio deste ano.
SELECT c.Nome_cliente, v.nome_vendedor, p.data_compra
FROM cliente c
INNER JOIN pedido p ON p.cod_cliente = c.Cod_cliente
INNER JOIN vendedor v on p.cod_cliente = v.cod_vendedor
WHERE v.nome_vendedor = 'Ciclano alberto' AND MONTH(P.data_compra) = 5 AND YEAR(P.data_compra) = YEAR(GETDATE())


--14.Listar o nome dos vendedores com média de valor de vendas superior a média geral de vendas de todos os vendedores
SELECT v.nome_vendedor, avg(IP.quantidade) Quantidade_Vendida
FROM vendedor v
INNER JOIN pedido p on p.cod_vendedor = v.cod_vendedor
INNER JOIN item_pedido ip on ip.num_pedido = p.Num_pedido
GROUP BY v.nome_vendedor
WHERE avg(IP.quantidade) > (

)