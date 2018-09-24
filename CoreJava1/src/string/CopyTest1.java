package string;

public class CopyTest1 {

	public static void main(String[] args) {
		String str1="java";
		char ch[]= {'c','+','+'};
		String str2=String .copyValueOf(ch);
		System.out.println(str1);
		System.out.println(str2);
		String str3=String.copyValueOf(ch,0,1);
		System.out.println(str3);

	}

}
