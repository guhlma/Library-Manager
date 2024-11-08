package LibraryManager;

import java.sql.SQLOutput;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class LibraryManager {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Library myLibrary = new Library();
        Book myFirstBook = new Book("123456", "CleanCode", "Angela Mekel", "Krimi");
        Member createAMember = myLibrary.createMember("Malte");
        myLibrary.borrowBook(myFirstBook, createAMember, ZonedDateTime.now().plusDays(7));  //aktuelle Zeit +7 Tage
        myLibrary.addBookToLibrary(myFirstBook);

        System.out.println("Willkommen in der Library. Bitte wählen Sie eine Option:");
        System.out.println("1: Buch suchen");  // if available
        System.out.println("2: Buch Verfügbarkeit abfragen");  // if available
        System.out.println("3: Buch ausleihen");
        System.out.println("4: Buch zurückgeben");
        System.out.println("5: Liste der Bücher die verliehen sind");
        System.out.println("6: Beenden");

        int input = scanner.nextInt();

        if (input <= 0 || input >= 7) {
            System.out.println("Bitte wählen Sie Zahlen von 1-5 aus. !ERROR!");
        } else {
            System.out.println("Gültige Angabe.");
        }

        switch (input) {
            case 1:
                System.out.println("Titel");
                String titleFromUserInput = scanner.next();
                Book book = myLibrary.searchBook(titleFromUserInput);
                if (book == null) {
                    System.out.println("Das Buch existiert nicht.");
                } else {
                    System.out.println("Das Buch mit dem Titel " + book.getTitle() + " wurde gefunden.");
                }
                break;

            case 2:
                System.out.println("Von welchem Buch möchten Sie die Verfügbarkeit abfragen?");
                System.out.println("Bitte geben Sie den Titel von dem Buch ein!");

                String titleFromUserInput1 = scanner.next();
                Book bookV = myLibrary.searchBook(titleFromUserInput1);

                if (bookV == null) {
                    System.out.println("Das Buch existiert nicht.");
                } else {
                    if (!bookV.isAvailable()) {

                        ZonedDateTime returnDateFromBook = myLibrary.getReturnDateFromBook(bookV);

                        System.out.println("Das Buch mit dem Titel ist am: " + returnDateFromBook + " wieder verfügbar.");
                    } else {
                        System.out.println("Das Buch ist bereits verfügbar.");
                    }
                }
        }
    }
}