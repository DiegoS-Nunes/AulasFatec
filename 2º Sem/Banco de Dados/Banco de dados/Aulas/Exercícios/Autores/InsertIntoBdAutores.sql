INSERT INTO AREA_CONHECIMENTO VALUES (1,'Filosofia'),
(2,'Matemática'),
(3,'Programação'),
(4,'Engenharia'),
(5,'Geografia');

INSERT INTO AUTOR VALUES (1,'Alfred L. Brown', '(11)1234-5678','Martinpolku 29 45140 KOUVOLA'),
(2,'Ralph Scholz', '(61)9595-7547', '4041 HAFRSFJORD'),
(3,'Mateus Alves Fernandes', '(11)7147-6349', 'Rua Cardeal Arcoverde, 727, São Paulo-SP'),
(4,'Laurits A. Johansen', '(41)7673-2290', ''),
(5,'Yegor Demidov', '(79)3277-5846', 'Via San Domenico Soriano, 140, 98124-Gazzi ME');

INSERT INTO TITULOS (COD_TITULO, NOME_TITULO, COD_AREA_CONHECIMENTO) VALUES (1, 'O Mundo Como Vontade e Representação', 1),
(2, 'Matemática para Otimização de Processos', 2),
(3, 'Introdução à Programação Para Engenharia em Python', 3),
(4, 'Engenharia de Software: Uma Abordagem Profissional', 4),
(5, 'Geografia: História Crítica', 5);

inserT INTO AUTOR_LIVRO VALUES (1,2),
(2,1),
(3,3),
(4,4);

INSERT INTO EDITOR (1, "Rodrigo", "(11)1234-5678", "Rua dos bobos"),
(2, "Bruna", "(11)1234-5678", "Rua dos limoeiros"),
(3, "Leonardo", "(11)1234-5678", "Rua catanduva");

insert into EDITORAS (1, "Ativa", "(11)1234-5678", "Rua das galáxias"),
(2, "Única", "(11)1234-5678", "Rua dos babuínos"),
(3, "Natural", "(11)1234-5678", "Rua Arujá");

INSErt into EDITORAS_LIVRO (1, 4),
(2, 3),
(3, 3);

INSERT INTO EDITOR_MIDIA (1,4),
(2,3),
(3,3);

INSERT INTO EDITOR_REVISTA (1,4),
(2,3),
(3,3);

INSERT into EXEMPLAR (1,2),
(2,1),
(3,3),
(4,4);

insert into LIVRO (1, "ISBN", 4),
(2, "ISBN", 3),
(3, "ISBN", 2),
(4, "ISBN", 1);

insert into MIDIA (1, 4),
(2, 3),
(3, 2),
(4, 1);