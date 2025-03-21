CREATE DATABASE IF NOT EXISTS db_empresa COLLATE utf8mb4_general_ci CHARSET utf8mb4;

USE db_empresa;

-- exercicio - 1

CREATE TABLE IF NOT EXISTS tb_funcionarios(
	id_funcionario INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    cargo VARCHAR(50) NOT NULL,
    salario FLOAT(10,2) NOT NULL,
    data_admissao DATE
);
 
 -- exercicio - 2
 
INSERT INTO tb_funcionarios(nome, cargo, salario, data_admissao) VALUES ("Matheus", "Professor", '20', "2009-08-06");
INSERT INTO tb_funcionarios(nome, cargo, salario, data_admissao) VALUES ("Guilerme", "Massagista", '200', "2001-08-06");
INSERT INTO tb_funcionarios(nome, cargo, salario, data_admissao) VALUES ("Carlos", "meiocampo", '500000', "2001-08-06");

UPDATE tb_funcionarios SET cargo = "Gerente" WHERE id_funcionario = 1;

SELECT * FROM tb_funcionarios;

-- exercicio - 3
-- lista todos os funcionarios
SELECT nome FROM tb_funcionarios;

-- lista todos os nome gerente

SELECT * FROM tb_funcionarios WHERE cargo = "Gerente";

-- listando todos os funcionarios com salario maior que 5000

SELECT * FROM tb_funcionarios WHERE salario > '5000';

-- liste os funcionarios ordenados por nome

SELECT nome FROM tb_funcionarios ORDER BY nome;

-- exercios 4
-- 1 atualize o salario de um funcionario especifico
UPDATE tb_funcionarios SET salario = '500' WHERE id_funcionario = '1';

-- exclua um funcinario pelo seu id

DELETE FROM tb_funcionarios WHERE id_funcionario = '2';

SELECT * FROM tb_funcionarios;

-- exercicio 5
-- adicione uma nova coluna chamada departamento (varchar) na tabela
ALTER TABLE tb_funcionarios ADD departamento VARCHAR(50);
SELECT * FROM tb_funcionarios;

-- modifique a coluna salario para permitir valores até 15000
ALTER TABLE tb_funcionarios MODIFY salario FLOAT(5,2) CHECK (salario < 15000);

-- remova a coluna data_admissao da tabela
ALTER TABLE tb_funcionarios DROP COLUMN data_admissao;

-- exercio 6
-- use o truncate para remover todos os dados da tabela funcionarios sem excluir a estrura
TRUNCATE TABLE tb_funcionarios;

-- exclua a tabela funcionario completamente
DROP TABLE tb_funcionarios;

-- exclua o danco de dados empresa
DROP DATABASE db_empresa;
























