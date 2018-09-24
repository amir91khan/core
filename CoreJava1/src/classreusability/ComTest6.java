package classreusability;
class Marks
{
	private int sub1,sub2,sub3;
	void setSubject(int sub1,int sub2,int sub3)
	{
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	void findResult()
	{
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
		if(sub1<40||sub2<40||sub3<40)
			System.out.println("Result fails");
		else
			System.out.println("Result pass");
			
	}
}
class Student
{
	private String name;
	private Marks m;
	void setName(String name)
	
	
	{
		this.name=name;
	}
	public void setM(Marks m) {
		this.m = m;
	}
	void printStudent()
	{
		System.out.println(name);
		m.findResult();
		
	}
}
public class ComTest6 {

	public static void main(String[] args) {
		Student s=new Student();
		Marks m=new Marks();
		m.setSubject(90,90,90);
		s.setName("aamir");
		s.setM(m);
		s.printStudent();

	}

}
