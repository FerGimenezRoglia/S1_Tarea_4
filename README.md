Resumen de ejercicios sobre Manejo de Excepciones y Colecciones
Este repositorio contiene tres ejercicios en Java que cubren manejo de colecciones, iteradores, excepciones y pruebas unitarias. A continuación, se presenta un resumen de cada uno:
Ejercicio 1: Biblioteca de Libros
Descripción  
Implementación de una biblioteca que permite:
Agregar libros asegurando que no se repitan.
Listar los libros en orden alfabético.
Buscar libros por su posición.
Eliminar libros por título.
Archivos relevantes  
Book.java: Representa un libro con un atributo de título y métodos sobrescritos (equals, hashCode, toString).
Library.java: Contiene la lógica para gestionar los libros utilizando una colección ArrayList.
Aprendizajes  
Manejo de ArrayList para colecciones dinámicas.
Implementación de lógica para evitar duplicados.
Métodos sobrescritos en objetos (equals, hashCode, toString).
***Ejercicio 2: Cálculo de Letra del DNI
Descripción  
Cálculo de la letra asociada a un número de DNI español mediante un algoritmo modular.
Archivos relevantes  
CalculoDni.java: Contiene el método que calcula la letra del DNI.
CalculoDniTest.java: Implementa pruebas unitarias parametrizadas con JUnit.
Aprendizajes  
Uso del operador módulo para cálculos específicos.
Pruebas unitarias con parámetros en JUnit (@ParameterizedTest y @CsvSource).
***Ejercicio 3: Manejo de Excepciones
Descripción  
Generación y manejo de una excepción ArrayIndexOutOfBoundsException con validación mediante pruebas unitarias.
Archivos relevantes  
OutOfBounds.java: Método que provoca una excepción al acceder a índices fuera de los límites de un array.
OutOfBoundsTest.java: Valida que la excepción es lanzada correctamente utilizando assertThrows.
Aprendizajes  
Manejo de excepciones en Java.
Pruebas unitarias para validar comportamiento en situaciones de error.
***Testing en el proyecto
Este repositorio utiliza JUnit 5 para validar el comportamiento de los métodos implementados. Se han desarrollado pruebas unitarias para:
Validar el cálculo correcto de la letra del DNI (Ejercicio 2).
Garantizar que se lanza la excepción esperada en el manejo de errores (Ejercicio 3).
Las pruebas pueden ejecutarse desde un IDE compatible o mediante una herramienta de construcción como Maven o Gradle.
***Cómo ejecutar
Configura el entorno Java  
   Asegúrate de tener Java 17 o superior configurado.
Compila y ejecuta cada ejercicio  
Navega a los paquetes del proyecto según el ejercicio.
Ejecuta directamente en el IDE o crea una clase Main para probar los métodos.
Ejecuta las pruebas unitarias  
Configura JUnit 5 en tu entorno.
Ejecuta las pruebas desde tu IDE o utiliza herramientas como Maven para automatizarlas.
***Notas adicionales
La estructura del proyecto sigue el estándar de paquetes para facilitar la navegación.
En el Ejercicio 2, asegúrate de probar diferentes números de DNI para validar la correspondencia de las letras.
