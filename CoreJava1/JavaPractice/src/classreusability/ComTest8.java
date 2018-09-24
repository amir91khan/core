package classreusability;

class Mark {
	private int sub1, sub2;

	void setSubject(int sub1, int sub2) {
		this.sub1 = sub1;
		this.sub2 = sub2;
	}

	void findResult() {
		System.out.println(sub1);
		System.out.println(sub2);
		if (sub1 < 40 || sub2 < 40)
			System.out.println("Result Fail");
		else
			System.out.println("Result Pass");
	}

}

class Student2 {
	private String name;
	private Mark m;

	void setName(String name) {
		this.name = name;
	}

	public void setM(Mark m) {
		this.m = m;
	}

	void printStudent1() {
		System.out.println(name);
		m.findResult();
	}
}

public class ComTest8 {

	public static void main(String[] args) {
		Student2 s = new Student2();
		Mark m = new Mark();
		m.setSubject(78, 80);
		s.setName("aamir");
		s.setM(m);
		s.printStudent1();

	}

}
