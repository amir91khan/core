package collection1;
import java.util.*;
public class ArrayList7 {

	public static void main(String[] args) {
		
ArrayList<String>al1=new ArrayList<String>();
al1.add("sam");
al1.add("David");
al1.add("Nick");
ArrayList<String>al2=new ArrayList<String>();
al2.add("Mack");
al2.add("Jack");
al1.remove("Nick");
al1.removeAll(al2);
//System.out.println("nassd");
Iterator i=al1.iterator();

while(i.hasNext())
{
	System.out.println(i.next());
}
	}

}
