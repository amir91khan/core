package collection1;
import java.util.ArrayList;
public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println("Initial size of ArrayList:"+al.size());
		al.add("Red");
		al.add("Green");
		al.add("Blue");
		al.add("pink");
		al.add("Orange");
		System.out.println("\n Size of ArrayList after addition:"+al.size());
		System.out.println("\n Contents of ArrayList add:"+al);
		al.remove(4);
		System.out.println("remove:"+al);
		al.remove("Pink");
		System.out.println("remove1:"+al);
		System.out.println("deletion:"+al.size());
		String alElement=(String)(al.get(1));
		System.out.println("alElement:"+alElement);
		al.add(2, alElement+"rose");
		System.out.println(al);
		
		

	}

}
