package collection1;
import java.util.*;
public class TressSet6 {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>(new MyComparator1());
		t.add("Sam");
		t.add("David");
		t.add("Nick");
		t.add("Zerry");
		System.out.println(t);
		

	}

}
class MyComparator1 implements Comparator
{
	public int compare(Object o1,Object o2 )
	{
	String s1=o1.toString();
	String s2=(String)o2;
	return s1.compareTo(s2);
}
}
