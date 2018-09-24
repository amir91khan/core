package collection1;
import java.util.function.*;
import java.util.*;
public class ForEachALTest2 {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("java");
		al.add("oracle");
		al.add("python");
		Consumer<String>c=System.out::println;
		al.forEach(c);
		//al.forEach(System.out::println);
		

	}

}
