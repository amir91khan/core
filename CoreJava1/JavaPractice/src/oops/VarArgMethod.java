package oops;
class Parent11
{
	public void m1(int i)
	{
		System.out.println("parent class");
	}
}
class Child11 extends Parent
{
	public void m1(int i)
	{
		System.out.println("child class");
	}
}

public class VarArgMethod {

	public static void main(String[] args) {
		Parent11 p=new Parent11();
			p.m1(10);
	    Child11 c=new Child11();
	    c.m1(20);
	  //  Parent11 p1=new Child11();
	   // p1.m1(10);
		
	}

}
