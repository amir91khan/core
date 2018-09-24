package stringHandling;

public class StringReplace {

	public static void main(String[] args) {
		String s1="abc abc abc";
		System.out.println(s1);
		s1.replace('a', 'b');
		System.out.println(s1);
		System.out.println();
		String s2=s1.replace('a', 'b');
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		String s3=s1.replaceFirst("a", "c");
		System.out.println(s3);

	}

}
