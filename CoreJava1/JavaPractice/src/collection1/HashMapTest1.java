package collection1;
import java.util.*;
public class HashMapTest1 {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer,String>();
		
     m.put(100,"abc");
     m.put(101, "pqr");
     m.put(102, "xyz");
     for(Map.Entry e:m.entrySet())
     {
    	 System.out.println(e.getKey()+"\t"+e.getValue());
     }
	}

}
