package toString;
class Student1
{
	private int rno;
	private String name;
	private String city;
	Student1(int rno,String name,String city)
	{
		this.rno=rno;
		this.name=name;
		this.city=city;
	}
	
	
	
}
public class ToStringTest4 {

	public static void main(String[] args) {
		Student1 s1=new Student1(101,"aamir","hyd");
		Student1 s2=new Student1(102,"sahil","ameerpet");
		System.out.println(s1);
		System.out.println(s2);
		

	}

}
