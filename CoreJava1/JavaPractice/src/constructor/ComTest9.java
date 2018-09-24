package constructor;
class A1
{
	int x;
	A1()
	{
		A1();
		x=x+10;
	}
	void A1()
	{
		x=x-10;
	}
}
public class ComTest9 {

	public static void main(String[] args) {
		A1 obj1=new A1();
		System.out.println(obj1.x);
		

	}

}
