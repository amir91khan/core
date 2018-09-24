package stringHandling;

public class StringDelete {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("aamir khan hyd");
		System.out.println("sb chars:"+sb1);
		sb1.deleteCharAt(4);
		System.out.println("sb chars:"+sb1);
		sb1.delete(4, 8);
		System.out.println("sb chars:"+sb1);

	}

}
