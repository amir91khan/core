package classreusability;

import java.util.*;



//import classreusability.Address.Person;

class Address {
	private String street;
	private String city;

	void readAddress() {
		Scanner scan = new Scanner(System.in);
		System.out.println("input street");
		street = scan.next();
		System.out.println("input city");
		city = scan.next();
	}

	void printAddress() {
		System.out.println(street);
		System.out.println(city);
	}
	
	
	
}// class


class Person {
	private String name;
	Address add1 = new Address();
	Address add2 = new Address();

	void readName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("input name");
		name = scan.next();
	}

	void printName() {
		
		System.out.println(name);

	}
}

public class ComTest3 {

	public static void main(String[] args) {
		// Person p1=null;
		
		Person p1 = new Person();
		p1.readName();
		p1.add1.readAddress();
		p1.add2.readAddress();
		p1.printName();
		p1.add1.printAddress();
		p1.add2.printAddress();

	}

}
