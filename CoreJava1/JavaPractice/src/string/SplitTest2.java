package string;

public class SplitTest2 {

	public static void main(String[] args) {
		String s1="java string split method by java";
		String[] s2=s1.split("\\s");
		for(int i=0;i<s2.length;i++)
		System.out.println(s2[i]);

	}

}
