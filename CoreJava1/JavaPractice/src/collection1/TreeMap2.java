package collection1;

import java.util.*;

public class TreeMap2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<Integer, String>(new MyComparator11());
		t.put(10, "A");
		t.put(50, "B");
		t.put(30, "C");
		t.put(40, "D");
		System.out.println(t);

	}

}

class MyComparator11 implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}
