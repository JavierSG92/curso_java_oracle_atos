/* Funciones */

CREATE OR REPLACE FUNCTION ANIO_NACIMIENTO (edad NUMBER)
	RETURN NUMBER
IS
	resultado NUMBER;
BEGIN
	resultado := extract(YEAR FROM SYSDATE) - edad;	
	return resultado;
END;

SELECT nombre, edad, ANIO_NACIMIENTO(edad) FROM usuario;

CREATE OR REPLACE FUNCTION NOTA_CAD (nota NUMBER)
	RETURN VARCHAR2
IS
	resultado VARCHAR2(15);
BEGIN
	IF nota < 5 THEN 
		resultado := 'Suspenso';
	ELSE IF nota < 6 THEN 
		resultado := 'Suficiente';
	ELSE IF nota < 8 THEN 
		resultado := 'Notable';
	ELSE  
		resultado := 'De puta madre';
	END IF;
	
	return resultado;
END;

SELECT Nombre, nota, NOTA_CAD(nota) from usuario;

CREATE PROCEDURE CUMPLIR_ANIOS
	AS BEGIN
		UPDATE USUARIO SET edad = edad + 1;
	END

EXECUTE CUMPLIR_ANIOS;
		

/* www.tutorialesprogramacionya.com/oracleya */

