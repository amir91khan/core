package referencetypeconversion;

class Manager1 {
	void m1() {
		System.out.println("m1 of manager ");
	}
}

class SalesManager1 extends Manager1 {
	void m2() {
		System.out.println("m2 of salesmanager");
	}
}

class PurchageManager1 extends Manager1 {
	void m3() {
		System.out.println("m3 of purchagemanager");
	}
}

public class NarrowingRefTest1 {

	public static void main(String[] args) {
		SalesManager1 s = new SalesManager1();
		s.m1();
		s.m2();
		Manager1 m = s;// widening reference
		m.m1();
		SalesManager1 s1 = (SalesManager1) m;// narrowing reference
		s1.m1();
		s1.m2();
		PurchageManager1 p = new PurchageManager1();
		p.m1();
		p.m3();
		Manager1 m1 = p;// widening reference
		m1.m1();
		PurchageManager1 p1 = (PurchageManager1) m1;// narrowing reference
		p1.m1();
		p1.m3();
	}

}
