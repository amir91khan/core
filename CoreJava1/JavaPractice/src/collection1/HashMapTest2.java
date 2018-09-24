package collection1;
import java.util.*;
import java.util.Map.Entry;
public class HashMapTest2 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101, "David");
		hm.put(102, "Sam");
		hm.put(103, "Nick");
		for(Map.Entry m:hm.entrySet())
		System.out.println(m.getKey()+"\t"+m.getValue());
		

	}

}
