-- =========================================
-- CRIAÇÃO DO BANCO
-- =========================================

--CREATE DATABASE loja_exemplo;
USE loja_exemplo;

-- =========================================
-- TABELA MARCA
-- =========================================

CREATE TABLE marca (
    cod_marca INT PRIMARY KEY AUTO_INCREMENT,
    nome_marca VARCHAR(100) NOT NULL
);

-- =========================================
-- TABELA CIDADE
-- =========================================

CREATE TABLE cidade (
    cod_cidade INT PRIMARY KEY AUTO_INCREMENT,
    cidade VARCHAR(100) NOT NULL,
    estado CHAR(2) NOT NULL
);

-- =========================================
-- TABELA CLIENTE
-- =========================================

CREATE TABLE cliente (
    cod_cli INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20),
    cod_cidade INT,
    
    CONSTRAINT fk_cliente_cidade
        FOREIGN KEY (cod_cidade)
        REFERENCES cidade(cod_cidade)
);

-- =========================================
-- TABELA PRODUTO
-- =========================================

CREATE TABLE produto (
    cod_prod INT PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(150) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    cod_marca INT,
    
    CONSTRAINT fk_produto_marca
        FOREIGN KEY (cod_marca)
        REFERENCES marca(cod_marca)
);

-- =========================================
-- TABELA VENDA
-- =========================================

CREATE TABLE venda (
    num_nota INT PRIMARY KEY AUTO_INCREMENT,
    data DATE NOT NULL,
    quantidade INT NOT NULL,
    cod_prod INT,
    cod_cli INT,
    
    CONSTRAINT fk_venda_produto
        FOREIGN KEY (cod_prod)
        REFERENCES produto(cod_prod),
        
    CONSTRAINT fk_venda_cliente
        FOREIGN KEY (cod_cli)
        REFERENCES cliente(cod_cli)
);

-- =========================================
-- INSERTS - MARCA
-- =========================================

INSERT INTO marca (nome_marca) VALUES
('Samsung'),
('Apple'),
('Dell'),
('Lenovo');

-- =========================================
-- INSERTS - CIDADE
-- =========================================

INSERT INTO cidade (cidade, estado) VALUES
('São Paulo', 'SP'),
('Campinas', 'SP'),
('Belo Horizonte', 'MG'),
('Curitiba', 'PR');

-- =========================================
-- INSERTS - CLIENTE
-- =========================================

INSERT INTO cliente (nome, telefone, cod_cidade) VALUES
('João Silva', '(11)99999-1111', 1),
('Maria Oliveira', '(19)98888-2222', 2),
('Carlos Souza', '(31)97777-3333', 3),
('Ana Costa', '(41)96666-4444', 4);

-- =========================================
-- INSERTS - PRODUTO
-- =========================================

INSERT INTO produto (descricao, preco, cod_marca) VALUES
('Galaxy S24', 4999.90, 1),
('iPhone 15', 7999.90, 2),
('Notebook Inspiron', 4200.00, 3),
('ThinkPad X1', 9500.00, 4);

-- =========================================
-- INSERTS - VENDA
-- =========================================

INSERT INTO venda (data, quantidade, cod_prod, cod_cli) VALUES
('2026-05-01', 2, 1, 1),
('2026-05-02', 1, 2, 2),
('2026-05-03', 3, 3, 3),
('2026-05-04', 1, 4, 4),
('2026-05-05', 2, 1, 2);

-- =========================================
-- CONSULTA EXEMPLO
-- =========================================

SELECT
    v.num_nota,
    v.data,
    c.nome AS cliente,
    p.descricao AS produto,
    m.nome_marca AS marca,
    v.quantidade,
    p.preco,
    (v.quantidade * p.preco) AS total
FROM venda v
JOIN cliente c ON c.cod_cli = v.cod_cli
JOIN produto p ON p.cod_prod = v.cod_prod
JOIN marca m ON m.cod_marca = p.cod_marca;