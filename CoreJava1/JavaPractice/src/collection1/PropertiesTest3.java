package collection1;
import java.util.*;
import java.io.*;
public class PropertiesTest3 {

	public static void main(String[] args) {
		Properties p=new Properties();
		Set s=p.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		

	}

}
