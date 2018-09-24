package collection1;
import java.util.*;
public class LinkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
		hm.put(100,"David");
		hm.put(200,"Sam");
		hm.put(300,"Nick");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		

	}

}
