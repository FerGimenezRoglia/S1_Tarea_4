package Main.Nivel_1.Ejercicio_1;

import Main.Nivel_1.Ejercicio_1.Modulos.Book;
import Main.Nivel_1.Ejercicio_1.Modulos.Library;

import static Main.Nivel_1.Ejercicio_1.Modulos.Library.books;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("1985");
        Book book2 = new Book("Pedrito");

        books.add(book1);
        books.add(book2);

        library.getBookList();

        for (Book b : books) {
            System.out.println(b.toString());
        }
        library.removeBookByTitle(book1.getTitleBook());

        for (Book b : books) {
            System.out.println(b.toString());
        }

    }
}