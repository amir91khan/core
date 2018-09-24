package collection1;
import java.util.*;
public class LinkedList4 {

	public static void main(String[] args) {
		LinkedList<String>li=new LinkedList<String>();
		li.add("Ravi");
		li.add("Vijay");
		li.add("Ravi");
		li.add("Ajay");
		Iterator<String>i=li.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
