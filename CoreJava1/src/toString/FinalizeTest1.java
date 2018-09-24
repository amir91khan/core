package toString;
class A2
{
	A2()
	{
		System.out.println("inside Constructor");

	}	
	public void finalize()
	{
		System.out.println("inside finalize method");
	}
}
public class FinalizeTest1 {

	public static void main(String[] args) {
		A2 obj=new A2();
		obj=null;
		System.gc();
		

	}

}
