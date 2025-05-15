CREATE DATABASE IF NOT EXISTS db_concessionaria COLLATE utf8mb4_general_ci CHARSET utf8mb4;

USE db_concessionaria;

CREATE TABLE tb_carro(
	id_carro INT PRIMARY KEY AUTO_INCREMENT,
    marca VARCHAR(100),
    ano SMALLINT,
    tipo VARCHAR(100)
)AUTO_INCREMENT = 1;

SELECT * FROM tb_carro;

