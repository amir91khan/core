package collection1;
import java.util.*;
import java.util.function.*;
public class ForEachALTest3 {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(47);
		Consumer<Integer>c=(e)->{
			int n=e;
			if(n%2==0)
				System.out.println("Even"+n);
			else
				System.out.println("Odd:"+n);
		};
		al.forEach(c);

	}

}
