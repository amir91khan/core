package interfaceC;
class A
{
	public void m1()
	{
		System.out.println("m1 of A");
	}
	public void m2()
	{
		System.out.println("m2 of A");
	}
}
interface B
{
	void m1();
}
class C extends A implements B
{
	public void m3()
	{
		System.out.println("m3 of C");
	}
}
public class InterfaceTest3 {

	public static void main(String[] args) {
		C obj=new C();
		obj.m1();
		obj.m2();
		obj.m3();
		
	}

}
