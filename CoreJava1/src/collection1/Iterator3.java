package collection1;
import java.util.*;
public class Iterator3 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		for(int i=0;i<=10;i++)
		{
			a.add(i);
			
		}
		System.out.println(a);
		Iterator i=a.iterator();
		while(i.hasNext()) {
			Integer in=(Integer)i.next();
			if(in%2==0)
				System.out.println(in);
			else
				i.remove();
		}
		System.out.println(a);

	}
}
