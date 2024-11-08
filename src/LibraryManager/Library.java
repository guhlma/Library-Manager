package LibraryManager;

// Verwaltet eine Liste von Büchern
// Suche auch nach Kriterien
// Check if Available

import java.time.ZonedDateTime;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> allBooks = new ArrayList<>();
    private ArrayList<Member> allMembers = new ArrayList<>();
    private ArrayList<Loan> allLoans = new ArrayList<>();

    public void addBookToLibrary(Book book) {
        allBooks.add(book);
    }

    public Member createMember(String memberName) {
        Member member = new Member(1234, memberName);
        allMembers.add(member);
        return member;
    }

    public void borrowBook(Book book, Member member, ZonedDateTime returnDateTime) {
        book.setUnavailable();
        member.addBook(book);
        Loan loan = new Loan(book, member, returnDateTime);
        allLoans.add(loan);
    }

    public ZonedDateTime getReturnDateFromBook(Book bookV) {

        for (Loan loan : allLoans){

            if (bookV.getTitle().equalsIgnoreCase(loan.getBookTitle())){
                return loan.getReturnDateTime();
            }
        }
        return null; //todo
    }

    public Book searchBook(String title) {
        for (Book book : allBooks) {
            if (title.equalsIgnoreCase(book.getTitle())) {
                return book;
            }
        }
        return null;
    }
}