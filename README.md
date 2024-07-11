### Paso 1: Crear el proyecto Spring Boot

1. **Iniciar un nuevo proyecto Spring Boot con Maven:**
   - Usar Spring Initializr (https://start.spring.io/).
   - Seleccionar las siguientes configuraciones:
     - Project: Maven Project
     - Language: Java
     - Spring Boot: 3.3.1
     - Packaging: Jar
     - Java: 17
     - Dependencias: Spring Web

2. **Descargar y descomprimir el proyecto generado.**

### Paso 2: Configurar el controlador REST

1. **Crear una nueva clase de controlador:**
   - En `src/main/java/com/lite`, crear una clase `ControllerCursoDocker.java`.
   - Anotar la clase con `@RestController` y crear un método que retorne "Hola Mundo" al endpoint `/`.

### Paso 3: Configurar Maven para Java

1. **Actualizar `pom.xml` para usar Java:**
   - Asegurarse de que la versión de Java esté configurada correctamente en el `pom.xml`:

```xml
<properties>
    <java.version>17</java.version>
</properties>
```

   - Correr el API ejecutando la clase que tiene <NOMBRE>Application.java, validar que sube el servicio y hacer una prueba lanzando el browser con la url http://localhost:8080


### Paso 4: Crear el Dockerfile

1. **En la raíz del proyecto, crear un archivo llamado `Dockerfile`:**
   - Este archivo debe contener las instrucciones para construir la imagen Docker (ver archivo de ejemplo)


### Paso 5: Construir la imagen Docker

1. **Construir el proyecto con Maven:**
   - Ejecutar `mvn clean package` para construir el archivo JAR.

2. **Construir la imagen Docker:**
   - Ejecutar `docker build -t holamundo:1.0 .` en la raíz del proyecto.

### Paso 6: Probar la imagen Docker localmente

1. **Ejecutar la imagen Docker:**
   - Ejecutar `docker run --name holamundo -d -p 8080:8080 holamundo:1.0`.
   - Abrir un navegador y navegar a `http://localhost:8080/` para verificar que el servicio está funcionando correctamente sobre un container

### Paso 7: Crear el archivo de despliegue de Kubernetes

- Se debe garantizar la conectividad a un cluster de Kubernetes para ejecutar los comandos

1. **Crear un archivo `deployment.yaml` sobre la una carpeta k8s:**
   - Este archivo debe contener la configuración para el deployment y el servicio en Kubernetes.

### Paso 8: Desplegar en Kubernetes

1. **Desplegar el microservicio en tu clúster de Kubernetes:**
   - Ejecutar `kubectl apply -f deployment.yaml` para crear el deployment y el servicio.

2. **Verificar el despliegue:**
   - Usar `kubectl get pods` para asegurarse de que el pod está en ejecución.
   - Usar `kubectl get services` para obtener la IP y el puerto donde se está exponiendo el servicio.

### Resumen de los pasos:

1. Iniciar un nuevo proyecto Spring Boot con Spring Initializr.
2. Crear una nueva clase de controlador.
3. Actualizar `pom.xml` para usar Java correspondiente.
4. Crear `Dockerfile`.
5. Construir el proyecto con Maven.
6. Construir la imagen Docker.
7. Probar la imagen Docker localmente.
8. Crear `deployment.yaml` para Kubernetes.
9. Desplegar y verificar el microservicio en Kubernetes.