package collection;

class Customer
{
	String name;
	int age;
	Address address;
	Customer(String name,int age,Address address )
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public String toString()
	{
		return("Name:"+name+"\nAge:"+age+"\nHNo:"+address.hno+"\nStreet:"+address.street+
				               "\nCity:"+address.city+"\nPh:"+address.ph
				);
				
	}
}