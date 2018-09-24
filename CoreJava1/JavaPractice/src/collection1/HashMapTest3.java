package collection1;

import java.util.*;

public class HashMapTest3 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "David");
		map.put(102, "Sam");
		map.put(103, "Nick");
		System.out.println(map);
		System.out.println(map.put(102, "Sam"));
		Set s = map.keySet();
		System.out.println(s);
		Collection c = map.values();
		System.out.println(c);
		Set s1 = map.entrySet();
		System.out.println(s1);
		Iterator i = s1.iterator();
		while (i.hasNext()) {
			Map.Entry m1 = (Map.Entry) i.next();
			System.out.println(m1.getKey() + "\t" + m1.getValue());
			if (m1.getKey().equals("Sam")) {
				m1.setValue(1000);
			}
		}
		System.out.println(map);
	}

}
