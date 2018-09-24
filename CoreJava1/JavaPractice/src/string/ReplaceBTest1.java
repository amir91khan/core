package string;

public class ReplaceBTest1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(2, 3, "java");
		System.out.println(sb);
	}

}
