package collection;

import java.util.function.*;
import java.util.*;

public class ArrayListTest3 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("oracle");
		al.add("python");
		// al.forEach(System.out::println);
		// al.forEach(c);
		Consumer<String> c = (n) -> System.out.println(n);
		al.forEach(c);

	}

}
