CREATE DATABASE db_cadastroJFrame COLLATE utf8mb4_general_ci CHARSET utf8mb4;

USE db_cadastroJFrame;

CREATE TABLE tb_usuario(
	id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    cpf SMALLINT,
    sexo VARCHAR(30),
    endereco VARCHAR(100),
    curso VARCHAR(100),
    matricula SMALLINT
)AUTO_INCREMENT = 1;