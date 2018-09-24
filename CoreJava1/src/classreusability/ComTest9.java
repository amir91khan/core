package classreusability;

class Boy {
	private int rno;
	private String name;

	void setBoy(int rno, String name) {
		this.rno = rno;
		this.name = name;
	}

	void printBoy() {
		System.out.println(rno);
		System.out.println(name);
	}
}

class Number {
	private int sub1, sub2, sub3;
	private Boy b;

	Number(Boy b) {
		this.b = b;
	}

	void printNumber() {
		b.printBoy();
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
	}

	void setNumber(int sub1, int sub2, int sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
}

public class ComTest9 {

	public static void main(String[] args) {
		Boy b = new Boy();
		b.setBoy(101, "david");
		Number bNumber = new Number(b);
		bNumber.setNumber(80, 90, 80);
		bNumber.printNumber();

	}

}
