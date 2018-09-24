package stringHandling;

public class StringSetLength {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println();
		System.out.println("aamir");
		sb.setLength(9);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println();
		sb.setLength(4);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println();
		sb.setLength(25);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
	}

}
