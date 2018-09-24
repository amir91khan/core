package string;

public class ConcatTest3 {

	public static void main(String[] args) {
		String s1="java String";
		s1.concat("is immutable");
		System.out.println(s1);
		s1=s1.concat("language");
		System.out.println(s1);
	}

}
