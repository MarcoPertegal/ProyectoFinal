insert into cliente (id, nombre, apellidos, email, telefono, password, direccion, municipio, dni, username, admin) values (1,'Endika', 'Prieto Sanchez', 'prieto@gmail.com', '677554564', '{bcrypt}$2a$10$Y1pFWGiCngth/nPamB.AGejRa0p7BWo8TIlbwrMnDj4Hus8DrZtuW', 'Virgen de Lujan', 'Sevilla', '49193054C', 'admin',true);
insert into cliente (id, nombre, apellidos, email, telefono, password, direccion, municipio, dni, username, admin) values (2,'Francisco', 'Ramiro Fernandez', 'fernandez@gmail.com', '677552354','{bcrypt}$2a$10$G61/w8Ut8/GJkoSeCb.e.etANS3zZYfaSJjJItlizU2QA.bf36pwK', 'Avenida de la Paz', 'Sevilla', '49193684C', 'user',false);
insert into cliente (id, nombre, apellidos, email, telefono, password, direccion, municipio, dni, username, admin) values (3,'Roberto', 'Pérez Sobrino', 'roberto@gmail.com', '673442354','{bcrypt}$2a$10$G61/w8Ut8/GJkoSeCb.e.etANS3zZYfaSJjJItlizU2QA.bf36pwK', 'Avenida de la Constitución', 'Sevilla', '49456784C', 'user',false);


insert into trabajador (id, sueldo, dni, direccion, nombre, apellidos, telefono, municipio) values (1, 3893, '78464492S', 'Calle de la Estrella', 'Juan', 'Gómez Franco', '602 34 92 01', ' Loja');
insert into trabajador (id, sueldo, dni, direccion, nombre, apellidos, telefono, municipio) values (2, 1491, '95754388Y', 'Calle del Mar', 'Rocío', 'Blanco González', '622 68 34 42', ' Almeria');



insert into venta (id, fecha, total, cliente_id, trabajador_id) values (1, '2021-02-12', 8250, 2, 1);
insert into venta (id, fecha, total, cliente_id, trabajador_id) values (2, '2023-04-10', 530.99, 3, 1);
insert into venta (id, fecha, total, cliente_id, trabajador_id) values (3, '2023-08-29', 1110.95, 3, 2);

