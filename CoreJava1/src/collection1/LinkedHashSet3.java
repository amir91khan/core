package collection1;

import java.util.*;

class Book3 {
	int id;
	String name, author, publisher;
	int qty;

	Book3(int id, String name, String author, String publishe, int qty) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.qty = qty;
	}
}

public class LinkedHashSet3 {

	public static void main(String[] args) {
		LinkedHashSet<Book3> h = new LinkedHashSet<Book3>();
		Book3 b1 = new Book3(101, "JAVA", "GS", "ABC", 500);
		Book3 b2 = new Book3(102, "ORACLE", "SUN", "PQR", 100);
		Book3 b3 = new Book3(103, "ANGULAR JS", "GOOGLE", "XYZ", 100);
		h.add(b1);
		h.add(b2);
		h.add(b3);
		for (Book3 b : h) {
			System.out.println(b.id + "\t" + b.name + "" + b.author + "\t" + b.publisher + "\t" + b.qty);
		}

	}

}
