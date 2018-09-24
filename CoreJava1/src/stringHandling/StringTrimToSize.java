package stringHandling;

public class StringTrimToSize {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("abc");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.trimToSize();
		System.out.println(sb.capacity());
		System.out.println(sb.length());

	}

}
