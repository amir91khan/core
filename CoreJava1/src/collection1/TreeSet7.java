package collection1;
import java.util.*;
public class TreeSet7 {

	public static void main(String[] args) {
		TreeSet<Object> t=new TreeSet<Object>(new MyComparator2());
		t.add("A");
		t.add("B");
		t.add(new StringBuffer("AAA"));
		t.add(new StringBuffer("BBB"));
		t.add("C");
		t.add("D");
		System.out.println(t);
		

	}

}
class MyComparator2 implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1=o1.toString();
		String s2=o2.toString();
		int l1=s1.length();
		int l2=s2.length();
		if(l1<l2)
			return -1;
		else	if(l1>l2)
			return +1;
		else
			return s1.compareTo(s2);
	}
}
