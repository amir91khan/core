package collection1;
import java.util.*;
public class HashMapTest4 {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(101, "Java");
		map.put(102, "Oracle");
	    map.put(103, "Python");
	    map.put(104, "Html");
	    map.remove(102);
	    System.out.println(map);

	}

}
