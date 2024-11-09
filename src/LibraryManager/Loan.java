package LibraryManager;

import java.time.ZonedDateTime;

public class Loan {

    private Book book;
    private Member member;
    private ZonedDateTime loanDateTime;
    private ZonedDateTime returnDateTime;

    public Loan(Book book, Member member, ZonedDateTime returnDateTime) {

        this.book = book;
        this.member = member;
        this.returnDateTime = returnDateTime;
        this.loanDateTime = ZonedDateTime.now();  // gibt aktuelle Uhrzeit
    }
    public ZonedDateTime getReturnDateTime() {
        return returnDateTime;
    }

    public String getBookTitle() {
        return book.getTitle();
    }
}