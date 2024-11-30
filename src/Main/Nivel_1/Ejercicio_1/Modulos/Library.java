package Main.Nivel_1.Ejercicio_1.Modulos;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String titleBook) {

        if (!books.contains(new Book(titleBook))) {
            books.add(new Book(titleBook));
        } else {
            System.out.println("The book " + titleBook + " already exists in the library.");
        }
    }

    public List<Book> getBookList() {
        books.sort((b1, b2) -> b1.getTitleBook().compareTo(b2.getTitleBook()));
        return new ArrayList<>(books);
    }

    public String getBookByPosition(int position) {

        if (position >= 0 && position < books.size()) {
            return books.get(position).getTitleBook();
        } else {
            System.out.println("Invalid position.");
            return null;
        }
    }

    public void addBookAtPosition(String titleBook, int position) {

        if (!books.contains(new Book(titleBook))) {
            if (position >= 0 && position < books.size()) {
                books.set(position, new Book(titleBook));
            } else {
                System.out.println("Invalid position.");
            }
        } else {
            System.out.println("The book " + titleBook + " already exists in the library.");
        }
    }

    public void removeBookByTitle(String titleBook) {

        if (books.contains(new Book(titleBook))) {
            books.remove(new Book(titleBook));
            System.out.println("The book " + titleBook + " was removed.");
        } else {
            System.out.println("The book " + titleBook + " is not in the library.");
        }
    }


}
