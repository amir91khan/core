package collection1;
import java.util.*;
public class HashTable2 {

	public static void main(String[] args) {
		Hashtable h=new Hashtable();
		h.put(new Temp1(1), "A");
		h.put(new Temp1(2), "B");
		h.put(new Temp1(3), "C");
		System.out.println(h);
		

	}

}
class Temp1
{
	int i;
	Temp1(int i)
	{
		this.i=i;
	}
	public int hashcode()
	{
		return i;
	}
	public String toString()
	{
		return i+"";
	}
}
