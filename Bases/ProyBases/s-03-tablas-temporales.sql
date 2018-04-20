-- 
-- TABLE: TABULAR TEMPORAL
--

CREATE GLOBAL TEMPORARY TABLE TABULAR (
    TIPO_SEGURO            VARCHAR2(2) ,
    CLAVE_MARCA            VARCHAR2(10),
    CLAVE_MODELO           VARCHAR2(10),
    AÑO                    NUMBER(4, 0),
    CODIGO_POSTAL          NUMBER(8, 0),
    CLAVE_ESTADO           VARCHAR2(5) ,
    FECHA_NAC              DATE        ,
    COSTO                  NUMBER(6, 0))
ON COMMIT PRESERVE ROWS;