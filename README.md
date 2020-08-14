# Introduccion-AREP
Calculadora estadística con las funciones de media y desviación estándar de un grupo de números reales. 

Para usar esta calculadora puedes entrar el archivo "datos.txt" presente en el repositorio, allí podrás poner el conjunto de números que quieres operar. Solo debes escribir los números separados por comas(",") y usar un punto(".") para separar la parte natural y fraccionaria del número.

## Pre-requisitos
* [Maven](https://maven.apache.org/) : Herramienta encargada de la construcción del proyecto y el manejo de dependencias
* [Git](https://git-scm.com/) : Sistema de control de versiones.
* [JDK](https://www.oracle.com/technetwork/es/java/javase/downloads/index.html) : Herramienta de Desarrollo para Java 

Es importante verificar que usted cuente con los siguientes programas 
* Versión de Maven:
```
mvn -version
```
* Versión de Git:
```
git --version
```
* Versión del JDK:
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
Este proyecto está licenciado por Apache License 2.0 - mira aquí [LICENSE.md](LICENSE.md) los detalles
