package string;

public class SplitTest1 {

	public static void main(String[] args) {
		String str1="java,oracle,python";
		String str2[]=str1.split(",");
		for(int i=0;i<str2.length;i++)
			System.out.println(str2[i]);
	}

}
