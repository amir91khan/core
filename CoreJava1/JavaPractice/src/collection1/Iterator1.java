package collection1;
import java.util.*;
public class Iterator1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("abc");
		al.add("bbc");
		al.add("xyz");
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);
		}
		

	}

}
