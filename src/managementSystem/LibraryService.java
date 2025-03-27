package managementSystem;

import java.util.Map;
public class LibraryService {
	private Library library;
	// Default constructor
	public LibraryService() {
		this.library=new Library();
	}	
	
	//Parameterized Constructor
	public LibraryService(Library library) {
		this.library= library;
		
	}
	
	// Adding Book
	public void addbook(int id,String title,String author,String genre,String availStatus) {
		if(library.containsBook(id)) {
			System.out.println("Book Id akready exist");
			return;
		}
		// Checking whether title and author name are not empty
		if(title.isEmpty()|| author.isEmpty()) {
			System.out.println("Title or Author can't be empty");
			return;
		}//Checking whether Status is  Available or Checked Out
		if(!availStatus.equalsIgnoreCase("Available")&& !availStatus.equalsIgnoreCase("Checked Out")) {
			System.out.println("Invalid Status. Use either 'Available' or  'Checked Out' ");
			return;
		}
		// New book is added
		Book newBook= new Book(id,title,author,genre,availStatus);
		library.addBook(newBook);
		System.out.println("Book is added now");
	}
	
	// To view all Books
	public void viewAllBooks() {
		
		Map<Integer,Book>books=library.getBooks();
		if(books.isEmpty()) {
			System.out.println("No Books available right now");
			return;
		}
		//For each loop is used for traversing
		for(Book book: books.values()) {
			System.out.println(book);
		}
	}
	
	// Searching a Book using BookId or Title
	public void SearchBook(String search) {
		Map<Integer,Book>books=library.getBooks();
		boolean found=false;
		
	// try catch is used because if id is used then try block will run 
	//If not then catch block will run for title and it will interrupt the flow of program
	try {
		int id=Integer.parseInt(search);
		// Whether it contains book or not
		if(books.containsKey(id)) {
			System.out.println(books.get(id));
			found=true;
		}
	}// Checking by using title
	catch(NumberFormatException e){ 
			for(Book book:books.values()) {
				if(book.getTitle().equalsIgnoreCase(search)) {
					System.out.println(book);
					found=true;
				}
			}
	}
	 if(!found) {
		 System.out.println("No such book is found");
	 }
		
	}
	
	// Update book details using Book id
	public void update(int id ,String title,String author,String genre,String availStatus) {
		if(!library.containsBook(id)) {
			System.out.println("No book found");
			return;
		}
		Book book=library.getBook(id);
		if(!title.isEmpty()) { // title is not Empty
			book.setTitle(title);
		}
		if(!author.isEmpty()) {// Author is not Empty
			book.setAuthor(author);
		}
		if(!genre.isEmpty()) {//Genre is not Empty
			book.setGenre(genre);
		}
		if(availStatus.equalsIgnoreCase("Available")||availStatus.equalsIgnoreCase("Checked Out")) {
			book.setAvailStatus(availStatus);
		}
		System.out.println("Book is updated successfully");
	}
	// Deleting a Book using Book ID
	public void deleteBook(int id) {
		if(library.containsBook(id)) {
			library.removeBook(id);
			System.out.println("Book is deleted successfully");
		}
		else {
			System.out.println("No such book is found");
		}
	}

}
