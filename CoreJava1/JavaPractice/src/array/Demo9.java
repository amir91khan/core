package array;
import java.util.Scanner;
public class Demo9 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		int marks[][]=new int[3][3];
		System.out.println("input marks");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				marks[i][j]=scan.nextInt();
				System.out.println("marks are...");
				for(int x[]:marks)
				{
					for(int m:x)
						System.out.printf("%3d",m);
					System.out.println();
				}
		
		

	}

}
