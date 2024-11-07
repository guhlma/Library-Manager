package LibraryManager;

import java.time.ZonedDateTime;

public class LibraryManager {

    public static void main(String[] args) {

        Library myLibrary = new Library();
        Book myFirstBook = new Book("123456", "Die drei ???", "Angela Mekel", "Krimi");
        Member member = new Member(1234, "Hans Meier");
        myLibrary.borrowBook(myFirstBook, member, ZonedDateTime.now().plusDays(7));  //aktuelle Zeit +7 Tage
    }
}