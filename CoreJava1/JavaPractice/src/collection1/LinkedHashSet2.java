package collection1;

import java.util.*;

public class LinkedHashSet2 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(10);
		h.add(40);
		h.add(50);
		Iterator<Integer> i = h.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
