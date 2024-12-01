package Main.Nivel_1.Ejercicio_1;

import Main.Nivel_1.Ejercicio_1.Modulos.Book;
import Main.Nivel_1.Ejercicio_1.Modulos.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static Main.Nivel_1.Ejercicio_1.Modulos.Library.books;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @DisplayName("Verifica que la lista de libros no es nula después de crear un objeto nuevo.")
    @Test
    public void test_1() {

        assertNotNull(library.getBookList());
    }

    @DisplayName("Confirma que la lista tiene un tamaño esperado después de insertar varios libros.")
    @Test
    public void test_2() {

        library.addBook("La tortuga y el buho");
        library.addBook("El túnel");
        library.addBook("El elogio de la sombra");
        assertEquals(3, library.getBookList().size());
    }

    @DisplayName("Asegura que la lista contiene un libro específico en su correcta posición.")
    @Test
    public void test_3() {

        library.addBook("El túnel");
        library.addBook("El elogio de la sombra");
        assertEquals("El túnel", library.getBookByPosition(0));
    }

    @DisplayName("Verifica que no existen títulos de libros duplicados en la lista.")
    @Test
    public void test_4() {

        library.addBook("El túnel");
        library.addBook("El túnel");
        assertEquals(books.size(), library.getBookList().size());
    }

    @DisplayName("Comprueba que se puede recuperar el título de un libro dada una posición específica.")
    @Test
    public void test_5() {

        library.addBook("El túnel");
        library.addBook("El elogio de la sombra");

        assertEquals("El túnel", library.getBookByPosition(0));
        assertEquals("El elogio de la sombra", library.getBookByPosition(1));

        assertNull(library.getBookByPosition(5));
    }

    @DisplayName("Asegura que añadir un libro modifica correctamente la lista.")
    @Test
    public void test_6() {

        library.addBook("El túnel");
        List<Book> initialList = library.getBookList();
        library.addBook("Demian");
        assertNotEquals(initialList, library.getBookList());
    }

    @DisplayName("Confirma que eliminar un libro disminuye el tamaño de la lista.")
    @Test
    public void test_7() {

        library.addBook("El túnel");
        library.addBook("El elogio de la sombra");
        library.removeBookByTitle("El túnel");
        assertEquals(books.size(), library.getBookList().size());
        assertFalse(library.getBookList().contains(new Book("El túnel")));
    }

    @DisplayName("Verifica que la lista permanece ordenada alfabéticamente después de añadir o eliminar un libro.")
    @Test
    public void test_8() {

        library.addBook("La tortuga y el búho");
        library.addBook("El túnel");
        library.addBook("El elogio de la sombra");

        List<Book> books = library.getBookList();
        assertEquals("El elogio de la sombra", books.get(0).getTitleBook());
        assertEquals("El túnel", books.get(1).getTitleBook());
        assertEquals("La tortuga y el búho", books.get(2).getTitleBook());

        // Añado un libro y verifico el orden
        library.addBook("Animales");
        books = library.getBookList();
        assertEquals("Animales", books.get(0).getTitleBook());
        assertEquals("El elogio de la sombra", books.get(1).getTitleBook());
        assertEquals("El túnel", books.get(2).getTitleBook());
        assertEquals("La tortuga y el búho", books.get(3).getTitleBook());

        // Elimino un libro y verifico el orden
        library.removeBookByTitle("El túnel");
        books = library.getBookList();
        assertEquals("Animales", books.get(0).getTitleBook());
        assertEquals("El elogio de la sombra", books.get(1).getTitleBook());
        assertEquals("La tortuga y el búho", books.get(2).getTitleBook());
    }

}