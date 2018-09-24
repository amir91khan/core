package collection1;

import java.util.*;

class Student1 {
	private int rno;
	private String name;

	Student1(int rno, String name) {
		this.rno = rno;
		this.name = name;
	}

	public int hashCode() {
		return rno;
	}

	public boolean equals(Object o) {
		Student1 s = (Student1) o;
		if (rno == s.rno)
			return true;
		else
			return false;

	}

	void printStudent1() {
		System.out.println(rno + "" + name);
	}

}

public class HashSet2 {

	public static void main(String[] args) {
		HashSet<Student1> hs = new HashSet<Student1>();
		hs.add(new Student1(01, "aamir"));
		hs.add(new Student1(02, "khan"));
		hs.add(new Student1(03, "David"));
		hs.add(new Student1(04, "Sam"));
		Iterator<Student1> i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
