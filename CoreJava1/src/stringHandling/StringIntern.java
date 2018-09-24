package stringHandling;

public class StringIntern {

	public static void main(String[] args) {
		String s1="Aamir";
		String s2=s1.intern();
		System.out.println(s1==s2);
		String s3=new String("NIT");
		String s4=s3.intern();
		System.out.println(s3==s4);
	}

}
