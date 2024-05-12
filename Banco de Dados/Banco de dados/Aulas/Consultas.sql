--1. Listar os dados dos produtos cujo valor unitário seja maior ou igual $100,00 e menor ou igual a$300,00.
SELECT *
FROM produto
WHERE valor_unitario BETWEEN 100 AND 300
--2. Listar o número do pedido e o código do produto cuja quantidade NÃO esteja entre 100 e 150.
SELECT num_pedido AS 'PEDIDO', cod_produto
FROM item_pedido
WHERE quantidade NOT BETWEEN 100 AND 150
--3. Listar o nome dos vendedores cujo nome comece por "José".
SELECT nome_vendedor AS 'Vendedor'
FROM vendedor
WHERE nome_vendedor like 'José%'
--4. Listar o nome de todos os clientes cujo ultimo nome seja "Silva" ou “Sylva”.
SELECT nome_cliente AS 'Cliente'
FROM cliente
WHERE nome_cliente like '%Silva' or nome_cliente like '%Sylva'
--5. Listar a descrição e o código dos produtos que tenham a seqüência "AG" ou “AJ”em qualquer parte da descrição.
SELECT descricao as 'Produto', cod_produto as 'Código'
FROM produto
WHERE descricao like '%ag%' or descricao like '%aj%'
--6. Listar a descrição dos produtos cuja unidade, tenha exatamente 2 letras e termine por "G".
SELECT descricao as 'Produto',
FROM produto
WHERE unidade like '_g'
--7. Listar descrição dos produtos cuja unidade comece por "K" ou "Q" ou “G”.
SELECT descricao as 'Produto'
FROM produto
WHERE unidade like 'K%' OR unidade LIKE 'G%' OR unidade LIKE 'q%'
--8. Listar os dados dos clientes cujos nomes comecem por "A", "B" , "C", “D” ou “E”.
SELECT *
FROM cliente
WHERE nome_cliente like 'A%' OR nome_cliente like 'b%' or nome_cliente like 'c%' OR nome_cliente like 'd%' OR nome_cliente like 'e%'
--9. Listar os dados dos vendedores cujo nome não comece por "J" e não comece por “G”.
SELECT *
FROM vendedor
WHERE nome_vendedor not like 'j%' AND nome_vendedor not LIKE 'G%'
--10. Listar o código do produto que tenha quantidade 100, 200, 300, 400 ou 500.
SELECT cod_produto as 'Código'
from item_pedido
where quantidade in (100,200,300,400,500)
--11. Listar o nome e a faixa, de comissão para os vendedores com salário fixo igual a $600,00, $700,00 ou $800,00, $900 ou $1000.
SELECT nome_vendedor as 'Vendedor', faixa_comissao AS 'F. Comissão'
FROM vendedor
WHERE salario_fixo IN(600, 700, 800, 900, 1000)
--12. Listar os nomes dos clientes que não tenham endereço , nem CEP cadastrados
SELECT nome_cliente as 'Cliente'
from cliente
where endereco is null and cep is null
--13. Listar a descrição dos produtos com unidade igual a "Lt" e valor unitário entre $100,00 e $150,00.
SELECT descricao as 'Produto'
from produto
WHERE unidade = 'LT' and valor_unitario BETWEEN 100 AND 150
--14. Listar a descrição dos produtos com unidade igual a "Lt" e valor unitário entre $100,00 e $150,00 ou unidade igual a KG e valor unitário ente $50 e $100
SELECT descricao as 'Produto', unidade, valor_unitario
from produto
WHERE unidade in ('LT') and valor_unitario BETWEEN 100 AND 150 OR unidade in ('KG') and valor_unitario BETWEEN 50 AND 100 
--15. Listar os dados dos clientes que moram em "Jundiaí" e não estão com o CEP cadastrado.
SELECT nome_cliente as 'Cliente'
from cliente
where cidade in ('Jundiaí') and cep is null
--16. Listar os dados dos clientes que moram em "Itu", “Salto”, ou “Indaiatuba e não estão com o CEP cadastrado
SELECT nome_cliente as 'Cliente'
from cliente
where cidade in ('itu', 'Salto', 'Indaiatuba') and cep is null
--17. Listar o nome dos vendedores que tenham salário fixo entre 500 e 5000 e faixa de comissão igual a A ou igual a B
SELECT nome_vendedor as 'Vendedor'
from vendedor
where salario_fixo BETWEEN 500 and 5000 and faixa_comissao in ('A','B')
--18. Listar os nomes dos clientes que começam por "José" ou por "Maria".
SELECT nome_cliente as 'Cliente'
from cliente
WHERE nome_cliente like 'Jose%' or nome_cliente like 'Maria%'
--19. Listar os tipos de faixa de comissão da tabela vendedor em ordem alfabética.
SELECT DISTINCT faixa_comissao
FROM vendedor
oRDER by faixa_comissao ASC
--20. Listar as cidades onde moram os clientes (exibir cada cidade apenas uma vez) por ordem alfabética decrescente.
SELECT DISTINCT cidade
FROM cliente
ORDER by cidade desc
--21. Listar dos dados dos clientes por ordem alfabética de cidade, seguida da ordem alfabética de nome, para os clientes cujo nome comecem com “San” ou “Bo”
SELECT *
from cliente
where nome_cliente like 'san%' or nome_cliente LIKE 'bo%'
ORDER by nome_cliente ASC, cidade asc
--22. Listar os dados dos produtos por ordem alfabética decrescente de valor unitário, para os produtos que custem mais de $10.00
SELECT *
from produto
WHERE valor_unitario > 10
ORDER by descricao asc