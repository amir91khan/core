package constructor;
class Employee
{
	private int empno;
	private String name;
	private float salary;
	Employee(int emono,String name)
	{
		this.empno=empno;
		this.name=name;
	}
	Employee(int empno,String name,float salary)
	{
		this(empno, name);
		this.salary=salary;
	}
	void printEmployee()
	{
		System.out.println(empno);
		System.out.println(name);
		System.out.println(salary);
	}
}
public class ConTest7 {

	public static void main(String[] args) {
		Employee emp1=new Employee(101,"aamir");
		Employee emp2=new Employee(102,"khan",50000);
		emp1.printEmployee();
		emp2.printEmployee();
		
		

	}

}