insert into producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (1, 'yamaha', 'R1M', 'SUPERSPORT', 'Yamaha ha creado la R1M de competición utilizando algunas de las tecnologías más sofisticadas desarrolladas a partir de la ganadora M1 de MotoGP.', 20000, 'https://cdn2.yamaha-motor.eu/prod/product-assets/2022/YZF1000R1SPL/2022-Yamaha-YZF1000R1SPL-EU-Icon_Performance-Studio-001-03.jpg', '2022-05-12');
insert into producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (2, 'yamaha', 'R3', 'SUPERSPORT', 'La carrocería estilizada y atlética de la R3 incorpora una toma de admisión de aire central inspirada en la emblemática máquina M1 de MotoGP® ganadora de Yamaha.', 12000, 'https://cdn2.yamaha-motor.eu/prod/product-assets/2023/YZF-R320/2023-Yamaha-YZF-R320-EU-Icon_Blue-Studio-001-03.jpg', '2022-05-20');
insert into producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (3, 'honda', 'CBR650R', 'SUPERSPORT', 'Una moto para competidores natos. Diseñada con una extraordinaria aerodinámica, la CBR650R —con suspensión, equipamiento y mejoras de estilo', 7999.95, 'https://cdn2.yamaha-motor.eu/prod/product-assets/2022/YZF700R7/2022-Yamaha-YZF700R7-EU-Icon_Blue_-Studio-001-03.jpg', '2022-05-03');
insert into producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (4, 'honda', 'CBR500R', 'SUPERSPORT', '¿Por qué competir? Para mejorar Es lo que siempre hemos hecho. Y esta es la razón: la CBR500R es una motocicleta de permiso A2 pero también una CBR en cada milímetro cuadrado.', 5990,'https://cdn2.yamaha-motor.eu/prod/product-assets/2022/YZF-R125SV/2022-Yamaha-YZF-R125SV-EU-Anniversary_White-Studio-001-03.jpg', '2022-05-05');
insert into producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (5, 'yamaha', 'MT-10', 'NACKED', 'La reina de la gama MT exige un respeto total y lo primero que llamará tu atención es el nuevo conjunto compacto de faros delanteros y el depósito rediseñado que resaltan la extraordinaria belleza mecánica de la MT-10. ', 11000, 'https://cdn2.yamaha-motor.eu/prod/product-assets/2022/MT10DX/2022-Yamaha-MT10DX-EU-Icon_Performance-Studio-001-03.jpg', '2022-06-01');
insert into producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (6, 'yamaha', 'MT-03', 'NACKED', 'Su aspecto agresivo inspirado en las Hyper Naked de mayor cilindrada grandes de Yamaha es más MT que nunca.', 13000, 'https://cdn2.yamaha-motor.eu/prod/product-assets/2023/MT09/2023-Yamaha-MT09-EU-Cyan_Storm-Studio-001-03.jpg', '2022-006-15');
insert into producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (7, 'honda', 'CB1000R', 'NACKED', 'La Neo Sports Café ha evolucionado. Comenzando con la CB1000 completamente renovada, desde el elegante faro hasta el subchasis de aluminio remodelado, de carácter individual y agresivo.', 8750.95, 'https://cdn2.yamaha-motor.eu/prod/product-assets/2023/MT07AB-35/2023-Yamaha-MT07AB-35-EU-Yamaha_Black-Studio-001-03.jpg', '2022-06-14');
insert into producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (8, 'honda', 'CB300R', 'NACKED', '¿Buscas una nueva sensación? Añádele un extra en la conducción gracias a su peso liviano impulsado por una gran potencia con capacidad de respuesta rápida.', 7300, 'https://cdn2.yamaha-motor.eu/prod/product-assets/2022/MT09DX/2022-Yamaha-MT09DX-EU-Icon_Performance-Studio-001-03.jpg', '2022-06-21');
insert into producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (9, 'honda', 'CRF450R', 'OFFROAD' ,'Llevamos 50 años compitiendo en motocross. Altos y bajos, lo hemos tenido todo y hemos asumido cada momento. Ganar el fin de semana es lo que nos impulsa.', 8900.99, 'https://cdn2.yamaha-motor.eu/prod/product-assets/2023/YZ250LCSV/2023-Yamaha-YZ250LCSV-EU-Monster_Black-Studio-001-03.jpg', '2022-06-28');
insert into producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (10, 'yamaha', 'YZ450F', 'OFFROAD' ,'Esta es la Yamaha de motocross que estabas esperando. Más ligera, más rápida y más potente, la nueva YZ450F es un nuevo tipo de máquina que ha sido desarrollada contigo, el piloto, como principal objetivo en mente.', 8000, 'https://cdn2.yamaha-motor.eu/prod/product-assets/2023/YZ250F/2023-Yamaha-YZ250F-EU-Icon_Blue-Studio-001-03.jpg', '2022-07-16');
insert into producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (11, 'yamaha', 'TMAX', 'SCOOTER' ,'El TMAX es el rey indiscutible de los scooters. Es el scooter deportivo más vendido en Europa desde el lanzamiento del modelo original en 2001.', 5900.99, 'https://cdn2.yamaha-motor.eu/prod/product-assets/2023/XP500A/2023-Yamaha-XP500A-EU-Icon_Blue-Studio-001-03.jpg', '2022-07-17');
insert into producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (12, 'yamaha', 'Bolsa interior', 'EQUIPO' ,'Bolsa flexible que se ajusta al interior del Top Case Yamaha de 34 L', 299.99, 'https://cdn2.yamaha-motor.eu/prod/accessories/LIFESTYLE-LUGGAGE/Lifestyle-Luggage/T18-HD009-C0-00-WR-dry-bag-big-red-EU-Studio-001_Tablet.jpg', '2022-07-23');
insert into producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (13, 'yamaha', 'Calcetines', 'ROPA','Calcetines largos para botas MX con diseño Yamaha Racing. ¡Un accesorio esencial para cualquier aventura MX!', 19.95, 'https://cdn2.yamaha-motor.eu/prod/accessories/APPAREL/Apparel/B20-HF105-E1-LX-Offroad-Boot-Socks-Male-EU-Studio-001_Tablet.jpg', '2022-07-24');
insert into producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (14, 'Alpinestars', 'Chaqueta GP Plus', 'ROPA', 'Chaqueta de cuero para motocicleta con protecciones desmontables y paneles de malla para mayor ventilación', 395.95, 'https://cdn2.yamaha-motor.eu/prod/accessories/ROAD-GEAR/Road-gear/A21-BJ102-B4-0L-MT-Winter-jacket--Male-EU-Studio-006_Tablet.jpg', '2022-07-25');
insert into producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (15, 'Shoei', 'X-Fourteen', 'CASCO', 'Casco de moto integral de alta gama con una carcasa externa de fibra de vidrio y carbono para la máxima protección', 530.99, 'https://i.pinimg.com/564x/10/c8/9c/10c89cc9b988ad675136ecc009925800.jpg', '2022-08-26');
insert into producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (16, 'DEXTER', 'PROTON', 'CASCO', 'Este casco integral cuenta con una estética increíble, un diseño compacto y cómodo, calota fabricada en EPS de múltiple densidad e incluye anti-vaho.', 620, 'https://i.pinimg.com/564x/6e/a2/51/6ea2511daf03e4b6d38dcfe5e05bd268.jpg', '2022-08-01');
insert into producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (17, 'HJC', 'RPHA 70', 'CASCO', 'Este es el casco integral perfecto para el turismo deportivo, con un diseño súper deportivo pero con un enfoque de uso en tu vida cotidiana.', 450.95, 'https://i.pinimg.com/564x/18/8a/fd/188afdae6c49f16370066062ef2610ca.jpg', '2022-08-17');
insert into producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (18, 'Shoei', 'NEOTEC', 'CASCO', '¿Buscas un casco modular de diseño más dinámico, con una comodidad mejorada y con innovaciones técnicas? Shoei presenta su casco modular Neotec II:', 299.99, 'https://i.pinimg.com/564x/3f/94/18/3f9418d4822b5ce81cbf23e4c7f2b74f.jpg', '2022-08-30');
INSERT INTO producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (19, 'Alpinestars', 'Guantes SP-8 V2', 'ROPA', 'Guantes de moto de cuero con protecciones de nudillos y muñeca ajustable.', 150, 'https://cdn2.yamaha-motor.eu/prod/accessories/ROAD-GEAR/Road-gear/A21-BG102-B0-0L-21-glove-male-summer-Makalu-EU-Studio-001_Tablet.jpg', '2022-09-04');
INSERT INTO producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (20, 'yamaha', 'Guantes Enduro', 'ROPA' ,'Los guantes Enduro para hombre imprescindibles para las duras aventuras off-road ofrecen protección, ventilación y comodidad.', 99.99,'https://cdn2.yamaha-motor.eu/prod/accessories/ROAD-GEAR/Road-gear/A22-RG105-B4-0L-MX-Gloves-_Men_-EU-Studio-001_Tablet.jpg', '2022-09-03');
INSERT INTO producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (21, 'Dainese', 'Chaqueta Avro D2', 'ROPA', 'Chaqueta de moto de cuero con protecciones en codos y hombros y forro térmico desmontable.', 330, 'https://cdn2.yamaha-motor.eu/prod/accessories/ROAD-GEAR/Road-gear/A22-MT101-B0-0L-MT-Jacket-Hoodie-Aqua-EU-Studio-001_Tablet.jpg', '2022-09-02');
INSERT INTO producto (id, marca, nombre, categoria, descripcion, precio_base, imagen, alta) values (22, 'yamaha', 'Pantalón Touring', 'EQUIPO', 'Pantalón 2 en 1 confeccionado con nailon fino combinado con softshell El pantalón se puede combinar con la chaqueta Sport Touring para tener un traje completo.', 340, 'https://cdn2.yamaha-motor.eu/prod/accessories/ROAD-GEAR/Road-gear/A20-BP102-B0-0L-20-male-pant-tour-CANBER-EU-Studio-001_Tablet.jpg', '2022-10-01');

