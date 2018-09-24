package array;
import java.util.Scanner;
public class Demo8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("input elements of matrix");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				a[i][j]=scan.nextInt();
		System.out.println("elements are...");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.printf("%3d",a[i][j]);
			System.out.println();
		}
		
	}

}
