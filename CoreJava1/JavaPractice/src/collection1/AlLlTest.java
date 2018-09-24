package collection1;

import java.util.*;

public class AlLlTest {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		List<String> al2 = new LinkedList<String>();
		al2.add("david");
		al2.add("sam");
		al2.add("Nick");
		System.out.println("arrayList:" + al);
		System.out.println("linkedList:" + al2);

	}

}
