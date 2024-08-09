--1.Listar número do pedido e data de entrega de todos os pedidos
SELECT NUM_PEDIDO AS 'Nº PEDIDO', DATA_ENTREGA AS 'ENTREGA'
FROM PEDIDO

--2.Listar a descrição e o valor unitário dos produtos.
SELECT DESCRICAO AS 'DESCRIÇÃO', VALOR_UNITARIO AS '$ UNITÁRIO'
FROM PRODUTO

--3.Listar nome e endereço de todos os clientes.
SELECT NOME_CLIENTE AS 'CLIENTE', ENDERECO
FROM CLIENTE

--4.Listar nome de todos os vendedores.
SELECT NOME_VENDEDOR AS 'VENDEDOR'
FROM VENDEDOR

--5.Listar todas as informações da tabela de clientes.
SELECT *
FROM CLIENTE

--6.Listar todas as informações da tabela produtos.
SELECT *
FROM PRODUTO

--7.Listar o código e nome dos produtos. 
--Insira as literais "código do produto" e "nome do produto" antes de cada atributo.
SELECT 'Código do produto: ' as DESC_CAMPO, COD_PRODUTO AS 'ID PRODUTO', 'Nome do produto: ' AS DESC_CAMPO, DESCRICAO
FROM PRODUTO

--8.Listar o nome de todos os vendedores. Alterar o cabeçalho da coluna para nome.
SELECT NOME_VENDEDOR AS 'NOME'
FROM VENDEDOR

--9.Listar o nome de todos os clientes. Alterar o cabeçalho da coluna para nome.
SELECT NOME_CLIENTE AS 'NOME'
FROM CLIENTE

--10.Listar o preço dos produtos aumentados em 10%.
SELECT VALOR_UNITARIO*1.1 AS '$ PRODUTO'
FROM PRODUTO

--11.Listar o salário fixo dos vendedores aumentados em 5%.
SELECT SALARIO_FIXO*1.05 AS 'SALÁRIO'
FROM VENDEDOR


--1.Listar os dados dos produtos cujo valor unitário seja 
--maior ou igual $1,00 e menor  ou igual a  $20,00.
SELECT *
FROM PRODUTO
WHERE VALOR_UNITARIO >=1 AND VALOR_UNITARIO<=20

--2.Listar o número do pedido e o código do produto cuja quantidade esteja entre 10 e 1500.
SELECT NUM_PEDIDO AS 'PEDIDO', COD_PRODUTO
FROM ITEM_PEDIDO
WHERE QUANTIDADE >= 10 AND QUANTIDADE <=1500

--3.Listar o código do produto que tenha quantidade 100, 200 ou 300.
SELECT COD_PRODUTO
FROM ITEM_PEDIDO
WHERE QUANTIDADE = 100 OR QUANTIDADE = 200 OR QUANTIDADE = 300

--4.Listar o nome e a faixa de comissão para os vendedores com 
--salário fixo igual a $300,00, $400,00 ou $500,00.
SELECT NOME_VENDEDOR AS 'VENDEDOR', FAIXA_COMISSAO
FROM VENDEDOR
WHERE SALARIO_FIXO = 300 OR SALARIO_FIXO = 400 OR SALARIO_FIXO = 500

--5.Listar os nomes dos clientes que não tenham endereço cadastrado.
SELECT NOME_CLIENTE AS 'CLIENTE'
FROM CLIENTE
WHERE ENDERECO IS NULL

--6.Listar nome dos clientes que não tenham CEP cadastrado.
SELECT NOME_CLIENTE AS 'CLIENTE'
FROM CLIENTE
WHERE CEP IS NULL

--7.Listar a descrição dos produtos com unidade igual a "Lt" e valor unitário entre $1.00 e $15,.00.
SELECT DESCRICAO AS 'Produto'
FROM PRODUTO
WHERE UNIDADE='Lt' AND VALOR_UNITARIO >=1 AND VALOR_UNITARIO <=15

--8.Listar os dados dos clientes que moram em "Jundiaí" e não estão com o CEP cadas-trado.
SELECT *
FROM CLIENTE
WHERE CIDADE='JUNDIAÍ' AND CEP IS NULL

--9.Listar o nome e a cidade dos clientes que moram em Itu, Indaiatuba, São Paulo ou Jundiaí
SELECT NOME_CLIENTE AS 'CLIENTE', CIDADE AS 'CIDADE'
FROM CLIENTE
WHERE CIDADE = 'ITU' OR CIDADE = 'INDAIATUBA' OR CIDADE = 'SÃO PAULO' OR CIDADE = 'JUNDIAÍ'

--10.Listar o nome dos vendedores que tenham 
--salário fixo entre 500 e 5000 e faixa de comissão igual a A ou igual a B
SELECT NOME_VENDEDOR AS 'VENDEDOR'
FROM VENDEDOR
WHERE SALARIO_FIXO >= 500 AND SALARIO_FIXO <= 5000 AND FAIXA_COMISSAO = 'A' OR FAIXA_COMISSAO = 'B'

--11.Listar o nome dos clientes que moram em Jundiaí.
SELECT NOME_CLIENTE AS 'CLIENTE'
FROM CLIENTE
WHERE CIDADE = 'JUNDIAÍ'

--12.Listar todos os dados dos vendedores com salário fixo <$400,00.
SELECT *
FROM VENDEDOR
WHERE SALARIO_FIXO < 400

--13.Listar o código do produto e a descrição para os produtos cuja unidade seja igual a "Kg".
SELECT COD_PRODUTO, DESCRICAO
FROM PRODUTO
WHERE UNIDADE='KG'

--14.Listar o pedido e o data de entrega para os pedidos feitos entre 01/06/2023 a 01/09/2023.
SELECT NUM_PEDIDO AS 'Nº PEDIDO', DATA_ENTREGA AS 'ENTREGA'
FROM PEDIDO
WHERE DATA_COMPRA>='2011-06-01' AND DATA_COMPRA<='2011-09-01'

--15.Listar os dados dos produtos cujo valor unitário seja maior que 2 e menor que 10
SELECT *
FROM PRODUTO
WHERE VALOR_UNITARIO >2 AND VALOR_UNITARIO<10

