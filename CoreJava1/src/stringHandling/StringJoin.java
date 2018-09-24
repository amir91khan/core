package stringHandling;

public class StringJoin {

	public static void main(String[] args) {
		String s1=String.join("-", "a","b","c","d","e");
		String s2=String.join(",", "a","b","c");
		String s3=String.join("-", "a");
		String s4=String.join("-");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);
	}

}
