package managementSystem;
import java.util.HashMap;
import java.util.Map;

public class Library {
	// Map for storing Books collection
	
	//Map will work as a data structure which will contain all the books
	private Map<Integer,Book> Catalog;
	public Library() {
		Catalog=new HashMap<>();
	}

	public Map<Integer,Book> getBooks(){
		return Catalog;
	}
	// These all are the operations that Service layer will use to make changes in the data structure
	public void addBook(Book book) {
		Catalog.put(book.getId(), book);
	}
	public Book getBook(int id) {
		return Catalog.get(id);
	}
	public boolean  containsBook(int id) {
		return Catalog.containsKey(id);
	}
	public void removeBook(int id) {
		Catalog.remove(id);
	}
}
