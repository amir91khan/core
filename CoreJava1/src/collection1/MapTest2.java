package collection1;
import java.util.*;
public class MapTest2 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"David");
		map.put(2,"Sam");
		map.put(3,"Nick");
		map.put(4,"Zerry");
		Set s=map.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		

	}

}