insert into motocicleta (id, peso, cilindrada) values (1, 200, 500);
insert into motocicleta (id, peso, cilindrada) values (2, 230, 321);
insert into motocicleta (id, peso, cilindrada) values (3, 208, 649);
insert into motocicleta (id, peso, cilindrada) values (4, 218, 998);
insert into motocicleta (id, peso, cilindrada) values (5, 205, 320);
insert into motocicleta (id, peso, cilindrada) values (6, 168, 321);
insert into motocicleta (id, peso, cilindrada) values (7, 212, 143);
insert into motocicleta (id, peso, cilindrada) values (8, 205, 130);
insert into motocicleta (id, peso, cilindrada) values (9, 110, 56);
insert into motocicleta (id, peso, cilindrada) values (10, 100, 54);
insert into motocicleta (id, peso, cilindrada) values (11, 219, 47);

insert into accesorio (id, caracteristicas) values (12, 'Tejido elástico transpirable en la parte superior, Palma acolchada ergonómica, Puños elásticos, Marca conjunta de Yamaha y Alpinestars');
insert into accesorio (id, caracteristicas) values (13, 'Parches de goma termoplástica (TPR), Refuerzo en palmas y pulgares, Protecciones de nudillos, Cierre con velcro en los puños');
insert into accesorio (id, caracteristicas) values (14, 'Capucha extraíble, 2 exterior and 2 interior pockets, Protectores de hombros y codos de nivel CE, CE level back protector');
insert into accesorio (id, caracteristicas) values (15, 'Poliéster Oxford duradero, Diseño para botas.');
insert into accesorio (id, caracteristicas) values (16, 'Permite cargar y descargar el contenido del Top Case con facilidad, Incluye correa para transportarlo con facilidad');
insert into accesorio (id, caracteristicas) values (17, 'Talón y pie reforzados, Cómodos y duraderos, Hasta la rodilla');
insert into accesorio (id, caracteristicas) values (18, 'Protectores Bio Armor desmontables en hombros y codos certificados CE. Deslizaderas GP LITE de TPU inyectado en los hombros con recubrimiento de piel.');
insert into accesorio (id, caracteristicas) values (19, 'Sistema interior personalizado 3D Max-Dry.Clip de correa de barbilla estándar. Escudo CWR-F y sistema QR-E.');
insert into accesorio (id, caracteristicas) values (20, 'Calota interna de densidad múltiple que garantiza la seguridad, Cierre de anilla micrométrica para un ajuste rápido y fácil');
insert into accesorio (id, caracteristicas) values (21, 'Guarda barbilla, deflector de respiración, juego de placas de mecanismo');
insert into accesorio (id, caracteristicas) values (22, 'Calota multifibra AIM, Sistema EPS de absorción de impactos, Sistema de Bloqueo 360, Cierre de seguridad Micrométrico');

insert into linea_venta(id, cantidad, venta_id, producto_id) values (1, 1, 1, 11);
insert into linea_venta(id, cantidad, venta_id, producto_id) values (2, 1, 1, 18);
insert into linea_venta(id, cantidad, venta_id, producto_id) values (3, 1, 1, 20);
insert into linea_venta(id, cantidad, venta_id, producto_id) values (4, 1, 2, 15);
insert into linea_venta(id, cantidad, venta_id, producto_id) values (5, 2, 3, 21);
insert into linea_venta(id, cantidad, venta_id, producto_id) values (6, 2, 3, 17);

ALTER SEQUENCE hibernate_sequence RESTART WITH 1050;