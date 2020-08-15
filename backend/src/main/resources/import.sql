INSERT INTO usuario(data_criacao, habilitado, login, senha) values (CURDATE(),1,'operador','$2y$12$0YYQTBwnE79MmM8l8wOeduFrP9rfOK8kjKtI4wMJrPHiUIPMTVCYa');
INSERT INTO usuario(data_criacao, habilitado, login, senha) values (CURDATE(),1,'administrador','$2y$12$Fsn6Ii2zT7qH3gcCW/o3p.ssCgHjKkJ7GdjFCUZgOqVsqhDFNFEra');
INSERT INTO usuario(data_criacao, habilitado, login, senha) values (CURDATE(),1,'admin','$2y$12$hFs7LmYNDqww2TUe/mo0FuEV9toIVqRChRdB.PosMqlkjrwxCuADa');
INSERT INTO usuario(data_criacao, habilitado, login, senha) values (CURDATE(),1,'teste','$2y$12$EZhPlJsT7ZUm3.f3EjIreuM7WBHDhZtIfh2kixyQ0v/o5O4fOqlRi');

insert into papel(id,nome_papel) values(1, 'ROLE_ADMIN');
insert into papel(id,nome_papel) values(2, 'ROLE_CLIENTE');

INSERT INTO usuario_papel(papelid,usuarioid) values(1,1);
INSERT INTO usuario_papel(papelid,usuarioid) values(1,2);
INSERT INTO usuario_papel(papelid,usuarioid) values(1,3);
INSERT INTO usuario_papel(papelid,usuarioid) values(1,4);

INSERT INTO usuario_papel(papelid,usuarioid) values(2,1);
INSERT INTO usuario_papel(papelid,usuarioid) values(2,2);
INSERT INTO usuario_papel(papelid,usuarioid) values(2,3);
INSERT INTO usuario_papel(papelid,usuarioid) values(2,4);