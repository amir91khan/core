package string;

public class ByteTest2 {

	public static void main(String[] args) {
		String s1="ABCDEF";
		byte b[]=s1.getBytes();
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);

	}

}
