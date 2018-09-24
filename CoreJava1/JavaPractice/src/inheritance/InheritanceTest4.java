package inheritance;

class Person {
	private String name;

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}

class Employee extends Person {
	private float salary;

	void setSalary(float salary) {
		this.salary = salary;
	}

	float getSalary() {
		return salary;
	}
}

public class InheritanceTest4 {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("aamir");
		e.setSalary(50000f);
		System.out.println(e.getName());
		System.out.println(e.getSalary());

	}

}
