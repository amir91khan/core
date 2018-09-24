package collection1;

import java.util.*;

class Book4 implements Comparable<Book4> {
	int id;
	String name, author, publisher;
	int qty;

	public Book4(int id, String name, String author, String publisher, int qty) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.qty = qty;
	}

	public int compareTo(Book4 b) {
		if (id > b.id) {
			return 1;
		} else if (id < b.id) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class TreeSet3 {

	public static void main(String[] args) {
		Set<Book4> s = new TreeSet<Book4>();
		Book4 b1 = new Book4(101, "Java", "JG", "SUN", 400);
		Book4 b2 = new Book4(102, "Oracle", "SUN", "XYZ", 500);
		Book4 b3 = new Book4(103, "AngularJS", "Google", "PQR", 600);
		s.add(b1);
		s.add(b2);
		s.add(b3);
		for (Book4 b : s) {
			System.out.println(b.id + "\t" + b.name + "\t" + b.author + "\t" + b.publisher + "\t" + b.qty);
		}

	}

}
