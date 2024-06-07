-- CONSULTAS

-- 1. Listar os nomes e endere�o dos clientes que t�m "Silva" no nome usando IN
SELECT Nome, Endereco
FROM CLIENTE
WHERE idCliente IN (
	SELECT idCliente 
	FROM P_FISICA 
	WHERE Nome LIKE '%Silva%');
-- Esta consulta usa IN para filtrar os clientes cujo nome cont�m "Silva"

-- 2. Listar os ve�culos que est�o em uma das filiais espec�ficas (1, 2, ou 3) usando EXISTS
SELECT *
FROM VEICULO v
WHERE EXISTS (
	SELECT 1 
	FROM FILIAL 
	WHERE idFilial IN (1, 2, 3) 
		AND v.idFilial = idFilial);
-- Esta consulta usa EXISTS para filtrar os ve�culos em filiais espec�ficas

-- 3. Listar as reservas que foram feitas entre duas datas espec�ficas usando EXISTS
SELECT N�Reserva, dataRetirada, dataDevolucao, idCliente
FROM RESERVA r
WHERE EXISTS (SELECT 1 FROM CLIENTE c WHERE c.idCliente = r.idCliente)
AND dataRetirada BETWEEN '2024-06-01' AND '2024-09-01';
-- Esta consulta usa EXISTS para filtrar reservas entre duas datas

-- 4. Listar as revis�es feitas nos �ltimos 30 dias usando IN
SELECT N�Revis�o, Quilometragem, idVeiculo
FROM REVISAO
WHERE dataRevisao >= DATEADD(day, -30, GETDATE())
AND idVeiculo IN (SELECT idVeiculo FROM VEICULO);
-- Esta consulta usa IN para filtrar revis�es feitas nos �ltimos 30 dias

-- 5. Listar os motoristas ordenados pela data de vencimento da habilita��o usando IN
SELECT Nome, Habilitacao, dataVencimento
FROM MOTORISTA
WHERE Habilitacao IN (SELECT habilitacaoMotorista FROM LOCACAO)
ORDER BY dataVencimento;
-- Esta consulta usa IN para filtrar motoristas cuja habilita��o est� em uma loca��o, ordenados pela data de vencimento

-- 6. Contar o n�mero de ve�culos em cada filial usando EXISTS
SELECT f.Localizacao, COUNT(*)
FROM FILIAL f
WHERE EXISTS (SELECT 1 FROM VEICULO v WHERE v.idFilial = f.idFilial)
GROUP BY f.Localizacao;
-- Esta consulta usa EXISTS para contar o n�mero de ve�culos em cada filial

-- 7. Listar o n�mero de reservas feitas por cada cliente usando IN
SELECT c.Nome, COUNT(*)
FROM CLIENTE c
WHERE c.idCliente IN (SELECT idCliente FROM RESERVA)
GROUP BY c.Nome;
-- Esta consulta usa IN para contar o n�mero de reservas feitas por cada cliente

-- 8. Listar os clientes que fizeram mais de 2 reservas usando EXISTS
SELECT c.Nome, COUNT(*)
FROM CLIENTE c
WHERE EXISTS (SELECT 1 FROM RESERVA r WHERE r.idCliente = c.idCliente HAVING COUNT(*) > 2)
GROUP BY c.Nome;
-- Esta consulta usa EXISTS para filtrar clientes com mais de 2 reservas

-- 9. Listar as loca��es junto com os detalhes do ve�culo e motorista usando EXISTS
SELECT l.N�Locacao, l.dataRetirada, l.dataDevolucao, v.Placa, v.Cor, m.Nome AS Motorista
FROM LOCACAO l
JOIN VEICULO v ON l.placaVeiculo = v.Placa
JOIN MOTORISTA m ON l.habilitacaoMotorista = m.Habilitacao;
-- Esta consulta junta loca��es com detalhes de ve�culos e motoristas usando EXISTS

-- 10. Listar a quilometragem m�dia dos ve�culos por tipo, para o �ltimo m�s usando IN
SELECT Tipo, AVG(Quilometragem)
FROM TIPO_VEICULO tv
WHERE idVeiculo IN (SELECT idVeiculo FROM VEICULO WHERE dataQuilometragem >= DATEADD(month, -1, GETDATE()))
GROUP BY Tipo;
-- Esta consulta calcula a quilometragem m�dia dos ve�culos por tipo para o �ltimo m�s usando IN

-- MODIFICA��ES

-- 1. Atualizar o endere�o dos clientes baseado na nova filial onde est� o ve�culo deles
UPDATE c
SET c.Endereco = f.Localizacao
FROM CLIENTE c
JOIN VEICULO v ON c.idCliente = v.idCliente
JOIN FILIAL f ON v.idFilial = f.idFilial
WHERE v.idFilial IN (1, 2, 3);
-- Esta atualiza��o altera o endere�o dos clientes para a localiza��o da nova filial do ve�culo deles

-- 2. Atualizar a data de vencimento da habilita��o dos motoristas para 1 ano depois da data atual
UPDATE m
SET m.dataVencimento = DATEADD(year, 1, GETDATE())
FROM MOTORISTA m
JOIN LOCACAO l ON m.Habilitacao = l.habilitacaoMotorista;
-- Esta atualiza��o define a nova data de vencimento da habilita��o dos motoristas para 1 ano depois da data atual

-- 3. Atualizar a quilometragem dos ve�culos ap�s revis�o
UPDATE v
SET v.Quilometragem = rv.Quilometragem
FROM VEICULO v
JOIN REVISAO rv ON v.idVeiculo = rv.idVeiculo
WHERE rv.dataRevisao >= DATEADD(month, -1, GETDATE());
-- Esta atualiza��o define a quilometragem dos ve�culos para o valor ap�s a revis�o, no �ltimo m�s

-- 4. Excluir as loca��es cujo ve�culo foi vendido
DELETE l
FROM LOCACAO l
JOIN VEICULO v ON l.placaVeiculo = v.Placa
WHERE v.Vendido = 1;
-- Esta exclus�o remove as loca��es cujo ve�culo foi vendido

-- 5. Excluir as reservas que t�m data de retirada passada
DELETE r
FROM RESERVA r
JOIN CLIENTE c ON r.idCliente = c.idCliente
WHERE r.dataRetirada < GETDATE();
-- Esta exclus�o remove as reservas com data de retirada no passado
