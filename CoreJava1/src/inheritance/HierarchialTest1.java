package inheritance;
class Animal2
{
	void eat()
	{
		System.out.println("eating...");
	}
}
class Dog2 extends Animal2
{
	void bark()
	{
		System.out.println("barking...");
	}
}
class Cat extends Animal2
{
	void meow()
	{
		System.out.println("meowing....");
	}
}
public class HierarchialTest1 {

	public static void main(String[] args) {
		Cat c=new Cat();
		Dog2 d=new Dog2();
		d.bark();
		d.eat();
		c.meow();
		c.eat();
		

	}

}
