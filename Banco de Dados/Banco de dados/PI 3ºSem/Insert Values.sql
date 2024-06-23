INSERT INTO LOCALIZACAO (Logradouro, nomeLogradouro, Numero_ou_Km, Andar, Complemento, Bairro, Cidade, Estado, CEP)
VALUES 
    ('Rua', 'das Flores', 100, NULL, 'Bloco A', 'Centro', 'São Paulo', 'SP', '01001000'),
    ('Avenida', 'das Palmeiras', 500, 5, 'Sala 501', 'Jardins', 'São Paulo', 'SP', '01415000'),
    ('Rua', 'do Comércio', 300, NULL, NULL, 'Centro', 'Rio de Janeiro', 'RJ', '20010000'),
    ('Avenida', 'Principal', 200, NULL, 'Apto 102', 'Centro', 'Belo Horizonte', 'MG', '30010000'),
    ('Rua', 'da Praia', 50, 2, 'Sala 201', 'Beira Mar', 'Florianópolis', 'SC', '88010000'),
    ('Avenida', 'Brasil', 1500, 10, 'Conjunto 1001', 'Centro', 'São Paulo', 'SP', '01020000'),
    ('Estrada', 'dos Ipês', 3000, NULL, 'Casa 1', 'Jardim Botânico', 'Curitiba', 'PR', '80050000'),
    ('Rodovia', 'Castelo Branco', 50, NULL, NULL, 'Barra Funda', 'São Paulo', 'SP', '01150000'),
    ('Rua', 'do Bosque', 200, 3, 'Ap 302', 'Bosque dos Eucaliptos', 'São José dos Campos', 'SP', '12233000'),
    ('Avenida', 'Paulista', 1000, 15, 'Sala 1501', 'Bela Vista', 'São Paulo', 'SP', '01310000');

INSERT INTO CLIENTE (Nome, idLocalizacao)
VALUES 
    ('Maria da Silva', 1),
    ('José Oliveira',  2),
    ('Ana Souza', 3),
    ('Carlos Santos', 4),
    ('Juliana Lima', 5),
    ('Roberto Almeida', 6),
    ('Patrícia Ferreira', 7),
    ('Fernando Costa', 8),
    ('Luciana Oliveira', 9),
    ('Ricardo Santos', 10);

INSERT INTO P_FISICA (CPF, Sexo, Nascimento, idCliente)
VALUES 
    ('12345678900', 'F', '1995-08-20', 1),
    ('98765432100', 'M', '1980-04-10', 2),
    ('11122233344', 'F', '2000-12-05', 3),
    ('55566677788', 'M', '1992-03-15', 4),
    ('99988877766', 'F', '1988-11-30', 5);

INSERT INTO P_JURIDICA (CNPJ, IE, idCliente)
VALUES 
    ('12345678000195', '123456789', 6),
    ('98765432000101', '987654321', 7),
    ('11223344556677', '112233445', 8),
    ('55667788990011', '556677889', 9),
    ('99988877700011', '999888777', 10);

INSERT INTO FILIAL (idLocalizacao)
VALUES 
    (1),
    (3),
    (5),
    (7),
    (9);

INSERT INTO TIPO_VEICULO (Tipo, horasLimpeza, quilometragemMediaDiaria)
VALUES 
    ('SUV', 3, 120),
    ('Caminhão', 4, 200),
    ('Van', 2, 150),
    ('Moto', 1, 80),
    ('Utilitário', 2, 100);

INSERT INTO VEICULO (Placa, numChassis, numMotor, Cor, Quilometragem, dataQuilometragem, ultimaQuilometragem, idTipo, idFilial)
VALUES 
    ('XYZ5678', '789XYZ123ABC', '456DEF789', 'Preto', 60000, '2023-02-20', 58000, 1, 2),
    ('ABC2345', '234ABC567DEF', '901GHI234', 'Branco', 90000, '2022-10-10', 88000, 2, 4),
    ('DEF9012', '567DEF890GHI', '234JKL567', 'Azul', 80000, '2023-04-15', 78000, 3, 5),
    ('GHI5678', '901GHI234JKL', '567MNO890', 'Verde', 70000, '2023-01-05', 68000, 4, 2),
    ('JKL1234', '234JKL567MNO', '890PQR123', 'Vermelho', 95000, '2023-06-25', 93000, 5, 1);

INSERT INTO T_AUTOM_CAM_PASS (Tamanho, numPassageiros, arCondicionado, Radio, tocaFitas, CD, direcaoHidraulica, cambioAutomatico, idTipo)
VALUES 
    (5.0, 7, 1, 1, 0, 1, 1, 1, 1),
    (10.0, 2, 1, 1, 0, 1, 0, 0, 3),
    (3.5, 2, 1, 1, 0, 1, 0, 0, 4),
    (4.0, 5, 1, 1, 0, 1, 1, 1, 5),
    (6.0, 3, 1, 1, 0, 1, 0, 0, 2);

INSERT INTO T_CAM_CARGA (capacidadeCarga, idTipo)
VALUES 
    (5000.0, 2),
    (3000.0, 4),
    (2000.0, 1),
    (4000.0, 3),
    (6000.0, 5);

INSERT INTO REVISAO (numRevisao, Quilometragem, idTipo)
VALUES 
    (4, 60000, 1),
    (5, 90000, 2),
    (6, 80000, 3),
    (7, 70000, 4),
    (8, 95000, 5);

INSERT INTO MOTORISTA (Habilitacao, dataVencimento, Identidade, Nome, idCliente)
VALUES 
    ('11122233344', '2026-03-20', 'RG1112223', 'Carla Souza', 3),
    ('55566677788', '2023-12-10', 'RG5556667', 'Ricardo Lima', 4),
    ('99988877766', '2027-01-05', 'RG9998887', 'Camila Costa', 5),
    ('77788899900', '2025-08-15', 'RG7778889', 'Pedro Rocha', 7),
    ('44455566677', '2024-04-30', 'RG4445556', 'Juliana Pereira', 9);

INSERT INTO RESERVA (dataRetirada, dataDevolucao, idFilialOrigem, idFilialDestino, idCliente, idTipo)
VALUES 
    ('2026-07-15', '2026-07-20', 1, 2, 1, 1),
    ('2024-08-10', '2025-08-15', 2, 3, 2, 2),
    ('2025-09-05', '2026-09-10', 3, 4, 3, 3),
    ('2024-10-20', '2024-10-25', 4, 5, 4, 4),
    ('2024-11-15', '2024-11-20', 5, 1, 5, 5);

INSERT INTO LOCACAO (dataRetirada, dataDevolucao, placaVeiculo, idFilialDestino, habilitacaoMotorista)
VALUES 
    ('2025-07-15', '2025-08-10', 'XYZ5678', 2, '11122233344'),
    ('2024-08-10', '2024-11-15', 'ABC2345', 3, '55566677788'),
    ('2026-09-05', '2026-10-20', 'DEF9012', 4, '99988877766'),
    ('2024-10-20', '2024-10-25', 'GHI5678', 5, '77788899900'),
    ('2025-11-15', '2025-11-20', 'JKL1234', 1, '44455566677');