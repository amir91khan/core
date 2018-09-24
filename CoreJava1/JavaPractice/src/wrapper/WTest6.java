package wrapper;

public class WTest6 {

	public static void main(String[] args) {
		Integer i1=Integer.valueOf(50);
		Integer i2=Integer.valueOf(60);
		Integer i3=Integer.valueOf(i1.intValue()+i2.intValue());
		System.out.println("Result:"+i3);

	}

}
