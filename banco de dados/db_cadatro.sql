CREATE DATABASE IF NOT EXISTS db_cadastro COLLATE utf8mb4_general_ci CHARSET utf8mb4;

USE db_cadastro;

CREATE TABLE IF NOT EXISTS tb_usuario(
	id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    cpf VARCHAR(100),
    sexo VARCHAR(100),
    endereco VARCHAR(150),
    curso VARCHAR(20),
    matricula VARCHAR(50)
)AUTO_INCREMENT = 1;

-- alter table tb_usuario modify cpf VARCHAR(100);

SELECT * FROM tb_usuario;	

describe tb_usuario;

