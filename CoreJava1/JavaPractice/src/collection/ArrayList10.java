package collection;
import java.util.*;
public class ArrayList10 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println("initial size of ArryaList:"+al.size());
		al.add("Red");
		al.add("Green");
		al.add("Blue");
		al.add("Pink");
		al.add("Orange");
		System.out.println("\n Size of  ArrayList after addition:"+al.size());
		System.out.println("\n Contents of ArrayList after add:"+al);
		al.remove(4);
		System.out.println("\nContents ArrayList remove index:"+al);
		al.remove("Pink");
		System.out.println("\nContents ofArrayList after remove object:"+al);
		System.out.println("\nSize of ArrayList after dleltions:"+al.size());
		String alElements=(String)(al.get(1));
		System.out.println("alElements:"+alElements);
		al.add(2, alElements+"rese");
		System.out.println(al);
		

	}

}
