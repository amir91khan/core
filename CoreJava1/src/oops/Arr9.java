package oops;
class Example2{
	int x=10;
	int y=20;
	static {
		System.out.println("Example is loaded");
	}
	 Example2() {
		System.out.println("Example object is created");
	}
}
public class Arr9 {
static Example2[] e1=new Example2[5];
Example2[] e2= {new Example2(),new Example2()};
	public static void main(String[] args) {
		System.out.println("Test main");
		Example2[] e3=new Example2[2];
		System.out.println("e3 array is created");
		e1[1]=new Example2();
		e3[1]=new Example2();
        System.out.println(e1[1].x);
       // System.out.println(e2[1].x);
        System.out.println(e3[1].x);
        Example2 e=new Example2();
        System.out.println(e1[0].x);
        //System.out.println(e.e);
	}

}
