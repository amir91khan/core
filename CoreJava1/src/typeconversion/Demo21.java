package typeconversion;

public class Demo21 {

	public static void main(String[] args) {
		int i=1;
		while(i<=5)
		{
			char ch='A';
			while(ch<='E')
			{
				System.out.printf("%c", ch);
				ch=(char)(ch+1);
			}
			System.out.println();
			i=i+1;
		}

	}

}
