package oops;

public class ConstructorStudent {
	String name;
	int rno;
	public ConstructorStudent(String name, int rno) {
		super();
		this.name = name;
		this.rno = rno;
	}

	public static void main(String[] args) {
		ConstructorStudent s1=new ConstructorStudent("aamir", 101);
		ConstructorStudent s2=new ConstructorStudent("khan", 102);
		System.out.println(s1);
		System.out.println(s2);
		
		

	}

	

}
