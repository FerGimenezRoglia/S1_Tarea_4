package Main.Nivel_1.Ejercicio_1.Modulos;


public class Book {

    private String titleBook;

    public Book(String titleBook) {
        this.titleBook = titleBook;
    }

    public String getTitleBook() {
        return titleBook;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return titleBook.equals(book.titleBook);
    }

    @Override
    public int hashCode() {
        return titleBook.hashCode();
    }

    @Override
    public String toString() {
        return "Book _ TitleBook: " + titleBook + ".";
    }
}
