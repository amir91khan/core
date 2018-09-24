package collection1;
import java.util.*;
public class HashTable1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> h=new Hashtable<Integer,String>();
		h.put(1, "A");
		h.put(2, "B");
		h.put(3, "C");
		h.put(1, "D");
		h.put(4, "C");
		System.out.println(h);
		
		

	}

}
