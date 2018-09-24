package collection1;
import java.util.*;
import java.io.*;
public class PropertiesTest4 {

	public static void main(String[] args)throws Exception {
		Properties p=new Properties();
		p.setProperty("name", "AamirKhan");
		p.setProperty("email", "aamir@gmail.com");
		p.store(new FileWriter("info.properties"),"JavaPoint Properties");
		

	}

}
