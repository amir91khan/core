package collection1;
import java.util.*;
public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("David");
		al.add("sam");
		al.add("alice");
		al.add("Nick");
		Iterator i=al.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		

	}

}
