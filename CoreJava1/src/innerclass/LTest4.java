package innerclass;
class LocalInner
{
	private int data=50;
	void display()
	{
		int value=100;
		class Local1
		{
			void msg()
			{
				System.out.println(value);
			}
		}
		Local1 l1=new Local1();
		l1.msg();
	}
}
public class LTest4 {

	public static void main(String[] args) {
		LocalInner l2=new LocalInner();
		l2.display();
		

	}

}
