package stringHandling;

public class StringAppend {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println("sb capacity:"+sb.capacity());
		System.out.println("sb length:"+sb.length());
		System.out.println("sb chars:"+sb);
		System.out.println();
		sb.append("a");
		System.out.println("sb capacity:"+sb.capacity());
		System.out.println("sb length:"+sb.length());
		System.out.println("sb chars:"+sb);
		System.out.println();

	}

}
