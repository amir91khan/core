package collection1;

import java.util.*;

public class SortedSet1 {

	public static void main(String[] args) {
		SortedSet<Integer> s = new TreeSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		System.out.println("first:" + s.first());
		System.out.println("last:" + s.last());
		System.out.println("headSet:" + s.headSet(40));
		System.out.println("tailSet:" + s.tailSet(40));
		System.out.println("subSet:" + s.subSet(20, 50));
		System.out.println("Comparator:" + s.comparator());

	}

}
