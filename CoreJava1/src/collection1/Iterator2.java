package collection1;
import java.util.*;
public class Iterator2 {

	public static void main(String[] args) {
		LinkedHashSet l=new LinkedHashSet();
		l.add("abb");
		l.add("ddd");
		l.add("ccc");
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);
		}
		

	}

}
