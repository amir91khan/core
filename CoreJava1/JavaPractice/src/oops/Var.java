package oops;
class Parent12
{
	int x=20;
}
class Child12 extends Parent12
{
	int x=25;
}

public class Var {

	public static void main(String[] args) {
		Parent12 p=new Parent12();
		System.out.println(p.x);
		Child12 c=new Child12();
		System.out.println(c.x);
		Parent12 p1=new Child12();
		System.out.println(p1.x);
		
	}

}
