package string;

public class SplitTest3 {

	public static void main(String[] args) {
		String s1="object oriented programming language";
		String s2[]=s1.split(" ");
		for(int i=s2.length-1;i>=0;i--)
			System.out.printf("%s",s2[i]);

	}

}
