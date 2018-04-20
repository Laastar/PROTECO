CREATE TABLE empleado( empleado_id NUMERIC(10,0) NOT NULL, nombre VARCHAR(40)puesto_id NUMERIC(2,0));

CREATE TABLE puesto( puesto_id NUMERIC(2,0) NOT NULL, nivel  CHAR(1) NOT NULL, clave VARCHAR(3) NOT NULL, sueldo NUMERIC(8,2) NOT NULL);

ALTER TABLE empleado ADD CONSTRAINT empleado_id_pk PRIMARY KEY(empleado_id);

ALTER TABLE puesto ADD CONSTRAINT puesto_id_pk PRIMARY KEY(puesto_id);

ALTER TABLE empleado ADD CONSTRAINT puesto_id_fk FOREIGN KEY(puesto_id) REFERENCES puesto(puesto_id);
