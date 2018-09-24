package collection1;
import java.util.*;
public class ListIterator1 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("aamir");
		l.add("David");
		l.add("Sam");
		l.add("Nick");
		System.out.println(l);
		ListIterator i=l.listIterator();
		while(i.hasNext())
		{
			String s=(String)i.next();
			if(s.equals("David"))
			{
				i.remove();
			}
		}
		System.out.println(l);

	}

}
