# Actividad 2 – Unidad 9: Inserción de dietas desde Java con JDBC

En esta segunda actividad he creado un nuevo proyecto Java desde cero, llamado `InsertarDietas`.  
El objetivo ha sido conectar a la base de datos `Empresa` (creada en la actividad anterior) e insertar varios registros en la tabla `Dietas` utilizando código Java y JDBC.

---

Primero he reutilizado la clase de conexión `ConexionBD.java` que ya estaba funcionando.  
Luego he creado una nueva clase llamada `InsertarDietas.java`, en la que preparo una sentencia SQL con parámetros y ejecuto varias inserciones con `PreparedStatement`.

He insertado un total de 10 dietas con datos reales, distribuidas entre tres departamentos: Informática, Ventas y RRHH. Cada registro contiene el nombre del empleado, el departamento, la cantidad en euros y el concepto de la dieta.

Al ejecutar el programa, todos los registros se insertan correctamente en la base de datos. He comprobado desde MySQL Workbench que los datos han quedado almacenados sin errores.
