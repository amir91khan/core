package inheritance;
class A6
{
	A6()
	{
		System.out.println("NPCA");
	}
	A6(int x)
	{
		System.out.println("OPCA");
	}
}
class B6 extends A6
{
	B6()
	{
		super(10);
		System.out.println("NPCB");
	}
	B6(int x)
	{
		System.out.println("OPCB");
	}
}
class C6 extends B6
{
	C6()
	{
		System.out.println("NPCC");
	}
	C6(int x)
	{
		super(10);
		System.out.println("OPCC");
	}
}
public class InheritanceTest11 {

	public static void main(String[] args) {
		C6 objc=new C6();
		C6 objc1=new C6(10);

	}

}
