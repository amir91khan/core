package collection1;
import java.util.*;
public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList<Integer>Q=new LinkedList<Integer>();
		Q.addLast(10);
		Q.addLast(20);
		Q.addLast(30);
		System.out.println(Q.removeFirst());
		System.out.println(Q.removeLast());
		

	}

}
