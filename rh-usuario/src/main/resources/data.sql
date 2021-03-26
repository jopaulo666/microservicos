INSERT INTO tb_usuario (nome, email, senha) VALUES ('Nina Brown', 'nina@gmail.com', '$2a$10$OJ6HqfTJ8SnYnRy77lkD8.FWoRfRm263Ola8GPPkicujVoyVPsSBW');
INSERT INTO tb_usuario (nome, email, senha) VALUES ('Leia Red', 'leia@gmail.com', '$2a$10$OJ6HqfTJ8SnYnRy77lkD8.FWoRfRm263Ola8GPPkicujVoyVPsSBW');

INSERT INTO tb_role (role_nome) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (role_nome) VALUES ('ROLE_ADMIN');

INSERT INTO tb_usuario_role (usuario_id, role_id) VALUES (1, 1);
INSERT INTO tb_usuario_role (usuario_id, role_id) VALUES (2, 1);
INSERT INTO tb_usuario_role (usuario_id, role_id) VALUES (2, 2);