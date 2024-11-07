package LibraryManager;

// Verwaltet eine Liste von Büchern
// Suche auch nach Kriterien
// Check if Available


import java.time.ZonedDateTime;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> allBooks = new ArrayList<>();
    private ArrayList<Member> allMembers = new ArrayList<>();

    public void borrowBook(Book book, Member member, ZonedDateTime returnDateTime) {

        book.setUnavailable();
        member.addBook(book);
        new Loan(book, member, returnDateTime);
    }
}