package abstractC;
import java.util.*;
abstract class Employee
{
	private String name;
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	abstract float calcSalary();
}
 class SalariedEmployee extends Employee
{
	private float salary;
	
	@Override
	void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	@Override
	String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	@Override
	float calcSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
	void setSalary(float salary)
	{
		this.salary=salary;
	}
	float getSalary()
	{
		return salary;
	}
	
}
class Worker extends Employee
{
	private float wage;
	private int days;
	
	@Override
	void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	@Override
	String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	@Override
	float calcSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	void setWage(float wage)
	{
		this.wage=wage;
		
	}
	void setDays(int days)
	{
		this.days=days;
	}
	float clacSalary()
	{
		return days*wage;
	}
	
	
	}

class Printer
{
	static void print(Employee e)
	{
		System.out.println("Name is"+e.getName());
		System.out.println("Total Salary is"+e.calcSalary());
	}
}
public class AbstractTest6 {

	public static void main(String[] args) {
	Employee e1=new SalariedEmployee();
		e1.setName("aamir");
		//e1.setSalary(50000f);
		Worker w1=new Worker();
		w1.setName("khan");
		w1.setWage(200);
		w1.setDays(10);
		Printer.print(e1);
		Printer.print(w1);
		
	}

}
