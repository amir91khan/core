package string;

public class CompareTest2 {

	public static void main(String[] args) {
		String str1="abc";//97 98,99
		String str2="aeb";//97 101 98=-3
		int x=str1.compareTo(str2);
		System.out.println(x);
	}

}
