package LibraryManager;

public class LibraryManager {

    public static void main(String[] args) {

        Book myFirstBook = new Book("123456", "Die drei ???","Angela Mekel", "Krimi");

        Member member = new Member(1234, "Hans Meier");

        member.addBook(myFirstBook);
    }
}