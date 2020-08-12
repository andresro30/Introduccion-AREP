# Introduccion-AREP
Tarea Introduccion MVN-GIT de Arquitectura Empresarial

## Pre-requisitos
* [Maven](https://maven.apache.org/) : Herramienta encargada de la construcción del proyecto y el manejo de dependencias
* [Git](https://git-scm.com/) : Sistema de control de versiones.
* [JDK](https://www.oracle.com/technetwork/es/java/javase/downloads/index.html) : Herramienta de Desarrollo para Java 

Es importante verificar que usted cuente con los siguientes programas 
```
mvn -version
```
```
git --version
```
```
java -version
```

## Instalación
Para instalar el programa debe descargar el repositorio usando el siguiente comando desde su consola CMD
```
git clone https://github.com/andresro30/Introduccion-AREP.git
```
## Ejecución
Para compilar el proyecto debe use el siguiente comando cuando acceda al directorio Introduccion-AREP
```
mvn package
```
Cuando ya el proyecto ha compilado, puede proceder a ejecutarlo, use el siguiente comando sobre el directorio Introduccion-AREP
```
java -cp target/Introduccion-AREP-1.0-SNAPSHOT.jar edu.escuelaing.arem.ASE.app.App
```
## Ejecución de pruebas
Para correr las pruebas debe usar el siguiente comando
```
mvn test
```
## Construido con
* [Maven](https://maven.apache.org/) : Herramienta encargada de la construcción del proyecto y el manejo de dependencias
* [Git](https://git-scm.com/) : Sistema de control de versiones.
* Java : Lenguaje de Programación.
## Autor
* **Andrés Rocha** - [andresro30](https://github.com/andresro30)

## Licencia 
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
