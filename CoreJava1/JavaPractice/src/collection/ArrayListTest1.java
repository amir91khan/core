package collection;
import java.util.*;
public class ArrayListTest1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(1.5f);
		al.add("java");
		al.add("oracle");
		al.add(true);
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
	}

}
