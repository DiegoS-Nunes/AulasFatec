CREATE TABLE CLIENTE (
    idCliente INT PRIMARY KEY IDENTITY(1,1),
    Nome VARCHAR(254) NOT NULL,
    Endereco VARCHAR(254) NOT NULL
);

-- Especialização de CLIENTE
CREATE TABLE P_FISICA (
    CPF CHAR(11) NOT NULL UNIQUE,
    Sexo CHAR(1) NOT NULL, 
    Nascimento DATE NOT NULL,
    idCliente INT NOT NULL,
    FOREIGN KEY (idCliente) REFERENCES CLIENTE(idCliente)
);

-- Especialização de CLIENTE
CREATE TABLE P_JURIDICA (
    CNPJ CHAR(14) NOT NULL UNIQUE, 
    IE CHAR(9) NOT NULL UNIQUE,
    idCliente INT NOT NULL,
    FOREIGN KEY (idCliente) REFERENCES CLIENTE(idCliente)
);

CREATE TABLE FILIAL (
    idFilial INT PRIMARY KEY IDENTITY(1,1),
    Localizacao VARCHAR(254)
);

CREATE TABLE TIPO_VEICULO (
    idVeiculo INT PRIMARY KEY IDENTITY(1,1),
    Tipo VARCHAR(254) NOT NULL, 
    horasLimpeza INT NOT NULL,
    quilometragemMediaDiaria INT NOT NULL
);

CREATE TABLE VEICULO (
    Placa CHAR(7) NOT NULL PRIMARY KEY,
    NºChassis VARCHAR(254), 
    NºMotor VARCHAR(254), 
    Cor VARCHAR(254) NOT NULL, 
    Quilometragem FLOAT NOT NULL,
    dataQuilometragem DATE NOT NULL, 
    ultimaQuilometragem FLOAT NOT NULL,
    idVeiculo INT NOT NULL,
    idFilial INT NOT NULL,
    FOREIGN KEY (idVeiculo) REFERENCES TIPO_VEICULO(idVeiculo),
    FOREIGN KEY (idFilial) REFERENCES FILIAL(idFilial)
);

-- Especialização de TIPO_VEICULO
CREATE TABLE T_AUTOM_CAM_PASS (
    Tamanho FLOAT NOT NULL, 
    NºPassageiros INT NOT NULL, 
    arCondicionado BIT NOT NULL,
    Radio BIT NOT NULL, 
    tocaFitas BIT NOT NULL, 
    CD BIT NOT NULL, 
    direcaoHidraulica BIT NOT NULL, 
    cambioAutomatico BIT NOT NULL,
    idVeiculo INT NOT NULL,
    FOREIGN KEY (idVeiculo) REFERENCES TIPO_VEICULO(idVeiculo)
);

-- Especialização de TIPO_VEICULO
CREATE TABLE T_CAM_CARGA (
    capacidadeCarga FLOAT NOT NULL,
    idVeiculo INT NOT NULL,
    FOREIGN KEY (idVeiculo) REFERENCES TIPO_VEICULO(idVeiculo)
);

CREATE TABLE REVISAO (
	NºRevisão INT NOT NULL PRIMARY KEY,
    Quilometragem FLOAT NOT NULL,
    idVeiculo INT NOT NULL,
    FOREIGN KEY (idVeiculo) REFERENCES TIPO_VEICULO(idVeiculo)
);

CREATE TABLE MOTORISTA (
    Habilitacao CHAR(11) PRIMARY KEY,
    dataVencimento DATE NOT NULL,
    Identidade VARCHAR(254) NOT NULL,
    Nome VARCHAR(254) NOT NULL,
    idCliente INT,
    FOREIGN KEY (idCliente) REFERENCES CLIENTE(idCliente)
);

CREATE TABLE RESERVA (
    NºReserva INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    dataRetirada DATE NOT NULL, 
    dataDevolucao DATE NOT NULL,
    idFilialOrigem INT NOT NULL,
    idFilialDestino INT NOT NULL,
    idCliente INT NOT NULL,
    idVeiculo INT NOT NULL,
    FOREIGN KEY (idFilialOrigem) REFERENCES FILIAL(idFilial),
    FOREIGN KEY (idFilialDestino) REFERENCES FILIAL(idFilial),
    FOREIGN KEY (idCliente) REFERENCES CLIENTE(idCliente),
    FOREIGN KEY (idVeiculo) REFERENCES TIPO_VEICULO(idVeiculo)
);

CREATE TABLE LOCACAO (
    NºLocacao INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    dataRetirada DATE NOT NULL, 
    dataDevolucao DATE NOT NULL,
    placaVeiculo CHAR(7) UNIQUE NOT NULL,
    idFilialDestino INT NOT NULL,
    habilitacaoMotorista CHAR(11) NOT NULL,
    FOREIGN KEY (idFilialDestino) REFERENCES FILIAL(idFilial),
    FOREIGN KEY (placaVeiculo) REFERENCES VEICULO(Placa),
    FOREIGN KEY (habilitacaoMotorista) REFERENCES MOTORISTA(habilitacao)
);

-- Não se relaciona com nenhuma tabela
CREATE TABLE LOCADORA (
    CNPJ CHAR(14) NOT NULL PRIMARY KEY,
    Nome VARCHAR(254) NOT NULL,
    Endereco VARCHAR(254) NOT NULL,
    Telefone CHAR(12)
);