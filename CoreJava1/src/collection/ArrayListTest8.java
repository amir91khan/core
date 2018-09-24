package collection;

import java.util.*;

public class ArrayListTest8 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("sam");
		al.add("david");
		al.add("nik");
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("sam");
		al1.add("zarry");
		al.retainAll(al1);
		System.out.println("iterating the elements after retaining elements of al1");
		Iterator i = al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
