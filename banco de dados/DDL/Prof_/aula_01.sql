CREATE DATABASE IF NOT EXISTS psul COLLATE utf8mb4_general_ci CHARSET utf8mb4;

USE db_psul;

CREATE TABLE IF NOT EXISTS cliente(
	id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(60)
);


-- conecâo com banco de dados 
-- flask cm sqlalchemy - mysql(entender a concexâo, camadas)
-- Django crud com orm (completo)
