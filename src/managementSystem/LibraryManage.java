package managementSystem;

import java.util.Scanner;
public class LibraryManage {

	public static void main(String[] args) {
		// Creating a new data structure for storing the Books
		Library library=new Library();
		// Creating a new LibraryService object to perform changes in the database
		LibraryService service=new LibraryService(library);
		//Scanner for Taking input from user
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			// All options Required
			System.out.println("\n Digital Library Management Systen");
			System.out.println("1.Add a Book");
			System.out.println("2. View All Books");
	        System.out.println("3. Search Book by ID or Title");
	        System.out.println("4. Update Book Details");
	        System.out.println("5. Delete a Book Record");
	        System.out.println("6. Exit");
	        System.out.print("Enter your choice: ");
	        
	        // Checking for invalid choice
	        if(!scan.hasNextInt()) {
	        	System.out.println(" Invalid option. Please try agian!");
	        	scan.next();
	        	continue;
	        }
	        int choice=scan.nextInt();
	        scan.nextLine();
	        
	        switch(choice) {
	        //To add Book
	        case 1:
	        	System.out.println("Enter Book Id:");
	        	int id=scan.nextInt();
	        	scan.nextLine();
	        	
	        	System.out.println("Enter Title:");
	        	String title=scan.nextLine();
	        	
	        	System.out.println("Enter Author:");
	        	String author=scan.nextLine();
	        	
	        	System.out.println("Enter Genre:");
	        	String genre=scan.nextLine();
	        	
	        	System.out.println("Enter Availability Status i.e. (Available / Checked out)");
	        	String avail=scan.nextLine();
	        	
	        	service.addbook(id, title, author, genre, avail);
	        	break;
	        // Display all Books	
	        case 2:
	        	service.viewAllBooks();
	        	break;
	        // Search a particular Book using BookId or Title
	        case 3:
	        	System.out.println("Enter Book ID or Book Title");
	        	String search=scan.nextLine();
	        	service.SearchBook(search);
	        	break;
	        // Update Book details
	        case 4:
	        	System.out.println("Enter the Book Id to update");
	        	int BookId= scan.nextInt();
	        	scan.nextLine();
	        	
	        	System.out.println("Enter new title");
	        	String newTitle=scan.nextLine();
	        	
	        	System.out.println("Enter new author");
	        	String newAuthor=scan.nextLine();
	        	
	        	System.out.println("Enter new genre");
	        	String newGenre=scan.nextLine();
	        	
	        	System.out.println("Enter new Status");
	        	String newAvail=scan.nextLine();
	        	
	        	service.update(BookId, newTitle, newAuthor, newGenre, newAvail);
	        	break;
	        // Deleting a Book
	        case 5:
	        	System.out.println("Enter Book Id to delete");
	        	int DeleteId=scan.nextInt();
	        	service.deleteBook(DeleteId);
	        	break;
	       // Exiting the System
	        case 6:
	        	System.out.println("Exiting System...");
	        	scan.close();
	        	return;
	        
	        default :
	        	System.out.println("Invalid option");
	        }
	        
		}
	}
}
