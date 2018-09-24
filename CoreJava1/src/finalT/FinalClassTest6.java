package finalT;
 class Bike2
{
	 final void run()
	 {
		 System.out.println("running");
	 }
	
}
 class Honda2 extends Bike2
 {
	 
 }
public class FinalClassTest6 {

	public static void main(String[] args) {
		Honda2 obj=new Honda2();
		obj.run(); 
	
		
	}

}
