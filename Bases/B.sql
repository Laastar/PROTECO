CREATE TABLE INCIDENCIA( DESCRIPCION VARCHAR(40) NOT NULL, FECHA_REGISTRO DATE DEFAULT SYSDATE, TIPO CHAR (1) DEFAULT 'N', DESCUENTO NUMERIC(5,2) DEFAULT 5.5);

INSERT INTO INCIDENCIA(DESCRIPCION, DESCUENTO) VALUES ('RATON', 10);
INSERT INTO INCIDENCIA(DESCRIPCION, TIPO) VALUES ('RATA', 'S');

/*Se observa que los valores nunca son nulos y que en caso de no dar lagun valor
se toma uno de default */
