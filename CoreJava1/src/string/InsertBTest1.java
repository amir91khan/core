package string;

public class InsertBTest1 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		sb1.append("language");
		sb1.insert(0, "java");
		//sb1.insert(1, "python");
		sb1.append(9.0);
		sb1.insert(4, "is a");
		System.out.println(sb1);

	}

}
