--1-Listar número dos pedidos com entrega para o dia 11/05/2023
SELECT Num_pedido AS NºPEDIDO, data_entrega
FROM pedido
WHERE data_entrega = '20230511'
--2-Listar código dos vendedores e data de compra, para os pedidos realizados no primeiro trimestre de 2011
SELECT cod_vendedor, data_compra
FROM pedido
WHERE MONTH(data_compra)<=3 and YEAR(data_compra)=2011
--3-Listar o código dos clientes que tem entrega superior a 3 dias, em relação a data de compra 
SELECT cod_cliente, data_entrega, data_compra, DATEDIFF(DD,data_compra,data_entrega) AS Dias
FROM pedido
WHERE DATEDIFF(DD,data_compra,data_entrega)>3
--4-Listar dados dos pedidos realizados nos últimos 3 meses
SELECT *, DATEDIFF(MM,data_compra,data_entrega) AS Meses
FROM pedido
WHERE DATEDIFF(MM,data_compra,GETDATE())<=3
--5-Listar os dados dos pedidos realizados no segundo semestre de 2023
SELECT *, DATEPART(MM,data_compra) AS Mês
FROM pedido
WHERE DATEPART(MM,data_compra)>=6 and DATEPART(YY,data_compra)=2023
--6-Listar os dados dos pedidos realizados em janeiro ou fevereiro de 2024
SELECT *, MONTH(data_compra) AS Mês
FROM pedido
WHERE MONTH(data_compra) in ('1','2')
--7-Listar o código dos clientes que tem data de entrega inferior a 4 dias, em relação à data de hoje
SELECT cod_cliente, data_entrega, data_compra, DATEDIFF(DD,data_compra,data_entrega) AS Dias
FROM pedido
WHERE DATEDIFF(DD,data_entrega,GETDATE())<4
--8-Listar o código dos clientes que tem data de entrega inferior a 4 dias, em relação à data DE COMPRA
SELECT cod_cliente, data_entrega, data_compra, DATEDIFF(DD,data_compra,data_entrega) AS Dias
FROM pedido
WHERE DATEDIFF(DD,data_compra,data_entrega)<4
--9-Listar o código do vendedor que realizaram pedidos com data de entrega nos primeiros 100 dias do ano de 2011
SELECT cod_vendedor, data_compra, DATEPART(DY,data_compra) AS Dias
FROM pedido
WHERE DATEPART(DY,data_compra)<=100
--10-Listar os dados dos pedidos com quatro semanas ou mais entre a data da compra e a data de entrega
SELECT *, DATEDIFF(WEEK,data_compra,data_entrega) AS Semanas
FROM pedido
WHERE DATEDIFF(WEEK,data_compra,data_entrega)>=4