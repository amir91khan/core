package string;

public class ReplaceTest2 {

	public static void main(String[] args) {
		String str1 = "java .net python oracle";
		String str2 = str1.replaceAll(".net", "AngularJS");
		System.out.println(str1);
		System.out.println(str2);
	}

}
