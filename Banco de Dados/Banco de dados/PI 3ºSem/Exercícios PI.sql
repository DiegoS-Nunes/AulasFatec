--1. Listar todas as reservas feitas por clientes cujo nome come�a com 'M' e que utilizaram ve�culos do tipo SUV:
SELECT R.numReserva, C.Nome AS Cliente, TV.Tipo AS TipoVeiculo
FROM RESERVA R
INNER JOIN CLIENTE C ON R.idCliente = C.idCliente
INNER JOIN TIPO_VEICULO TV ON r.idTipo = TV.idTipo
WHERE C.Nome LIKE 'M%' 
	AND TV.Tipo = 'SUV';

--2. Mostrar o n�mero de revis�es realizadas para cada tipo de ve�culo, ordenado pelo n�mero de revis�es de forma decrescente:
SELECT TV.Tipo AS TipoVeiculo, COUNT(*) AS Total_Revisoes
FROM REVISAO R
INNER JOIN TIPO_VEICULO TV ON R.idTipo = TV.idTipo
GROUP BY TV.Tipo
ORDER BY Total_Revisoes DESC;

--3. Calcular a m�dia de quilometragem dos ve�culos de cada tipo, excluindo aqueles que t�m menos de 80.000 km:
SELECT TV.Tipo AS TipoVeiculo, AVG(V.Quilometragem) AS Media_Quilometragem
FROM VEICULO V
INNER JOIN TIPO_VEICULO TV on TV.idTipo = V.idTipo
WHERE V.Quilometragem >= 80000
GROUP BY TV.Tipo
ORDER BY Media_Quilometragem DESC;

--4. Listar os nomes, cidade e estado dos clientes que contrataram motoristas cuja habilita��o vence antes de 2025, ordenados por data de vencimento:
SELECT C.Nome AS Cliente, L.Cidade, L.Estado, M.dataVencimento AS Venc_Habilita��o
FROM CLIENTE C
INNER JOIN LOCALIZACAO L ON L.idLocalizacao = C.idLocalizacao
INNER JOIN MOTORISTA M ON M.idCliente = C.idCliente
WHERE YEAR(M.dataVencimento) < 2025
ORDER BY M.dataVencimento DESC;

--5. Mostrar o total de loca��es feitas em cada filial, apenas das reservas feitas em 2024, ordenado de forma crescente pelo n�mero de loca��es:
SELECT R.idFilialOrigem, COUNT(*) AS Total_Locacoes
FROM LOCACAO L
INNER JOIN RESERVA R ON L.idFilialDestino = R.idFilialDestino
WHERE YEAR(R.dataRetirada) = 2024
GROUP BY R.idFilialOrigem
ORDER BY Total_Locacoes ASC;

--6. Listar o n�mero de clientes por cidade, apenas das cidades que t�m mais de 2 clientes, ordenado de forma decrescente pelo n�mero de clientes:
SELECT L.Cidade, COUNT(*) AS Total_Clientes
FROM CLIENTE C
INNER JOIN LOCALIZACAO L ON C.idLocalizacao = L.idLocalizacao
GROUP BY L.Cidade
	HAVING COUNT(*) > 2
ORDER BY Total_Clientes DESC;

--7. Calcular a m�dia de capacidade de carga dos tipos de caminh�o que t�m capacidade superior a 4000, agrupado por tipo de caminh�o:
SELECT TV.Tipo AS TipoVeiculo, AVG(TCC.capacidadeCarga) AS Media_Capacidade_Carga
FROM T_CAM_CARGA TCC
INNER JOIN TIPO_VEICULO TV ON TCC.idTipo = TV.idTipo
WHERE TCC.capacidadeCarga > 4000
GROUP BY TV.Tipo;

