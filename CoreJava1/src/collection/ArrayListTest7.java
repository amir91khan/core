package collection;

import java.util.*;

public class ArrayListTest7 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("aamir");
		al.add("khan");
		al.add("sahil");
		al.add("rahman");
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("sam");
		al1.add("david");
		al.removeAll(al1);
		System.out.println("iterating the elements after removing the elements of al1");
		Iterator i = al.iterator();
		while (i.hasNext()) {
			System.out.println((i.next()));
		}

	}

}
