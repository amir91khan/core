package collection;

import java.util.*;
import java.util.function.*;

public class ArrayListTest4 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(55);
		Consumer<Integer> c = (e) -> {
			int n = e;
			if (n % 2 == 0)
				System.out.println("Even:" + n);
			else
				System.out.println("odd:" + n);
		};
		al.forEach(c);

	}

}
