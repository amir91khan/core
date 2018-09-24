package collection;

import java.util.*;

public class ArrayListTest6 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("sam");
		al.add("david");
		al.add("mony");
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("nik");
		al1.add("zarry");
		al1.add("mikal");
		al.addAll(al1);
		Iterator i = al.iterator();
		while (i.hasNext()) {
		System.out.println(i.next());
		}
	}

}
