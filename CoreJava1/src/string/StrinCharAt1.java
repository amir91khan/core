package string;
import java.util.*;
public class StrinCharAt1 {

	public static void main(String[] args) {
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("input any string");
		String str=scan.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			switch(ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count=count+1;
			}
		}
		
		
		System.out.println("count of vowels:"+count);

	}

}