package string;

public class STTest1 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		StringBuffer sb2=new StringBuffer(5);
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
	}

}
