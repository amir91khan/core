package collection1;

import java.util.*;

public class ArrayListTest1 {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(1.5f);
		al1.add("java");
		al1.add(true);
		System.out.println(al1.size());
		for (int i = 0; i < al1.size(); i++)
			System.out.println(al1.get(i));

	}

}
