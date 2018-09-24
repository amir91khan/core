package collection1;

import java.util.*;

public class NavigableSet1 {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		System.out.println(t);
		System.out.println(t.ceiling(40));
		System.out.println(t.higher(40));
		System.out.println(t.floor(40));
		System.out.println(t.lower(40));
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		System.out.println(t.descendingSet());
		System.out.println(t);

	}

}
