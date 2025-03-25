CREATE DATABASE IF NOT EXISTS db_barbearia COLLATE utf8mb4_general_ci CHARSET utf8mb4;

USE db_barbearia;

CREATE TABLE IF NOT EXISTS tb_cliente (
	id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    whatapp CHAR(13) NOT NULL,
    email VARCHAR(80) UNIQUE
)AUTO_INCREMENT = 1;

-- DML
INSERT INTO tb_cliente (nome, whatapp, email) VALUES('joao', '6134578965423', 'joao@aluno.senai.br');

/*
Exercico
Cnsiderando a nossa barbearia. o Cliente pediu a elaboraão de uma nova tabela de serviços

- nome do serviço
- valor do serviço

Considerando nosso contexto, cria a tabela pesquisa na internet os melhores serviços de uma barbearia e insira no banco de dados (popular) - particular
*/

CREATE TABLE IF NOT EXISTS tb_servico (
	id_servico INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    valor FLOAT(4,2) NOT NULL
)AUTO_INCREMENT = 1;

INSERT INTO tb_servico (nome, valor) VALUES ('Lavagem', 50.80), ('Corte', 20.00), ('Hidrataçâo', 70.00), ('Barba', 20.00), ('Sobrancelha', 50.00);

SELECT * FROM tb_servico;
SELECT * FROM cliente WHERE id = 1;
SELECT nome FROM cliente WHERE id = 1;


/*
Exercicio - 2

- pesquise tdos os serviços cadastrados
- pesquise apenas o servio de id = 3
- pesquise tdos os serviços maiores que R$ 30.00
- pesquise todos s serviços, porem, apenas a coluna nome
*/

SELECT * FROM tb_servico;

SELECT * FROM tb_servico WHERE id_servico = 3;

SELECT * FROM tb_servico WHERE valor > 30.00;

SELECT nome AS servico FROM tb_servico; 















