package oops;
class Test{
	static void m1() {
		System.out.println("Test.m1()");
	}
}
class Test2 extends Test{
	static void m1() {
		System.out.println("Test2.m1()");
	}
}
public class Override2 {
public static void main(String[] args) {
	Test2 t=new Test2();
	t.m1();//"Test2.m1()"
	Test t2=new Test2();
	t2.m1();//"Test.m1()"
	Test t3=new Test();
	t3.m1();//"Test.m1()"
}
}
