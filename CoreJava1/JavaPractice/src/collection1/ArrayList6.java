package collection1;
import java.util.*;
public class ArrayList6 {

	public static void main(String[] args) {
		ArrayList<String>al1=new ArrayList<String>();
		al1.add("sam");
		al1.add("David");
		al1.add("Nick");
		ArrayList<String>al2=new ArrayList<String>();
		al2.add("Mak");
		al2.add("Jack");
		al2.add("Robin");
		al1.addAll(al2);
		Iterator i=al1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
