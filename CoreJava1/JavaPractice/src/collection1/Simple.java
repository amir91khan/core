package collection1;
import java.util.*;
import java.io.*;
public class Simple {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(new Student(101,"David",22));
		al.add(new Student(102,"Sam",23));
		al.add(new Student(103,"Nick",24));
		al.add(new Student(104,"Zerry",25));
		System.out.println("Sorting by name....");
		Collection.sort(al,new NameComparato)
		

	}

}
