package collection1;

import java.util.*;

public class IMap1 {

	public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<Integer,String>();
		Integer i1=new Integer(10);
		Integer i2=new Integer(20);
		map.put(i2, "oracle");
		
		//map.put(i2, "java");
		map.putIfAbsent(i2, "c");
		
		System.out.println(map);
		System.out.println(i1.equals(i2) );
		System.out.println(i1==i2);
		

	}

}
