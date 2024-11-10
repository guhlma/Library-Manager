package LibraryManager;

import java.util.ArrayList;

public class Member extends Human {

    private int id;
    private String name;
    private ArrayList<Book> loanBooks = new ArrayList<>();

    public Member(int id, String name) {
        super(id, name);
    }

    public void addBook(Book book) {
        loanBooks.add(book);
    }

    public void returnBook(Book book){
        loanBooks.remove(book);
    }
}