package innerClass1;
class D
{
	static int a=10;
	int x=20;
	static class E
	{
		static int a=50;
		int x=60;
		void m1()
		{
			System.out.println(a);
			System.out.println(x);
			D d=new D();
			System.out.println(D.a);
			System.out.println(d.x);
		}
	}
	void m2()
	{
		System.out.println(a);
		System.out.println(x);
		E e=new E();
		System.out.println(E.a);
		System.out.println(e.x);
	}
	public static void main(String[] args) {
		D d=new D();
		d.m2();
		E e=new E();
		e.m1();
}
}
public class Test {

	public static void main(String[] args) {
		
D d1=new D();
D.E e1=new D.E();
System.out.println(D.a);
System.out.println(D.E.a);
System.out.println(e1.x);
System.out.println(e1.x);
	}

}
