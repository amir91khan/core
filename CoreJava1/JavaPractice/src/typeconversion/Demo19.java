package typeconversion;
import java.util.Scanner;
public class Demo19 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("input any number");
		int num=scan.nextInt();
		int n=num;
		int sum=0;
		while(num!=0)
		{
			int r=num%10;
			sum=sum+(r*r*r);
			num=num%10;
		}
		if(n==sum)
			System.out.println("armstrong no");
		else
			System.out.println("not armstrong no");
	}

}
