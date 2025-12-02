# 📚 Alura_LAtam - Challenge Java Spring Api Literatura

[![Java](https://img.shields.io/badge/Java-17+-blue)](https://www.oracle.com/java/)  
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5-green)](https://spring.io/projects/spring-boot)  
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow)](LICENSE)

## 🔎 Descripción

Este proyecto es una API + consola de línea de comandos en **Java + Spring Boot** para gestionar una colección de libros — como parte del desafío del curso de AluraLatam.  
Permite buscar libros por título, registrarlos en base de datos, listar libros, listar autores, filtrar por idioma o por año de nacimiento (autores vivos en determinado año).  
Ideal para aprender buenas prácticas en Java, manejo de datos con JPA/Hibernate, validación de entrada, e integración de lógica de negocio + persistencia.

## 🛠️ Funcionalidades

- ✅ Buscar un libro por título y guardarlo como entidad.  
- ✅ Listar todos los libros registrados.  
- ✅ Listar autores con libros registrados.  
- ✅ Listar autores vivos en un año determinado.  
- ✅ Listar libros filtrados por idioma.  
- ✅ Menú de consola interactivo con validación robusta de entradas.  
- ✅ Arquitectura basada en capas (_service_, _model_, _repository_) con Spring Boot + Maven + JPA.  

## 📁 Estructura del proyecto
<img width="697" height="284" alt="imagen" src="https://github.com/user-attachments/assets/1387295e-e115-402a-8ba1-ac84f63fc79a" />


## ⚙️ Prerrequisitos

- Java 17 o superior  
- Maven 3.x  
- Base de datos configurada en `application.properties` (puede ser H2, MySQL, PostgreSQL u otra compatible con JPA)  
- (Opcional) Docker, si planeás contenerizar la aplicación  

## 🚀 Instalación y ejecución

1. Cloná el repositorio:  
   ```bash
   git clone https://github.com/TnlComputer/Alura_LAtam_-G9-Challenge_Java-Spring-Api-Literatura.git
   cd Alura_LAtam_-G9-Challenge_Java-Spring-Api-Literatura

2. Construí el proyecto con Maven:
   mvn clean install

3. Ejecutá la aplicación:
   mvn spring-boot:run

4. Seguí las instrucciones en consola para usar el menú interactivo.
  Al ejecutar, verás el menú:

<img width="508" height="286" alt="imagen" src="https://github.com/user-attachments/assets/1f5eb665-195a-426c-a85e-51a5c8e4720d" />


— Por ejemplo, para buscar un libro por título: elegí 1, ingresá el nombre del libro, la aplicación lo buscará, lo guardará en BD y lo mostrará por consola.

<img width="551" height="585" alt="imagen" src="https://github.com/user-attachments/assets/f2a635ce-d560-46b3-a3f5-2c1c315be2e6" />

y tambien puedes usar cada opción del menu

<img width="802" height="887" alt="imagen" src="https://github.com/user-attachments/assets/909035ad-4cd1-4dd4-b64b-1bb42edf70a2" />

<img width="624" height="852" alt="imagen" src="https://github.com/user-attachments/assets/3a1f29b5-ea23-40b0-afd9-83399174f482" />

<img width="710" height="677" alt="imagen" src="https://github.com/user-attachments/assets/4f6caa2d-a88e-4c2b-8391-66418f7f9830" />

<img width="671" height="538" alt="imagen" src="https://github.com/user-attachments/assets/d4c9915d-b959-4488-ac19-02d62243b467" />

<img width="515" height="360" alt="imagen" src="https://github.com/user-attachments/assets/6594ca91-de5a-472f-a1ca-61593329358f" />


📦 Mejora / Roadmap

Añadir soporte para búsquedas avanzadas (por autor, año, género, etc.).

Implementar tests unitarios / de integración con JUnit.

Permitir exportar listas a CSV o PDF.

Añadir una interfaz web o REST API (para que no sólo sea consola).

Contenerizar con Docker / Docker Compose para facilitar despliegue.

🤝 Contribuciones

Si querés sumar funcionalidades, (por ejemplo nuevas búsquedas, reportes, API REST, etc.) podés:

Forkear el proyecto.

Crear una rama feature/tu-mejora.

Hacer commit con mensajes claros.

Crear un Pull Request desde tu rama hacia main.

📜 Licencia

Este proyecto está bajo licencia MIT — ver archivo LICENSE para más detalles.

