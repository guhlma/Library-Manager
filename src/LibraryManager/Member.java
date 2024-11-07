package LibraryManager;

import java.util.ArrayList;

public class Member {

    private int id;
    private String name;
    private ArrayList<Book> loanBooks = new ArrayList<>();


    public Member(int id, String name) {

        this.id = id;
        this.name = name;
    }

    public void addBook(Book book) {
        loanBooks.add(book);
    }

    public void returnBook(Book book){
        loanBooks.remove(book);
    }
}