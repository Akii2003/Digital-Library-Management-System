package managementSystem;

public class Book {
	// Book Data members which tells us what information does a book contain
	private int id;
	private String title;
	private String author;
	private String genre;
	private String availStatus;
	
	// Default Constructor
	public Book () {};
	// Parameterized Constructor
	public Book(int id, String title, String author, String genre, String availStatus) {
		
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.availStatus = availStatus;
	}
	
	// Getter  and Setter for id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	// Getter  and Setter for title
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	// Getter  and Setter for author
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	// Getter  and Setter for Genre
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	// Getter  and Setter for AvailStatus
	public String getAvailStatus() {
		return availStatus;
	}
	public void setAvailStatus(String availStatus) {
		this.availStatus = availStatus;
	}
	
	// toString method for printing all the details for Book
	@Override
	public String toString() {
		return "Id :" + id + ", Title :" + title + ", Author=" + author + ", Genre=" + genre + ", AvailabiltyStatus="
				+ availStatus ;
	}
	
	

}
