INSERT INTO CLIENTE (Nome, Endereco) VALUES
('João Silva', 'Rua das Flores, 123'),
('Maria Oliveira', 'Avenida Principal, 456'),
('Pedro Santos', 'Travessa das Árvores, 789'),
('Ana Lima', 'Rua das Pedras, 321'),
('Carlos Pereira', 'Avenida Central, 654');

INSERT INTO P_FISICA (CPF, Sexo, Nascimento, idCliente) VALUES
('12345678900', 'M', '1980-05-15', 1),
('98765432100', 'F', '1995-10-20', 2),
('45678912300', 'M', '1988-03-30', 3),
('78912345600', 'F', '1976-12-10', 4),
('32165498700', 'M', '1992-08-25', 5);

INSERT INTO P_JURIDICA (CNPJ, IE, idCliente) VALUES
('12345678000100', '123456789', 1),
('98765432000100', '987654321', 2),
('45678912000100', '456789123', 3),
('78912345000100', '789123456', 4),
('32165498000100', '321654987', 5);

INSERT INTO FILIAL (Localizacao) VALUES
('Centro'),
('Bairro Novo'),
('Zona Sul'),
('Zona Norte'),
('Vila Rica');

INSERT INTO TIPO_VEICULO (Tipo, horasLimpeza, quilometragemMediaDiaria) VALUES
('Sedan', 4, 120),
('SUV', 6, 150),
('Hatch', 3, 110),
('Picape', 5, 140),
('Caminhão', 8, 200);

INSERT INTO VEICULO (Placa, NºChassis, NºMotor, Cor, Quilometragem, dataQuilometragem, ultimaQuilometragem, idVeiculo, idFilial) VALUES
('ABC1234', '123ABC', 'ABC123', 'Azul', 25000.75, '2024-05-10', 1000.5, 1, 1),
('DEF5678', '456DEF', 'DEF456', 'Preto', 30000.25, '2024-04-15', 800.75, 2, 2),
('GHI9012', '789GHI', 'GHI789', 'Branco', 18000.50, '2024-06-20', 700.25, 3, 3),
('JKL3456', '012JKL', 'JKL012', 'Vermelho', 22000.25, '2024-03-05', 600.50, 4, 4),
('MNO7890', '345MNO', 'MNO345', 'Verde', 27000.75, '2024-02-10', 500.75, 5, 5);

INSERT INTO T_AUTOM_CAM_PASS (Tamanho, NºPassageiros, arCondicionado, Radio, tocaFitas, CD, direcaoHidraulica, cambioAutomatico, idVeiculo) VALUES
(4.3, 5, 1, 1, 0, 1, 1, 1, 1),
(4.5, 7, 1, 1, 0, 1, 1, 1, 2),
(4.0, 5, 1, 1, 0, 1, 1, 1, 3),
(5.0, 3, 1, 1, 0, 1, 1, 1, 4),
(6.0, 2, 1, 1, 0, 1, 1, 1, 5);

INSERT INTO T_CAM_CARGA (capacidadeCarga, idVeiculo) VALUES
(5000, 1),
(7000, 2),
(4500, 3),
(5500, 4),
(8000, 5);

INSERT INTO REVISAO (NºRevisão, Quilometragem, idVeiculo) VALUES
(5,1000.5, 1),
(3,800.75, 2),
(1,700.25, 3),
(4,600.50, 4),
(2,500.75, 5);

INSERT INTO MOTORISTA (Habilitacao, dataVencimento, Identidade, Nome, idCliente) VALUES
('12345678901', '2025-05-15', '1234567', 'João Motorista', 1),
('98765432101', '2024-10-20', '7654321', 'Maria Motorista', 2),
('45678912301', '2023-03-30', '4567891', 'Pedro Motorista', 3),
('78912345601', '2026-12-10', '7891234', 'Ana Motorista', 4),
('32165498701', '2022-08-25', '3216549', 'Carlos Motorista', 5);

INSERT INTO RESERVA (dataRetirada, dataDevolucao, idFilialOrigem, idFilialDestino, idCliente, idVeiculo) VALUES
('2024-06-15', '2024-06-20', 1, 2, 1, 1),
('2024-07-05', '2024-07-10', 2, 3, 2, 2),
('2024-08-10', '2024-08-15', 3, 4, 3, 3),
('2024-09-20', '2024-09-25', 4, 5, 4, 4),
('2024-10-25', '2024-10-30', 5, 1, 5, 5);

INSERT INTO LOCACAO (dataRetirada, dataDevolucao, placaVeiculo, idFilialDestino, habilitacaoMotorista) VALUES
('2024-06-15', '2024-06-20', 'ABC1234', 2, '12345678901'),
('2024-07-05', '2024-07-10', 'DEF5678', 3, '98765432101'),
('2024-08-10', '2024-08-15', 'GHI9012', 4, '45678912301'),
('2024-09-20', '2024-09-25', 'JKL3456', 5, '78912345601'),
('2024-10-25', '2024-10-30', 'MNO7890', 1, '32165498701');

INSERT INTO LOCADORA (CNPJ, Nome, Endereco, Telefone) VALUES
('12345678000100', 'Locadora A', 'Rua Principal, 123', '(11)12345678'),
('98765432000100', 'Locadora B', 'Avenida Central, 456', '(11)98765432'),
('45678912000100', 'Locadora C', 'Travessa das Flores, 789', '(11)45678912'),
('78912345000100', 'Locadora D', 'Rua das Árvores, 321', '(11)78912345'),
('32165498000100', 'Locadora E', 'Avenida dos Pássaros, 654', '(11)32165498');