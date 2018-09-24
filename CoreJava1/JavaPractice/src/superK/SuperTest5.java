package superK;

class Person {
	int id;
	String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Employee extends Person {
	public float salary;

	Employee(int id, String name, float salary) {
		super(id, name);
		this.salary = salary;
	}

	void display() {
		System.out.println(id + "," + name + "," + salary);
	}
}

public class SuperTest5 {

	public static void main(String[] args) {
		Employee e = new Employee(101, "aamir", 50000);
		e.display();

	}

}
