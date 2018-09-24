package collection;

import java.util.*;

class Book {
	int id;
	String name, author, publisher;
	int quantity;

	Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class ArrayListTest9 {

	public static void main(String[] args) {
		ArrayList<Book> al = new ArrayList<Book>();
		Book b1 = new Book(101, "java", "aamir", "NT", 10);
		Book b2 = new Book(102, "python", "khan", "AB", 20);
		Book b3 = new Book(101, "oracle", "david", "GT", 30);
		al.add(b1);
		al.add(b2);
		al.add(b3);
		for (Book b : al) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}

	}

}
