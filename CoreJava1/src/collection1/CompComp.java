package collection1;

import java.util.*;

class Employee implements Comparable {
	String name;
	int id;

	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return name + "-----" + id;
	}

	public int compareTo(Object o) {
		int id1 = this.id;
		int id2 = ((Employee) o).id;
		if (id1 < id2) {
			return -1;
		} else if (id1 > id2) {
			return +1;

		} else {
			return 0;
		}
	}
}

public class CompComp {

	public static void main(String[] args) {
		Employee e1 = new Employee("David", 101);
		Employee e2 = new Employee("Sam", 102);
		Employee e3 = new Employee("Zerry", 103);
		Employee e4 = new Employee("Nick", 104);
		TreeSet t1 = new TreeSet();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		System.out.println(t1);
		TreeSet t2 = new TreeSet(new MyComparator3());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		System.out.println(t2);

	}

}

class MyComparator3 implements Comparator {
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}

}
