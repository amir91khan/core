package classreusability;
class Student1
{
	private int rno;
	private String name;
	public void setStudent1(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}
	void printStudent1()
	{
		System.out.println(rno);
		System.out.println(name);
	}
}
class Marks1
{
	private int sub1,sub2;
	private Student1 s;
	Marks1(Student1 s)
	{
		this.s=s;
		
	}
	void printMarks()
	{
		s.printStudent1();
		System.out.println(sub1);
	    System.out.println(sub2);
	}
	void setmarks(int sub1,int sub2)
	{
		this.sub1=sub1;
		this.sub2=sub2;
	}
}
public class ComTest7 {

	public static void main(String[] args) {
		Student1 s=new Student1();
		s.setStudent1(101,"aamir");
		Marks1 sMarks=new Marks1(s);
		sMarks.setmarks(60, 70);
		sMarks.printMarks();
	}

}
