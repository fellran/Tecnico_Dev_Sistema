/*
crie os inserts do funcionario,cliente e serviço
inserir 10 resgistro para cada
nao insira o agendamento ainda
salve como desafio2-sql.sql
*/
DESCRIBE funcionario;
DESCRIBE cliente;
DESCRIBE servico;

INSERT INTO funcionario (nome) VALUES ('Felipe'), ('Natan'), ('Guilherme'), ('Lucas'), ('Daniel'), ('Carlos'), ('Yan'), ('Paloma'), ('Jason'), ('Endrick');

INSERT INTO cliente (nome, telefone, email, senha) VALUES
('Ana Silva', '11987654321', 'ana.silva@email.com', 'Senha123!'),
('Bruno Oliveira', '21998765432', 'bruno.oliveira@email.com', 'Senha456@'),
('Carla Rodrigues', '31976543210', 'carla.rodrigues@email.com', 'Senha789#'),
('Daniel Souza', '41965432109', 'daniel.souza@email.com', 'SenhaABC$'),
('Elaine Costa', '51954321098', 'elaine.costa@email.com', 'SenhaDEF%'),
('Fernando Pereira', '61943210987', 'fernando.pereira@email.com', 'SenhaGHI^'),
('Gabriela Santos', '71932109876', 'gabriela.santos@email.com', 'SenhaJKL&'),
('Henrique Lima', '81921098765', 'henrique.lima@email.com', 'SenhaMNO*'),
('Isabela Gomes', '91910987654', 'isabela.gomes@email.com', 'SenhaPQR('),
('João Ribeiro', '12909876543', 'joao.ribeiro@email.com', 'SenhaSTU)');


INSERT INTO servico (nome, valor) VALUES
('Hidratação Capilar Profunda', 65.00),
('Escova Modelada', 55.00),
('Corte Infantil', 30.00),
('Pintura de Unhas em Gel', 70.00),
('Tratamento Facial Anti-idade', 110.00),
('Depilação com Linha', 40.00),
('Massagem Relaxante com Pedras Quentes', 120.00),
('Penteado para Noivas', 200.00),
('Maquiagem para Formaturas', 150.00),
('Tratamento Capilar com Queratina', 90.00);


