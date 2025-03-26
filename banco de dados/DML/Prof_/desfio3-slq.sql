/*
Desafio - SQL 3

1 - Voce vai selecioar todos os clientes.
2 - voce vai selecionar apenas os clientes que possui o dominio:@aluno.senai
*/

-- 1
SELECT * FROM cliente;

-- 2
SELECT nome AS cliente, email AS email_senai FROM cliente WHERE email LIKE '%@aluno.senai.br';

-- 3
SELECT count(id) AS quantidade_cliente FROM cliente;
