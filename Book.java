package library;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isAvailable; 
	
	//Constructor to initialize a new book
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isAvailable = true; // Book is available when created
		
	}
	
	//Getters
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	//Setter for availability
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	//Method to display book in details 
	@Override
	public String toString() {
		return "Title: " + title +
				"\nAuthor: " + author +
				"\nISBN: " +isbn +
				"\nAvailable: " + (isAvailable ? "Yes" : "No");
	}
}
