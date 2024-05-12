INSERT INTO CLIENTE (Nome, Endereco) VALUES
('João da Silva', 'Rua das Flores, 123'),
('Maria Oliveira', 'Avenida dos Pássaros, 456'),
('Pedro Santos', 'Rua das Árvores, 789'),
('Ana Souza', 'Avenida das Montanhas, 321'),
('Lucas Pereira', 'Rua das Pedras, 654');

INSERT INTO P_FISICA (CPF, Sexo, Nascimento, ID_Cliente) VALUES
('123.456.789-01', 1, '1980-05-10', 1),
('987.654.321-09', 0, '1992-11-15', 2),
('456.789.123-01', 1, '1975-03-20', 3),
('789.123.456-01', 1, '1988-09-05', 4),
('654.321.987-09', 0, '1983-07-25', 5);

INSERT INTO P_JURIDICA (CNPJ, IE, ID_Cliente) VALUES
('12.345.678/0001-01', 123456789, 1),
('98.765.432/0001-09', 987654321, 2),
('45.678.912/0001-01', NULL, 3),
('78.912.345/0001-01', NULL, 4),
('65.432.198/0001-09', NULL, 5);

INSERT INTO FILIAL (Localizacao) VALUES
('Centro'),
('Zona Sul'),
('Zona Norte'),
('Zona Leste'),
('Zona Oeste');

INSERT INTO VEICULO (Placa, Cor, Quilometragem, Data_Quilometragem, Ultima_Quilometragem, ID_Veiculo, ID_Filial) VALUES
('ABC1234', 'Branco', 10000, '2021-01-01', 5000, 1, 1),
('DEF5678', 'Preto', 20000, '2021-01-01', 10000, 2, 2),
('GHI9012', 'Vermelho', 15000, '2021-01-01', 7500, 3, 3),
('JKL3456', 'Azul', 18000, '2021-01-01', 9000, 4, 4),
('MNO7890', 'Verde', 12000, '2021-01-01', 6000, 5, 5);

INSERT INTO TIPO_VEICULO (Tipo, Horas_Limpeza, Quilometragem_Media_Diaria) VALUES
('Caminhão Baú', 5, 100),
('Caminhão Caçamba', 6, 120),
('Carreta', 7, 150),
('Carreto', 8, 80),
('Caminhão Pipa', 9, 130);

INSERT INTO T_AUTOM_CAM_PASS (Tamanho, Numero_passageiros, Ar_Condicionado, Radio, Toca_Fitas, CD, Direcao_hidraulica, Cambio_automatico, ID_Veiculo) VALUES
(1, 3, 0, 1, 1, 1, 1, 1, 1),
(2, 2, 1, 0, 1, 1, 1, 1, 2),
(3, 2, 1, 1, 0, 1, 1, 1, 3),
(4, 2, 1, 1, 1, 0, 1, 1, 4),
(5, 2, 1, 1, 1, 1, 0, 0, 5);

INSERT INTO T_CAM_CARGA (Capacidade_Carga, ID_Veiculo) VALUES
(10000, 1),
(12000, 2),
(15000, 3),
(8000, 4),
(13000, 5);

INSERT INTO REVISAO (Quilometragem, ID_Veiculo) VALUES
(5000, 1),
(10000, 2),
(7500, 3),
(9000, 4),
(6000, 5);

INSERT INTO MOTORISTA (Habilitacao, Data_Vencimento, Identidade, Nome, ID_Cliente) VALUES
(12345678901, '2025-01-01', 'RG1234567', 'José Ferreira', 1),
(23456789012, '2026-02-02', 'RG2345678', 'Ana Oliveira', 2),
(34567890123, '2027-03-03', 'RG3456789', 'Marcos Santos', 3),
(45678901234, '2028-04-04', 'RG4567890', 'Carla Silva', 4),
(56789012345, '2029-05-05', 'RG5678901', 'Rafael Souza', 5);

INSERT INTO RESERVA (N_Reserva, Data_Retirada, Data_Devolucao, ID_Filial_Origem, ID_Filial_Destino, ID_Cliente, ID_Veiculo) VALUES
(1, '2021-01-10', '2021-01-15', 1, 2, 1, 1),
(2, '2021-02-05', '2021-02-10', 2, 3, 2, 2),
(3, '2021-03-15', '2021-03-20', 3, 4, 3, 3),
(4, '2021-04-20', '2021-04-25', 4, 5, 4, 4),
(5, '2021-05-25', '2021-05-30', 5, 1, 5, 5);

INSERT INTO LOCACAO (N_Locacao, Data_Retirada, Data_Devolucao, Placa_Veiculo, ID_Filial_Destino, Habilitacao_Motorista) VALUES
(1, '2021-01-10', '2021-01-15', 'ABC1234', 2, 12345678901),
(2, '2021-02-05', '2021-02-10', 'DEF5678', 3, 23456789012),
(3, '2021-03-15', '2021-03-20', 'GHI9012', 4, 34567890123),
(4, '2021-04-20', '2021-04-25', 'JKL3456', 5, 45678901234),
(5, '2021-05-25', '2021-05-30', 'MNO7890', 1, 56789012345);

INSERT INTO LOCADORA (CNPJ, Nome, Endereco, Telefone) VALUES
('12.345.678/0001-01', 'Locadora ABC', 'Avenida Paulista, 100', '1234567890'),
('98.765.432/0001-09', 'Locadora DEF', 'Rua Augusta, 200', '2345678901'),
('45.678.912/0001-01', 'Locadora GHI', 'Rua Oscar Freire, 300', '3456789012'),
('78.912.345/0001-01', 'Locadora JKL', 'Avenida Faria Lima, 400', '4567890123'),
('65.432.198/0001-09', 'Locadora MNO', 'Avenida Rebouças, 500', '5678901234');