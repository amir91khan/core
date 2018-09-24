package collection1;
import java.util.*;
public class WeakHashMap1 {

	public static void main(String[] args)throws Exception {
		WeakHashMap map=new WeakHashMap();
		Temp t=new Temp();
		map.put(t, "Sam");
		System.out.println(map);//temp=sam
		//t=null;
		//System.gc();
		Thread.sleep(500);
		System.out.println(map);
		
	}
}
class Temp
{
	public String toString()
	{
		return "Temp";
	}
	public void finalize()
	{
		System.out.println("finalize method calls");
	}
}