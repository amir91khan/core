package oops;

public class Parent1 {
	int x=10;
	{
		m1();
		
			System.out.println("parent first instance block");
		}
	Parent1()
	{
		System.out.println("parent class constructor");
	}
	

	public static void main(String[] args) {
		Parent1 p=new Parent1();
		System.out.println("parent class meain method");
		
	}
	public void m1()
	{
		System.out.println(y);
	}
	int y=20;

}
class Child1 extends Parent1
{
	int i=100;
	{
		m2();
		System.out.println("child class instance method");
	}
	Child1()
	{
		System.out.println("child class constructor");
	}
	public static void main(String[] args) {
		Child1 c=new Child1();
		System.out.println("child class main method");
}
	public void m2()
	{
		System.out.println(j);
	}
	int j=200;
}