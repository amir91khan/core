package collection1;

import java.util.*;

public class ArraySort1 {

	public static void main(String[] args) {
		int[] a = { 10, 5, 20, 11, 6 };
		System.out.println("primitive array before sorting");
		for (int a1 : a) {
			System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("primitive array after sorting");
		for (int a1 : a) {
			System.out.println(a1);
		}
		String[] s = { "A", "C", "B", "D" };
		System.out.println("object array before sorting");
		for (String s1 : s) {
			System.out.println(s1);
		}
		Arrays.sort(s);
		System.out.println("object array after sorting");
		for (String s1 : s) {
			System.out.println(s1);
		}
		Arrays.sort(s, MyComparator15());
		System.out.println("object array after sorting by comparator");
		for (String s1 : s) {
			System.out.println(s);
		}

	}

	private static Comparator MyComparator15() {

		return null;
	}

}

class MyComparator15 implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);

	}

}
