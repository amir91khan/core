package stringHandling;

public class StringsetCharAt {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("abc bbc cbc");
		System.out.println("sb chars:"+sb1);
		sb1.setCharAt(3, '-');
		System.out.println("sb chars:"+sb1);

	}

}
