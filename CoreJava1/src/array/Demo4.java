package array;
import java.util.Scanner;
public class Demo4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]=new int[3];
		System.out.println("input three integers");
		int i;
		for(i=0;i<3;i++)
			a[i]=scan.nextInt();
		System.out.println("integers are");
		for(i=0;i<3;i++)
			System.out.println(a[i]);
		
		

	}

}
