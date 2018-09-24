package collection1;

import java.util.*;

public class NavigableMap1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> m = new TreeMap<Integer, String>();
		m.put(10, "David");
		m.put(20, "Sam");
		m.put(30, "Nick");
		m.put(40, "Jerry");
		m.put(50, "Dom");
		System.out.println(m);
		System.out.println(m.ceilingKey(40));
		System.out.println(m.higherKey(40));
		System.out.println(m.floorKey(40));
		System.out.println(m.lowerKey(40));
		System.out.println(m.pollFirstEntry());
		System.out.println(m.pollLastEntry());
		System.out.println(m.descendingMap());
		System.out.println(m);

	}

}
