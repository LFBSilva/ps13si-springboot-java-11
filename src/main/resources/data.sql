/* deleta a tabela de grupo se ela existir */
DROP TABLE IF EXISTS cursos;
/* cria a tabela com os campos necessários */
CREATE TABLE cursos(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(250) NOT NULL
);
/* insere os dados padrões da aplicação */
INSERT INTO cursos(nome) VALUES
('UX'),('Design'),('Desenvolvimento_BackEnd,'),('Desenvolvimento_FrontEnd,'),
('Desenvolvimento_Mobile,'),('DevOps,'),('DevSecOps,'),('Machine_Learning,'),('IA_Inteligencia_Artificial');


DROP TABLE IF EXISTS usuarios;
CREATE TABLE usuarios(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(250) NOT NULL,
	login VARCHAR(250) NOT NULL,
	email VARCHAR(250) NOT NULL,
	dataNascimento VARCHAR(250) NOT NULL,
	genero VARCHAR(250) NOT NULL,
	telefone VARCHAR(250) NOT NULL,
	senha VARCHAR(250) NOT NULL
);
INSERT INTO usuarios(nome, login, email, dataNascimento, genero, telefone, senha) VALUES
('Felipe','felipe','felipe@ps13si.com.br','XX/XX/XXXX','masculino','999999999','123456'),
('Henrique','henrique','henrique@ps13si.com.br','XX/XX/XXXX','masculino','988888888','123456'),
('Pedro','pedro','pedro@ps13si.com.br','XX/XX/XXXX','masculino','977777777','123456'),
('Tiago','tiago','tiago@ps13si.com.br','XX/XX/XXXX','masculino','966666666','123456');


