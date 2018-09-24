package oops;

public class Emp {
	int id;
	String name;
	Address address;
	public Emp(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" \t"+address.state+"\t"+address.country);
		
	}

	public static void main(String[] args) {
		Address add1=new Address("ameerpet","tel","india");
		Address add2=new Address("kanpur", "up", "india");
		Emp e1=new Emp(101, "aamir", add1);
		Emp e2=new Emp(102, "khan", add2);
		e1.display();
		e2.display();
	}

}
