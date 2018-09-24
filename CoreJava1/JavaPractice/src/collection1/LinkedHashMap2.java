package collection1;
import java.util.*;
public class LinkedHashMap2 {

	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(101, "Sam");
		map.put(102, "David");
		map.put(103, "Nick");
		map.put(104, "Jerry");
		System.out.println(map);
		map.remove(102);
		System.out.println("remove:"+map);
		

	}

}
