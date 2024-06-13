CREATE TABLE LOCALIZACAO (
	idLocalizacao INT PRIMARY KEY IDENTITY(1,1),
	CEP CHAR(8),
	Tipo VARCHAR(254) NOT NULL,
	Logradouro VARCHAR(254) NOT NULL,
	Nome VARCHAR(254) NOT NULL,
	Num INT,
	Andar INT,
	Bairro VARCHAR(254),
	Cidade VARCHAR(254) NOT NULL,
	UF CHAR(2) NOT NULL,
	País VARCHAR(254)
);

CREATE TABLE CLIENTE (
    idCliente INT PRIMARY KEY IDENTITY(1,1),
    Nome VARCHAR(254) NOT NULL,
    idLocalizacao INT NOT NULL,
	FOREIGN KEY (idLocalizacao) REFERENCES LOCALIZACAO(idLocalizacao) NOT NULL
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
	FOREIGN KEY (idLocalizacao) REFERENCES LOCALIZACAO(idLocalizacao) NOT NULL
);

CREATE TABLE TIPO_VEICULO (
    idTipo INT PRIMARY KEY IDENTITY(1,1),
    Tipo VARCHAR(254) NOT NULL, 
    horasLimpeza INT NOT NULL,
    quilometragemMediaDiaria INT NOT NULL
);

CREATE TABLE VEICULO (
    Placa CHAR(7) NOT NULL PRIMARY KEY,
    NumChassis VARCHAR(254), 
    NumMotor VARCHAR(254), 
    Cor VARCHAR(254) NOT NULL, 
    Quilometragem FLOAT NOT NULL,
    dataQuilometragem DATE NOT NULL, 
    ultimaQuilometragem FLOAT NOT NULL,
    idTipo INT,
    idFilial INT,
    FOREIGN KEY (idTipo) REFERENCES TIPO_VEICULO(idTipo),
    FOREIGN KEY (idFilial) REFERENCES FILIAL(idFilial)
);

-- Especialização de TIPO_VEICULO
CREATE TABLE T_AUTOM_CAM_PASS (
    Tamanho FLOAT NOT NULL, 
    NumPassageiros INT NOT NULL, 
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
	NumRevisao INT NOT NULL PRIMARY KEY,
    Quilometragem FLOAT NOT NULL,
    idTipo INT,
    FOREIGN KEY (idTipo) REFERENCES TIPO_VEICULO(idTipo)
);

CREATE TABLE MOTORISTA (
    Habilitacao CHAR(11) PRIMARY KEY,
    dataVencimento DATE NOT NULL,
    Identidade VARCHAR(10) NOT NULL,
    Nome VARCHAR(254) NOT NULL,
    idCliente INT,
    FOREIGN KEY (idCliente) REFERENCES CLIENTE(idCliente) NOT NULL
);

CREATE TABLE RESERVA (
    NumReserva INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    dataRetirada DATE NOT NULL, 
    dataDevolucao DATE NOT NULL,
    idFilialOrigem INT,
    idFilialDestino INT,
    idCliente INT,
    idTipo INT,
    FOREIGN KEY (idFilialOrigem) REFERENCES FILIAL(idFilial),
    FOREIGN KEY (idFilialDestino) REFERENCES FILIAL(idFilial),
    FOREIGN KEY (idCliente) REFERENCES CLIENTE(idCliente),
    FOREIGN KEY (idTipo) REFERENCES TIPO_VEICULO(idTipo)
);

CREATE TABLE LOCACAO (
    NumLocacao INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    dataRetirada DATE NOT NULL, 
    dataDevolucao DATE NOT NULL,
    placaVeiculo CHAR(7) UNIQUE,
    idFilialDestino INT,
    habilitacaoMotorista CHAR(11),
    FOREIGN KEY (idFilialDestino) REFERENCES FILIAL(idFilial),
    FOREIGN KEY (placaVeiculo) REFERENCES VEICULO(Placa),
    FOREIGN KEY (habilitacaoMotorista) REFERENCES MOTORISTA(habilitacao)
);