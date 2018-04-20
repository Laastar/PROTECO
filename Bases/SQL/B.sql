ALTER TABLE empleado DROP CONSTRAINT empleado_id_pk;

ALTER TABLE puesto DROP CONSTRAINT puesto_id_pk;

ALTER TABLE puesto DROP CONSTRAINT puesto_id_fk;

ALTER TABLE empleado RENAME TO empleado_tc;

ALTER TABLE puesto RENAME TO puesto_tc;

ALTER TABLE empleado_tc ADD CONSTRAINT empleado_id_pk PRIMARY KEY(empleado_id);

ALTER TABLE puesto_tc ADD CONSTRAINT puesto_id_pk PRIMARY KEY(puesto_id);

ALTER TABLE empleado_tc ADD CONSTRAINT puesto_id_fk FOREIGN KEY(puesto_id) REFERENCES puesto_tc(puesto_id);
