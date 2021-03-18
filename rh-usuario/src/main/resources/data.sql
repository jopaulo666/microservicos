INSERT INTO tb_usuario (nome, email, senha) VALUES ('Nina Brown', 'nina@gmail.com', '$2a$10$5llfu5.8vivzoTwbfnTJ6.l0Rm4b1YIt.NM48NBi9YydpAneAX2mC');
INSERT INTO tb_usuario (nome, email, senha) VALUES ('Leia Red', 'leia@gmail.com', '$2a$10$5llfu5.8vivzoTwbfnTJ6.l0Rm4b1YIt.NM48NBi9YydpAneAX2mC');

INSERT INTO tb_role (role_nome) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (role_nome) VALUES ('ROLE_ADMIN');

INSERT INTO tb_usuario_role (usuario_id, role_id) VALUES (1, 1);
INSERT INTO tb_usuario_role (usuario_id, role_id) VALUES (2, 1);
INSERT INTO tb_usuario_role (usuario_id, role_id) VALUES (2, 2);