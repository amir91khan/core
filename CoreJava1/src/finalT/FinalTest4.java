package finalT;
class A1
{
	final void m1()
	{
		System.out.println("m1 of A");
	}}
	
class B1 extends A1
{
	void m1(int x)
	{
		System.out.println("overloading method");
	}
}

public class FinalTest4 {

	public static void main(String[] args) {
	B1 obj=new B1();
	obj.m1();
	
		
		

	}

}
