package collection1;

import java.util.*;

class Book {
	int id;
	String name, author, publisher;
	int qty;

	public Book(int id, String name, String author, String publisher, int qty) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.qty = qty;
	}
}

public class ArrayList9 {

	public static void main(String[] args) {
		ArrayList<Book> al = new ArrayList<Book>();
		Book b1 = new Book(101, "aamir", "khan", "java", 5);
		Book b2 = new Book(102, "khan", "jack", "python", 4);
		Book b3 = new Book(103, "sam", "david", "oracle", 6);
		al.add(b1);
		al.add(b2);
		al.add(b3);
		for (Book b : al) {
			System.out.println(b.id + "" + b.name + "" + b.author + "" + b.publisher + "" + b.qty);
		}

	}

}
