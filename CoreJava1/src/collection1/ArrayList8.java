package collection1;
import java.util.*;
public class ArrayList8 {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("Ravi");
		al.add("Mohan");
		al.add("Karan");
		ArrayList<String>al1=new ArrayList<String>();
		al1.add("Jack");
		al1.add("Mack");
		al.retainAll(al1);
		System.out.println("jhhku");
		Iterator i=al.iterator();
		while(i.hasNext())
		System.out.println(i.next());
		
		

	}

}
