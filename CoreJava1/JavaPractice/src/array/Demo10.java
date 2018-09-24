package array;
import java.util.Scanner;
public class Demo10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("input how many rows");
		int r=scan.nextInt();
		int a[][]=new int[r][];
		System.out.println("input number of columns for each row");
		int i,j;
		for(i=0;i<r;i++)
		{
			int c=scan.nextInt();
			a[i]=new int[c];
		}
		System.out.println("input elements");
		for(i=0;i<r;i++)
			for(j=0;j<a[i].length;j++)
				a[i][j]=scan.nextInt();
		System.out.println(int x[]:a);
		{
		for(int e:x)
			System.out.printf("%3d",e);
		System.out.println();
		}

	}

}
