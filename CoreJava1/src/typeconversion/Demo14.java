package typeconversion;
import java.util.Scanner;
public class Demo14 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("input any course name");
		String name=scan.next();
		switch(name)
		{
		case "java":
			System.out.println("java fee 1000");
			break;
		case "oracle":
			System.out.println("oracle fee free");
			break;
		case "python":
			System.out.println("python fee 1500");
			break;
			default:
				System.out.println("invalid course name");
		}
		
	

	}

}
