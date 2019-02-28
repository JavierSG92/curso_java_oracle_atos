CREATE VIEW Usuarios_Programadores 
	AS 
		SELECT(u.nombre||' '||u.apellidos) as Nombre_apell, edad, email, fecha_registro
				FROM usuario u 
				JOIN USU_DEPT UD ON U.id = UD.ID_USU
				JOIN departamento d ON UD.ID_DEPT = D.id
				WHERE d.nombre = 'Programacion';

/*Crear una vista que indique el número de usuarios por departamento
	Nombre 		  Cantidad
	-------------------------
	Programacion  5
	Diseño        3
*/

CREATE VIEW Usuarios_por_departamento
	AS 
	SELECT d.nombre, COUNT (*) as cantidad	
		FROM departamento d 
		JOIN USU_DEPT UD ON d.id = UD.ID_DEPT
		JOIN USUARIO U ON u.id = UD.ID_USU)
	GROUP BY nombre;
	
CREATE VIEW Usuarios_por_departamento
	AS 
	SELECT nombre, COUNT (id) as Cantidad FROM(
		SELECT d.nombre as nombre, u.id as id
		FROM departamento d 
		JOIN USU_DEPT UD ON d.id = UD.ID_DEPT
		JOIN USUARIO U ON u.id = UD.ID_USU)
	GROUP BY nombre;

SELECT COUNT (*) FROM Usuarios_por_departamento;