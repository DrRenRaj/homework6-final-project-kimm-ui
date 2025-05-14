package library;



import java.util.ArrayList;

// class that manages the collection of books
public class Library {
    private ArrayList<Book> books;

    // constructor to initialize the list
    public Library() {
        books = new ArrayList<>();
    }

    // add a new book if ISBN is not already in the list
    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                System.out.println("A book with this ISBN already exists.");
                return;
            }
        }
        books.add(book);
        System.out.println("Book added successfully.");
    }

    // removing a book by ISBN
    public void removeBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                books.remove(b);
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book with that ISBN was not found.");
    }

    //all books in the library
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (Book b : books) {
            System.out.println("---");
            System.out.println(b.toString());
        }
        System.out.println("---");
    }

    // search books by title
    public void searchByTitle(String title) {
        boolean found = false;
        for (Book1 b : books) {
            if (b.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(b.toString());
                System.out.println("---");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found with that title.");
        }
    }

    // search books by author
    public void searchByAuthor(String author) {
        boolean found = false;
        for (Book b : books) {
            if (b.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                System.out.println(b.toString());
                System.out.println("---");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by that author.");
        }
    }

    // book as checked out
    public void checkOutBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                if (!b.isAvailable()) {
                    System.out.println("This book is already checked out.");
                } else {
                    b.setAvailable(false);
                    System.out.println("Book checked out successfully.");
                }
                return;
            }
        }
        System.out.println("Book with that ISBN was not found.");
    }

    //book as returned (available)
    public void returnBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                if (b.isAvailable()) {
                    System.out.println("This book is already available.");
                } else {
                    b.setAvailable(true);
                    System.out.println("Book returned successfully.");
                }
                return;
            }
        }
        System.out.println("Book with that ISBN was not found.");
    }
}
