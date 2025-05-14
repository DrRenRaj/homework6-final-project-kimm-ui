package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // display the menu
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Search by Title");
            System.out.println("5. Search by Author");
            System.out.println("6. Check Out Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");

            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a valid number (1-8): ");
                scanner.next(); 
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();

                    Book newBook = new Book(title, author, isbn);
                    library.addBook(newBook);
                    break;

                case 2:
                    System.out.print("Enter ISBN to remove: ");
                    String removeIsbn = scanner.nextLine();
                    library.removeBook(removeIsbn);
                    break;

                case 3:
                    library.displayAllBooks();
                    break;

                case 4:
                    System.out.print("Enter title to search: ");
                    String searchTitle = scanner.nextLine();
                    library.searchByTitle(searchTitle);
                    break;

                case 5:
                    System.out.print("Enter author to search: ");
                    String searchAuthor = scanner.nextLine();
                    library.searchByAuthor(searchAuthor);
                    break;

                case 6:
                    System.out.print("Enter ISBN to check out: ");
                    String checkoutIsbn = scanner.nextLine();
                    library.checkOutBook(checkoutIsbn);
                    break;

                case 7:
                    System.out.print("Enter ISBN to return: ");
                    String returnIsbn = scanner.nextLine();
                    library.returnBook(returnIsbn);
                    break;

                case 8:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1-8.");
                    break;
            }

        } while (choice != 8);

        scanner.close();
    }
}
