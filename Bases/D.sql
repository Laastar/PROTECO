create table concepto_pago( concepto_id numeric(10, 0) constraint concepto_pago_pk primary key, tipo_concepto char(1) not null constraint cp_tipo_concepto_chk check(tipo_concepto in ('A', 'B', 'C')), clave varchar(3) not null constraint cp_clave_uk unique, descripcion varchar(255), importe numeric(8,2) not null);

insert into concepto_pago (concepto_id, tipo_concepto, clave, descripcion, importe) values (30, 's', 'ab', 'Hola', '300');

insert into concepto_pago (concepto_id, tipo_concepto, clave, descripcion, importe) values (30, 'A', 'ab', 'Hola', '300');
