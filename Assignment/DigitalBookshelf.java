import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {

    String isbn;
    String title;
    String author;
    boolean isAvailable;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void display() {
        System.out.println("ISBN: " + isbn +
                " | Title: " + title +
                " | Author: " + author +
                " | Available: " + isAvailable);
    }
}

class Library {

    List<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void displayAllBooks() {

        for (Book b : books) {
            b.display();
        }
    }

    void displayAvailableBooks() {

        for (Book b : books) {
            if (b.isAvailable) {
                b.display();
            }
        }
    }

    void borrowBook(String isbn) {

        for (Book b : books) {

            if (b.isbn.equals(isbn)) {

                if (b.isAvailable) {
                    b.isAvailable = false;
                    System.out.println("Success! Book borrowed.");
                } else {
                    System.out.println("Sorry, this book is currently checked out.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    void returnBook(String isbn) {

        for (Book b : books) {

            if (b.isbn.equals(isbn)) {
                b.isAvailable = true;
                System.out.println("Book returned successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }
}

public class DigitalBookshelf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        library.addBook(new Book("978-01", "Java Basics", "James Gosling"));
        library.addBook(new Book("978-02", "Data Structures", "Mark Allen"));
        library.addBook(new Book("978-03", "Operating Systems", "Andrew Tanenbaum"));

        int choice;

        while (true) {

            System.out.println("\n--- Digital Bookshelf ---");
            System.out.println("1. View All Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    library.displayAllBooks();
                    break;

                case 2:
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    library.borrowBook(isbn);
                    break;

                case 3:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}