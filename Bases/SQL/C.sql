CREATE TABLE pensionada( pensionada_id NUMERIC(10,0) NOT NULL, nombre VARCHAR(40) NOT NULL, CONSTRAINT pensionada_id_pk PRIMARY KEY(pensionada_id) );

CREATE TABLE pensionada_empleado( pensionada_id NUMERIC(10,0) NOT NULL, empleado_id NUMERIC(10,0) NOT NULL,	porcentaje NUMERIC(5,2) NOT NULL, CONSTRAINT pensionada_e_id_pk PRIMARY KEY(pensionada_id,empleado_id), CONSTRAINT pensionada_id_fk FOREIGN KEY(pensionada_id) REFERENCES pensionada(pensionada_id), CONSTRAINT empleado_id_fk FOREIGN KEY(empleado_id) REFERENCES empleado_tc(empleado_id) );
