package finalT;
class Bike1
{
	final void run()
	{
		System.out.println("running");
	}
}
class Honda1 extends Bike1
{
	void run() 
	{
		System.out.println("running safely");
		
	}
}
public class FinalMethodTest5 {

	public static void main(String[] args) {
		Honda1 obj=new Honda1();
		obj.run();
		

	}

}
