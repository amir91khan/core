package collection1;
import java.util.*;
import java.io.*;
public class PropertiesTest1 {

	public static void main(String[] args)throws Exception {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);
		String s=p.getProperty("venki");
		System.out.println(s);
		p.setProperty("driver", "jdbc");
		Enumeration e=p.propertyNames();
		while(e.hasMoreElements())
		{
			String s1=(String)e.nextElement();
			System.out.println(s1);
			
		}
		FileOutputStream fos=new FileOutputStream("abc.properties");
		p.store(fos, "upadated by Ammir");

	}

}
