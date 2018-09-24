package inheritance;
class Person1
{
	private String name;
	Person1(String name)
	{
		this.name=name;
	}
	String getname()
	{
		return name;
	}}
	class Employee1 extends Person1
	{
		private float salary;
		
			Employee1(String name,float salary)
			{
				super(name);
				this.salary=salary;
				
			}
			float getSalary()
			{
				return salary;
		
	}
}
public class InheritanceTest12 {

	public static void main(String[] args) {
		Employee1 e=new Employee1("aamir",50000f);
		System.out.println(e.getname());
		System.out.println(e.getSalary());
		

	}

}
