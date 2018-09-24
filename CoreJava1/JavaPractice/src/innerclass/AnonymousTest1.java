package innerclass;
class Popcorn
{
	public void taste()
	{
		System.out.println("salty");
	}
}
public class AnonymousTest1 {

	public static void main(String[] args) {
		Popcorn p=new Popcorn();
		{
		//	public void taste()
			{
				System.out.println("sweetly");
			}
		};
		p.taste();
		Popcorn p1=new Popcorn();
		p.taste();
		
	}

}
