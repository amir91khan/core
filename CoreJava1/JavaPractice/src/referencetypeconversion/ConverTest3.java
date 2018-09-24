package referencetypeconversion;
class Student
{
	void m1()
	{
		System.out.println("m1 of student");
	}
}
class MCAStudent extends Student
{
	void m2()
	{
		System.out.println("m2 of MCA Student");
	}
	void m1()
	{
		System.out.println("overriding method");
	}
}

public class ConverTest3 {

	public static void main(String[] args) {
		MCAStudent ms=new MCAStudent();
		ms.m1();
		ms.m2();
		Student s=ms;
		s.m1();
		MCAStudent ms1=(MCAStudent)s;
		ms1.m1();
		ms1.m2();
		

	}

}
