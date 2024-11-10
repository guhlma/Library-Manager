package LibraryManager;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Library myLibrary = new Library();
        Book myFirstBook = new Book("123456", "CleanCode", "Angela Mekel", "Krimi");
        Member createdMember = myLibrary.createMember("Malte");
        Employee createdEmployee = myLibrary.createEmployee("Peter","123Tobi123");
        myLibrary.addBookToLibrary(myFirstBook);

        System.out.println("Sind Sie Mitarbeiter oder Kunde?");
        System.out.println("1: Mitarbeiter");
        System.out.println("2: Kunde");

        int inputHumanChoice = scanner.nextInt();
        if (inputHumanChoice == 1){
            System.out.println("Geben Sie Ihr Passwort ein: ");
            String passwordInput = scanner.next();
            Employee employee = myLibrary.searchEmployee(passwordInput);

            if (employee != null){
                System.out.println("Erfolgreich eingeloggt: " + employee.getName()) ;
                System.out.println();
            } else {
                System.out.println("Falsches Passwort. Probieren Sie es erneut!");
                return;
            }
        }

        System.out.println("Willkommen in der Library. Bitte wählen Sie eine Option:");
        System.out.println("1: Buch suchen");  // if available
        System.out.println("2: Buch Verfügbarkeit abfragen");  // if available
        System.out.println("3: Buch ausleihen");
        System.out.println("4: Buch zurückgeben");
        System.out.println("5: Liste der Bücher die verliehen sind");
        System.out.println("6: Beenden");

        // Mitarbeiter fürs hinzufügen neues Bücher (mit pw abfrage) u. Mitglieder Optionen todo

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
                break;

            case 3: //

                System.out.println("Welches Buch möchten Sie ausleihen?");
                System.out.println("Folgende Bücher stehen zur Auswahl:");
                ArrayList<Book> allBooks = myLibrary.getAllBooks();

                for (Book oneBookFromAll : allBooks) {
                    System.out.println("Buch: " + oneBookFromAll.getTitle());
                }

                String titleFromUserInput2 = scanner.next();
                Book bookToBorrow = myLibrary.searchBook(titleFromUserInput2);

                if (bookToBorrow == null) {
                    System.out.println("Das Buch existiert nicht.");
                } else {

                    if (!bookToBorrow.isAvailable()) {
                        System.out.println("Das Buch ist derzeit nicht da.");

                    } else {
                        myLibrary.borrowBook(bookToBorrow, createdMember, ZonedDateTime.now().plusDays(7));
                        System.out.println("Buch erfolgreich ausgeliehen!");
                    }
                }
                break;
        }
    }
}