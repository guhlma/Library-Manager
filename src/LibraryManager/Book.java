package LibraryManager;

import java.time.ZonedDateTime;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;

    public Book(String isbn, String title, String author, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Das Buch " + title + " wurde erfolgreich ausgeliehen.");
        } else {
            System.out.println("Das Buch " + title + " ist derzeit leider nicht verfügbar.");
        }
    }

    public void returnBook() {
        if (isAvailable) {
            System.out.println("Das Buch " + title + " wurde nicht ausgeliehen.");
        } else {
            System.out.println("Das Buch " + title + " wurde erfolgreich zurückgegeben.");
            isAvailable = true;
        }
    }
}