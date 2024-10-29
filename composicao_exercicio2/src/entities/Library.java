package entities;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private String name;
	private String address;

	List<Book> Books = new ArrayList<>();

	public Library() {
	}

	public Library(String name, String address, List<Book> books) {
		this.name = name;
		this.address = address;
		Books = books;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void addBook(Book book) {
		Books.add(book);
	}

	public void removeBook(Book book) {
		Books.remove(book);
	}

	@Override
	public String toString() {
		return 
				"Library name: " + name + "\n" +
				"Address: " + address + "\n" + 
				;
	}
	
	

}
