package inheritance;
class A5
{
	A5()
	{
		System.out.println("NPCA");
	}
	A5(int x)
	{
		System.out.println("OPCA");
	}
}
class B5 extends A5
{
	B5()
	{
		super(10);
		System.out.println("NPCB");
	}
	B5(int x)
	{
		System.out.println("OPCB");
	}
	
}
public class InheritanceTest10 {

	public static void main(String[] args) {
		B5 obj1=new B5();
		B5 obj2=new B5(10);
		

	}

}
