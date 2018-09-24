package stringHandling;

public class StringInsert {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("123456789");
		System.out.println("sb chars:"+sb1);
		sb1.insert(2, '-');
		System.out.println("sb chars:"+sb1);
		sb1.insert(5, '-');
		System.out.println("sb chars:"+sb1);
	}

	
}
