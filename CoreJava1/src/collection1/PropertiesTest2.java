package collection1;
import java.util.*;
import java.io.*;
public class PropertiesTest2 {

	public static void main(String[] args)throws Exception {
		Properties p=new Properties();
		FileReader reader=new FileReader("db.properties");
		p.load(reader);
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
		

	}

}
