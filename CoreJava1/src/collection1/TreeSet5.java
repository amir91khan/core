package collection1;
import java.util.*;
public class TreeSet5 {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		System.out.println(t);
		

	}

}
class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		if(i1<i2)
		
			return -1;
		else	if(i1>i2)
				return +1;
		else
			return 0;
			
		
	}
}
