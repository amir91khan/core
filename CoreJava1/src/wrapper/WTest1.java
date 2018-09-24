package wrapper;

public class WTest1 {

	public static void main(String[] args) {
		int i1=10,i2=10;
		Integer io1=new Integer(10);
		Integer io2=new Integer(10);
		System.out.println(io1==io2);
		System.out.println((io1.equals(io2)));
		Double do1=new Double(10.0);
		double d1=10.0;
		System.out.println(i1==d1);

	}

}
