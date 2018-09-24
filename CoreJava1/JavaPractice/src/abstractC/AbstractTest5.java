package abstractC;
abstract class Animal
{
	void run()
	{
		System.out.println("animal run...");
	}
	abstract void eat();
}
class Dog extends Animal

{
	void eat()
	{
		System.out.println("dog eating nonvege..");
	}
}
class Cow extends Animal
{
	void eat()
	{
		System.out.println("cow is eat vege...");
	}
}
	
	public class AbstractTest5 {


	public static void main(String[] args) {
		Animal a=new Dog();
		a.run();
		a.eat();
		a=new Cow();
		a.run();
		a.eat();
		
	}

}
