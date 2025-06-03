CREATE DATABASE IF NOT EXISTS db_padaria COLLATE utf8mb4_general_ci CHARSET utf8mb4;

USE db_padaria;

CREATE TABLE IF NOT EXISTS tb_usuario (
	id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    email VARCHAR(150) UNIQUE,
    telefone INT
)AUTO_INCREMENT = 1;