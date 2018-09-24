package oops;
class Example1{
	int x=10;
	int y=20;
	void m1() {
		x=5;
	}
}
class Sample1{
	static void m2(Example1[] e) {
		e[2].m1();
	}
}

public class Arr5 {

	public static void main(String[] args) {
		Example1[] e= {new Example1(),
				      new Example1(),
				      new Example1(),
				      new Example1()};
			Sample1.m2(e);
			for(int i=0;i<e.length;i++) {
				System.out.println(e[i].x);
				System.out.println(e[i].y);
				System.out.println();
		}

	}

}