--8. Listar os nomes dos clientes e os tipos de ve�culos que eles reservaram no segunto semestre de 2024, juntamente com a filial de origem da reserva, 
--ordenado pelo nome do cliente.
SELECT C.Nome AS NomeCliente, TV.Tipo AS TipoVeiculo, F.idLocalizacao AS FilialOrigem, R.dataRetirada
FROM CLIENTE C
INNER JOIN RESERVA R ON C.idCliente = R.idCliente
INNER JOIN TIPO_VEICULO TV ON R.idTipo = TV.idTipo
INNER JOIN FILIAL F ON R.idFilialOrigem = F.idFilial
WHERE MONTH(R.dataRetirada) >=6
	AND YEAR(R.dataRetirada)=2024
ORDER BY C.Nome;

--9. Listar o nome dos clientes que fizeram reservas de ve�culos cuja cor � 'Azul' ou 'Verde', ordenados alfabeticamente:
SELECT C.Nome, V.Cor
FROM CLIENTE C
INNER JOIN RESERVA R ON R.idCliente = C.idCliente
INNER JOIN VEICULO V ON V.idTipo = R.idTipo
WHERE V.Cor IN ('Azul','Verde')
ORDER BY C.Nome ASC

--10. Listar os nomes dos clientes, as placas dos ve�culos e as filiais de destino das loca��es feitas em 2024, ordenado pela data de retirada:
SELECT C.Nome, V.Placa, L.idFilialDestino, L.dataRetirada
FROM CLIENTE C
INNER JOIN MOTORISTA M ON M.idCliente = C.idCliente
INNER JOIN LOCACAO L ON L.habilitacaoMotorista = M.Habilitacao
INNER JOIN VEICULO V ON L.placaVeiculo = V.Placa
WHERE YEAR(L.dataRetirada) = 2024
ORDER BY L.dataRetirada;

--Exemplos de modifica��o (update e delete)

-- 1.Atualizar o Estado e CEP de um cliente baseado na localiza��o de uma filial espec�fica
UPDATE CLIENTE
SET idLocalizacao = (
    SELECT idLocalizacao 
    FROM FILIAL 
    WHERE idFilial = 1
)
WHERE idCliente = 5;

-- 2.Atualizar a cor e a �ltima quilometragem de um ve�culo ap�s uma revis�o
UPDATE VEICULO
SET Cor = 'Azul', ultimaQuilometragem = (
    SELECT Quilometragem 
    FROM REVISAO 
    WHERE numRevisao = (
		SELECT MAX(R.numRevisao)
		FROM REVISAO R
	)
)
WHERE Placa = 'XYZ5678';

-- 3.Atualizar o n�mero de passageiros e o tamanho de um tipo de ve�culo baseado em outro tipo de ve�culo
UPDATE T_AUTOM_CAM_PASS
SET numPassageiros = (
    SELECT numPassageiros 
    FROM T_AUTOM_CAM_PASS 
    WHERE idTipo = 1
), 
Tamanho = (
    SELECT Tamanho 
    FROM T_AUTOM_CAM_PASS 
    WHERE idTipo = 1
)
WHERE idTipo = 3;

-- 4.Excluir reservas de clientes que n�o possuem loca��es associadas
DELETE FROM RESERVA
WHERE idCliente NOT IN (
    SELECT DISTINCT idCliente 
    FROM LOCACAO
);

-- 5.Excluir ve�culos que n�o foram revisados
DELETE FROM VEICULO
WHERE idTipo NOT IN (
    SELECT DISTINCT idTipo 
    FROM REVISAO
);


DROP TABLE LOCALIZACAO;
DROP TABLE CLIENTE;
DROP TABLE P_FISICA;
DROP TABLE P_JURIDICA;
DROP TABLE FILIAL;
DROP TABLE TIPO_VEICULO;
DROP TABLE VEICULO;
DROP TABLE T_AUTOM_CAM_PASS;
DROP TABLE T_CAM_CARGA;
DROP TABLE REVISAO;
DROP TABLE MOTORISTA;
DROP TABLE RESERVA;
DROP TABLE LOCACAO;
