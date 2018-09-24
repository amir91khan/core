package innerclass;
import java.util.Scanner;
class Man
{
	private String name;
	Scanner scan=new Scanner(System.in);
	void readName()
	{
		System.out.println("input name");
		name=scan.next();
	}
	void printName()
	{
		System.out.println("Name is:"+name);
	}
	class Addr
	{
		private String street;
		private String city;
		void readAddr()
		{
			System.out.println("input street");
			street=scan.next();
			System.out.println("input city");
			city=scan.next();
		}
		void printAddr()
		{
			System.out.println(street);
			System.out.println(city);
		}
	}
	Addr a1=new Addr();
	Addr a2=new Addr();
}
public class MemTest1 {

	public static void main(String[] args) {
		Man m=new Man();
		m.readName();
		m.a1.readAddr();
		m.a2.readAddr();
		m.printName();
		m.a1.printAddr();
		m.a2.printAddr();
		

	}

}
