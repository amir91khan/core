package collection1;

import java.util.*;

class Book2 {
	int id;
	String name, author, publisher;
	int qty;

	public Book2(int id, String name, String author, String publisher, int qty) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.qty = qty;
	}
}

public class HashSet3 {

	public static void main(String[] args) {
		HashSet<Book2> hs = new HashSet<Book2>();

		Book2 b1 = new Book2(101, "JAVA", "JG", "ABC", 50);

		Book2 b2 = new Book2(102, "ORACLE", "SUN", "PQR", 100);
		Book2 b3 = new Book2(103, "Angular JS", "Google", "XYZ", 50);
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		for (Book2 b : hs) {
			System.out.println(b.id + "\t" + b.name + "\t" + b.author + "\t\t" + b.publisher + "\t" + b.qty);

		}

	}

}
