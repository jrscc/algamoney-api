CREATE TABLE categoria(
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL
)ENGINE=innoDB DEFAULT charset=utf8;

INSERT INTO categoria (nome) values ('lazer');
INSERT INTO categoria (nome) values ('alimentação');
INSERT INTO categoria (nome) values ('supermercado');
INSERT INTO categoria (nome) values ('farmácia');
INSERT INTO categoria (nome) values ('outros');
