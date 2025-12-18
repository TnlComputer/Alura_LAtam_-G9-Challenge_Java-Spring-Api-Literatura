# 📚 Alura_LAtam - Challenge Java Spring Api Literatura


# [![Java](https://img.shields.io/badge/Java-21+-blue)](https://www.oracle.com/java/)  [![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5-green)](https://spring.io/projects/spring-boot)  [![License: MIT](https://img.shields.io/badge/License-MIT-yellow)](LICENSE)

<div align="center">
<img width="409" height="410" alt="imagen" src="https://github.com/user-attachments/assets/1badeefe-cd7b-4b68-99e9-e1f3322d02e6" />
</div>

🔎 Descripción

Este proyecto es una aplicación en Java + Spring Boot que permite gestionar una colección de libros utilizando una API externa y base de datos.
Forma parte del desafío de AluraLatam G9 y tiene como objetivo aprender buenas prácticas en Java, JPA/Hibernate, validación de entradas, y lógica de negocio integrada con persistencia.

Permite:

Buscar libros por título y registrarlos en la base de datos.

Listar libros y autores.

Filtrar por idioma o autores vivos en un año específico.

Consultar estadísticas y top 10 libros más descargados.


🛠️ Funcionalidades

Buscar un libro por título y guardarlo si no existe.

Listar todos los libros registrados.

Listar autores con libros registrados.

Listar autores vivos en un año determinado.

Listar libros por idioma.

Top 10 libros más descargados.

Menú de consola interactivo con manejo de excepciones.

Arquitectura en capas (service, model, repository).  

## 📁 Estructura del proyecto

```

src/main/java/com/alura/literatura/
├── model/          # Clases de entidad y record para la API
├── repository/     # Repositorios JPA
├── service/        # Lógica de negocio
└── principal/      # Menú de consola principal

```

⚙️ Prerrequisitos

Java 21 o superior

Maven 3.5.x

Base de datos PostgreSQL (configurada en application.properties)

(Opcional) Docker si se quiere contenerizar

## 🚀 Instalación y ejecución

1. Cloná el repositorio:  
   ```
   git clone https://github.com/TnlComputer/Alura_LAtam_-G9-Challenge_Java-Spring-Api-Literatura.git
   
      cd Alura_LAtam_-G9-Challenge_Java-Spring-Api-Literatura

   ```

2. Construí el proyecto con Maven:
   
```
   mvn clean install
```

3. Ejecutá la aplicación:
   
   ```
   mvn spring-boot:run
```

4. Seguí las instrucciones en consola para usar el menú interactivo.
  Al ejecutar, verás el menú:

🖥️ Uso del menú

1: Buscar libro por título

2: Listar libros registrados

3: Listar autores registrados

4: Listar autores vivos en un año

5: Listar libros por idioma

6: Top 10 libros más descargados

7: Buscar autor por nombre parcial o completo

8: Generar estadísticas

9: Otra consulta de autores

Al seleccionar la opción 1, por ejemplo, la aplicación buscará el libro, lo guardará en la base de datos si no existe y mostrará la información por consola.

<div align="center"> <img width="600" height="350" src="https://github.com/user-attachments/assets/0c2fca1c-cb5b-44b5-95f2-0b25bdddac06" /> </div>

📦 Roadmap / Mejoras futuras

Búsquedas avanzadas (por autor, año, género, idioma, etc.)

Exportar listados a CSV o PDF

Interfaz web o REST API

Contenerizar con Docker / Docker Compose

Tests unitarios y de integración con JUnit

⭐ Extras recientes

Top 10 libros más descargados.

Estadísticas de autores y cantidad de libros por idioma.

Validación robusta de entradas y manejo de excepciones en el menú.

🤝 Contribuciones

Forkear el proyecto.

Crear rama feature/tu-mejora.

Hacer commits claros.

Crear Pull Request hacia main.

📜 Licencia

Este proyecto está bajo licencia MIT. 
