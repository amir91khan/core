package collection1;
import java.util.*;
public class PriorityTest2 {

	public static void main(String[] args) {
		PriorityQueue<String> q=new PriorityQueue(15,new MyComparator12());
		q.offer("A");
		q.offer("B");
		q.offer("C");
		q.offer("D");
		System.out.println(q);
		

	}

}
class MyComparator12 implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1=(String)o1;
		
	}
	
}
