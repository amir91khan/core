package string;

public class SBTest2 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer(5);
		sb1.append("java");
		System.out.println(sb1);
		System.out.println("python");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
	}

}
