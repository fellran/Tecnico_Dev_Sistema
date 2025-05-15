CREATE DATABASE IF NOT EXISTS db_cadastro COLLATE utf8mb4_general_ci CHARSET utf8mb4;

USE db_cadastro;

CREATE TABLE IF NOT EXISTS tb_usuario(
	id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    email VARCHAR(100),
    telefone VARCHAR(20),
    tipo_usuario VARCHAR(50)
)AUTO_INCREMENT = 1;