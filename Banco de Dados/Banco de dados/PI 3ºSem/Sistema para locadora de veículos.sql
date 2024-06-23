CREATE TABLE LOCALIZACAO (
    idLocalizacao INT PRIMARY KEY IDENTITY(1,1),
    Logradouro VARCHAR(50),
    nomeLogradouro VARCHAR(254) NOT NULL,
    Numero_ou_Km INT,
    Andar INT,
    Complemento VARCHAR(255),
    Bairro VARCHAR(255),
    Cidade VARCHAR(255) NOT NULL,
    Estado CHAR(2) NOT NULL,
    CEP CHAR(8)
);

CREATE TABLE CLIENTE (
    idCliente INT PRIMARY KEY IDENTITY(1,1),
    Nome VARCHAR(254) NOT NULL,
    idLocalizacao INT NOT NULL,
    FOREIGN KEY (idLocalizacao) REFERENCES LOCALIZACAO(idLocalizacao)
);

-- Especialização de CLIENTE
CREATE TABLE P_FISICA (
    CPF CHAR(11) NOT NULL UNIQUE,
    Sexo CHAR(1) NOT NULL, 
    Nascimento DATE NOT NULL,
    idCliente INT NOT NULL PRIMARY KEY,
    FOREIGN KEY (idCliente) REFERENCES CLIENTE(idCliente)
);

-- Especialização de CLIENTE
CREATE TABLE P_JURIDICA (
    CNPJ CHAR(14) NOT NULL UNIQUE, 
    IE CHAR(9) NOT NULL UNIQUE,
    idCliente INT NOT NULL PRIMARY KEY,
    FOREIGN KEY (idCliente) REFERENCES CLIENTE(idCliente)
);

CREATE TABLE FILIAL (
    idFilial INT PRIMARY KEY IDENTITY(1,1),
    idLocalizacao INT NOT NULL,
    FOREIGN KEY (idLocalizacao) REFERENCES LOCALIZACAO(idLocalizacao)
);

CREATE TABLE TIPO_VEICULO (
    idTipo INT PRIMARY KEY IDENTITY(1,1),
    Tipo VARCHAR(50) NOT NULL, 
    horasLimpeza INT NOT NULL,
    quilometragemMediaDiaria INT NOT NULL
);

CREATE TABLE VEICULO (
    Placa CHAR(7) NOT NULL PRIMARY KEY,
    numChassis VARCHAR(50), 
    numMotor VARCHAR(50), 
    Cor VARCHAR(50) NOT NULL, 
    Quilometragem FLOAT NOT NULL,
    dataQuilometragem DATE NOT NULL, 
    ultimaQuilometragem FLOAT NOT NULL,
    idTipo INT NOT NULL,
    idFilial INT NOT NULL,
    FOREIGN KEY (idTipo) REFERENCES TIPO_VEICULO(idTipo),
    FOREIGN KEY (idFilial) REFERENCES FILIAL(idFilial)
);

-- Especialização de TIPO_VEICULO
CREATE TABLE T_AUTOM_CAM_PASS (
    Tamanho FLOAT NOT NULL, 
    numPassageiros INT NOT NULL, 
    arCondicionado BIT NOT NULL,
    Radio BIT NOT NULL, 
    tocaFitas BIT NOT NULL, 
    CD BIT NOT NULL, 
    direcaoHidraulica BIT NOT NULL, 
    cambioAutomatico BIT NOT NULL,
    idTipo INT NOT NULL PRIMARY KEY,
    FOREIGN KEY (idTipo) REFERENCES TIPO_VEICULO(idTipo)
);

-- Especialização de TIPO_VEICULO
CREATE TABLE T_CAM_CARGA (
    capacidadeCarga FLOAT NOT NULL,
    idTipo INT NOT NULL PRIMARY KEY,
    FOREIGN KEY (idTipo) REFERENCES TIPO_VEICULO(idTipo)
);

CREATE TABLE REVISAO (
    numRevisao INT NOT NULL PRIMARY KEY,
    Quilometragem FLOAT NOT NULL,
    idTipo INT NOT NULL,
    FOREIGN KEY (idTipo) REFERENCES TIPO_VEICULO(idTipo)
);

CREATE TABLE MOTORISTA (
    Habilitacao CHAR(11) PRIMARY KEY,
    dataVencimento DATE NOT NULL,
    Identidade VARCHAR(50) NOT NULL,
    Nome VARCHAR(254) NOT NULL,
    idCliente INT,
    FOREIGN KEY (idCliente) REFERENCES CLIENTE(idCliente)
);

CREATE TABLE RESERVA (
    numReserva INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    dataRetirada DATE NOT NULL, 
    dataDevolucao DATE NOT NULL,
    idFilialOrigem INT NOT NULL,
    idFilialDestino INT NOT NULL,
    idCliente INT NOT NULL,
    idTipo INT NOT NULL,
    FOREIGN KEY (idFilialOrigem) REFERENCES FILIAL(idFilial),
    FOREIGN KEY (idFilialDestino) REFERENCES FILIAL(idFilial),
    FOREIGN KEY (idCliente) REFERENCES CLIENTE(idCliente),
    FOREIGN KEY (idTipo) REFERENCES TIPO_VEICULO(idTipo)
);

CREATE TABLE LOCACAO (
    numLocacao INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    dataRetirada DATE NOT NULL, 
    dataDevolucao DATE NOT NULL,
    placaVeiculo CHAR(7) NOT NULL,
    idFilialDestino INT NOT NULL,
    habilitacaoMotorista CHAR(11) NOT NULL,
    FOREIGN KEY (idFilialDestino) REFERENCES FILIAL(idFilial),
    FOREIGN KEY (placaVeiculo) REFERENCES VEICULO(Placa),
    FOREIGN KEY (habilitacaoMotorista) REFERENCES MOTORISTA(Habilitacao)
);