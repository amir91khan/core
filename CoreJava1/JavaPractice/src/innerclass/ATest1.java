package innerclass;
class AA
{
	void m1()
	{
		System.out.println("m1 of AA");
	}
	void m2()
	{
		System.out.println("m2 of AA");
	}
}
public class ATest1 {

	public static void main(String[] args) {
		AA obj1=new AA();
		obj1.m1();
		obj1.m2();
		AA obj2=new AA();
		//void m1()
		//{
			//System.out.println("overriding m1 method");
		//}
		
		//}
	obj2.m1();
	obj2.m2();
	
	}
}
