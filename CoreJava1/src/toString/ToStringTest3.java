package toString;
class Student
{
	private int rno;
	private String name;
	Student(int rno,String name)
	{
	this.rno=rno;
	this.name=name;
}
public String toString()
{
	return rno+","+name;
}
}
public class ToStringTest3 {

	public static void main(String[] args) {
		Student s=new Student(101,"aamir");
		System.out.println(s);
        

	}

}
