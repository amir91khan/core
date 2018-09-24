package string;

public class AppendBTest2 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("java");
		sb.append("python");
		StringBuffer sb1=new StringBuffer();
		sb.append("javascript");
		StringBuffer sb3=new StringBuffer();
		sb.append(5);
		System.out.println(sb3);
		System.out.println(sb1);
		System.out.println(sb);

	}

}
