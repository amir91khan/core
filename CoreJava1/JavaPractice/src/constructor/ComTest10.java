package constructor;
class A2
{
	A2()
	{
		System.out.println("NPCA");
	}
	A2(int x)
	{
		System.out.println("OPCA");
	}
	A2(int x,int y)
	{
		System.out.println("TPCA");
	}
}
public class ComTest10 {

	public static void main(String[] args) {
		A2 obj1=new A2();
		A2 obj2=new A2();
		A2 obj3=new A2();
		
		
	}

}
