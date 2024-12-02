Proyecto de Ejercicios en Java - Nivel 1
Este repositorio contiene la implementación de tres ejercicios de Java, organizados en diferentes paquetes, que cubren conceptos básicos y avanzados del lenguaje, como manejo de excepciones, colecciones y pruebas unitarias.
Ejercicios
Ejercicio 1: Biblioteca de Libros
Implementa una biblioteca básica que permite:
Agregar libros por título.
Listar libros en orden alfabético.
Buscar libros por posición.
Agregar libros en una posición específica.
Eliminar libros por título.
#### Archivos relevantes
Book.java: Clase que representa un libro con su título.
Library.java: Clase que gestiona las operaciones de la biblioteca.
Ejercicio 2: Cálculo de Letra del DNI
Calcula la letra asociada a un número de DNI español utilizando un algoritmo modular.
#### Archivos relevantes
CalculoDni.java: Implementa el cálculo de la letra.
CalculoDniTest.java: Pruebas unitarias para validar el cálculo de la letra del DNI.
Ejercicio 3: Manejo de Excepciones
Ejemplo que genera y prueba una excepción ArrayIndexOutOfBoundsException al intentar acceder a un índice fuera de los límites de un array.
#### Archivos relevantes
OutOfBounds.java: Contiene el método que genera la excepción.
OutOfBoundsTest.java: Pruebas unitarias para validar que se lanza la excepción esperada.
***Cómo ejecutar el proyecto
Clona el repositorio:
   git clone <URL_DEL_REPOSITORIO>
   cd <NOMBRE_DEL_REPOSITORIO>
   
Importa el proyecto en tu IDE:
Abre IntelliJ IDEA u otro IDE de tu elección.
Importa el proyecto como un proyecto de Java.
Ejecuta los ejercicios:
Navega a los archivos en sus respectivos paquetes:
Main.Nivel_1.Ejercicio_1.Modulos.Library
Main.Nivel_1.Ejercicio_2.CalculoDni
Main.Nivel_1.Ejercicio_3.OutOfBounds
Ejecuta los métodos deseados desde una clase Main o directamente desde los archivos.
Ejecuta las pruebas:
Asegúrate de que las dependencias de JUnit están configuradas en tu proyecto.
Ejecuta las pruebas desde los archivos de prueba (*Test.java) en tu IDE o usando comandos como mvn test si estás usando Maven.
***Notas adicionales
Se recomienda utilizar Java 17 o superior para compatibilidad.
Para ejecutar las pruebas parametrizadas en el Ejercicio 2, verifica que JUnit 5 está configurado correctamente.
La estructura del proyecto sigue el estándar de paquetes para facilitar la navegación.
