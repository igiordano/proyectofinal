  DROP TABLE CLIENTE IF EXISTS ;

  CREATE TABLE CLIENTE (
  nombre VARCHAR(50),
  apellido VARCHAR(50),
  dni INT,
  fecha_nacimiento DATE
  );

  DROP TABLE PRODUCTO IF EXISTS ;

  CREATE TABLE PRODUCTO (
  nombre VARCHAR(50),
  id_producto INT,
  precio FLOAT,
  precio_compra FLOAT
  );