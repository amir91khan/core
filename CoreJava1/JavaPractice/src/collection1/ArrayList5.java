package collection1;
import java.util.*;
class Student
{
	int rno;
	String name;
	int age;
	Student(int rno,String name,int age)
	{
		this.rno=rno;
		this.name=name;
			this.age=age;	
	}
}
public class ArrayList5 {

	public static void main(String[] args) {
		Student s1=new Student(101,"aamir",23);
		Student s2=new Student(102,"khan",24);
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Student s=(Student)i.next();
			System.out.println(s.rno+""+s.name+""+s.age);
			}
		

	}

}
