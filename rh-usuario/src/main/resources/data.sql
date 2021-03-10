INSERT INTO tb_usuario (nome, email, senha) VALUES ('Nina Brown', 'nina@gmail.com', '$2a$10$a1RMl1CAFqYVVYCNO9CFeu.g.3EmHXwm1ND4V20g8Ve5IEuksOfpa');
INSERT INTO tb_usuario (nome, email, senha) VALUES ('Leia Red', 'leia@gmail.com', '$2a$10$a1RMl1CAFqYVVYCNO9CFeu.g.3EmHXwm1ND4V20g8Ve5IEuksOfpa');

INSERT INTO tb_role (role_nome) VALUES ('ROLE_OPERADOR');
INSERT INTO tb_role (role_nome) VALUES ('ROLE_ADMIN');

INSERT INTO tb_usuario_role (usuario_id, role_id) VALUES (1, 1);
INSERT INTO tb_usuario_role (usuario_id, role_id) VALUES (2, 1);
INSERT INTO tb_usuario_role (usuario_id, role_id) VALUES (2, 2);