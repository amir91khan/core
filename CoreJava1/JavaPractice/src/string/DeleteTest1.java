package string;

public class DeleteTest1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("java");
		sb.append(".net");
		sb.append("oracle");
		System.out.println(sb);
        sb.delete(1, 5);
        System.out.println(sb);

	}

}
