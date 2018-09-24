package toString;
import java.util.*;
class Employee
{
	private int empno;
	private String name;
	Scanner scan=new Scanner(System.in);
	public void read()
	{
		System.out.println("input empno");
		empno=scan.nextInt();
		System.out.println("input name");
		name=scan.next();
	}
	public void print()
	{
		System.out.printf("\n Employe No %d",empno);
		System.out.printf("\n Employee Name %s",name);
	}
	/*public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/
	
	
}
class SalariedEmployee extends Employee
{
	private float salary;
	public void read()
	{
		super.read();
		System.out.println("input salary");
		salary=scan.nextFloat();
	}
	public void print()
	{
		super.print();
		System.out.printf("\n Salary is %f",salary);
	}

	/*public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + "]";
	}*/

	
	
}
public class FinalizeTes2 {

	public static void main(String[] args) {
		
		Employee se=new SalariedEmployee();
		se.read();
		se.print();
		
		

	}

}
