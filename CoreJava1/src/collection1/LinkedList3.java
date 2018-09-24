package collection1;
import java.util.*;
public class LinkedList3 {

	public static void main(String[] args) {
		LinkedList<Integer>dq=new LinkedList<Integer>();
		dq.addFirst(10);
		dq.addFirst(20);
		dq.addLast(30);
		dq.addFirst(40);
		//System.out.println(dq.removeFirst());
		System.out.println(dq.removeLast());
		

	}

}
