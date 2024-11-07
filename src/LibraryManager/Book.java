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

    public void setUnavailable() {
        isAvailable = false;
    }

    public void setAvailable() {
        isAvailable = true;
    }
}