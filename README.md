# CRUD Postulantes – Java y PostgreSQL

Proyecto académico que implementa un sistema CRUD de postulantes usando:

- Java (Consola)
- PostgreSQL
- JDBC
- Procedimientos almacenados
- Tabla oficial de UBIGEO del INEI

## Funcionalidades
- Registrar postulantes
- Listar postulantes
- Actualizar correo
- Eliminar postulantes
- Búsqueda por nombre de distrito
- Búsqueda por código de ubigeo (4 o 6 dígitos)

## Validaciones implementadas
- Nombre y apellido paterno obligatorios (3 a 60 caracteres)
- DNI de 8 dígitos, no duplicado
- Correo válido y no duplicado
- Sexo solo M o F
- Relación con UBIGEO

## Base de datos
- PostgreSQL
- Scripts SQL en carpeta `/sql`
- Uso de procedimientos almacenados

## Autor
Victor Hugo Guzman Prieto
