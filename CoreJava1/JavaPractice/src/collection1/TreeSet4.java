package collection1;

import java.util.*;

class Stud implements Comparable<Stud> {

	int id;
	String name;
	String author;
	String publisher;
	int qty;

	Stud(int id, String name, String author, String publisher, int qty) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.qty = qty;
	}

	public int compareTo(Stud s) {
		if (id > s.id) {
			return +1;
		} else if (id < s.id) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class TreeSet4 {

	public static void main(String[] args) {
		Set<Stud> t = new TreeSet<Stud>();
		Stud s1 = new Stud(101, "Java", "Sun", "ABC", 500);
		Stud s2 = new Stud(102, "Oracle", "Sun", "Pqr", 400);
		Stud s3 = new Stud(103, "Angular", "Google", "XYZ", 600);
		t.add(s1);
		t.add(s2);
		t.add(s3);
		for (Stud s : t) {
			System.out.println(s.id + "\t" + s.name + "\t" + s.author + "\t" + s.publisher + "\t" + s.qty);
		}

	}

}
