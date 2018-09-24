package collection;

import java.util.*;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("oracle");
		al.add("python");
		for (String c : al)
			System.out.println(c);

	}

}
