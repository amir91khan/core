package collection1;
import java.util.*;
public class PriorityTest1 {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		for(int i=0;i<=10;i++)
		{
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println("poll:"+q);
		System.out.println(q.peek());
		System.out.println("peek:"+q);
		System.out.println(q.remove());
		System.out.println("remove:"+q);
		System.out.println(q.element());
		System.out.println("element:"+q);
		
		

	}

}
