insert into cliente (id, nombre, apellidos, email, telefono, password, direccion, municipio, dni, username, admin) values (1,'Endika', 'Prieto Sanchez', 'prieto@gmail.com', '677554564', '{bcrypt}$2a$10$Y1pFWGiCngth/nPamB.AGejRa0p7BWo8TIlbwrMnDj4Hus8DrZtuW', 'Virgen de Lujan', 'Sevilla', '49193054C', 'admin',true);
insert into cliente (id, nombre, apellidos, email, telefono, password, direccion, municipio, dni, username, admin) values (2,'Francisco', 'Ramiro Fernandez', 'fernandez@gmail.com', '677552354','{bcrypt}$2a$10$G61/w8Ut8/GJkoSeCb.e.etANS3zZYfaSJjJItlizU2QA.bf36pwK', 'Avenida de la Paz', 'Sevilla', '49193684C', 'user',false);

insert into trabajador (id, sueldo, dni, direccion, nombre, apellidos, telefono, municipio) values (1, 3893, '70949233M', 'Calle de la Estrella', 'JUAN NICASIO', 'ARDUENGO', '+63-437-649-4027', ' Loja');
insert into trabajador (id, sueldo, dni, direccion, nombre, apellidos, telefono, municipio) values (2, 1491, '15340247M', 'Calle del Mar', 'LEANDRO', 'BLANCA', '+86-491-451-5949', ' Almería');

insert into venta (id, fecha, cliente_id, trabajador_id) values (1, '2022-02-08',1, 1);
insert into venta (id, fecha, cliente_id, trabajador_id) values (2, '2021-05-09',2, 2);


ALTER SEQUENCE hibernate_sequence RESTART WITH 1050;