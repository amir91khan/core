package innerclass;

class Complex1 {
	private float img;
	private float real;

	void setComplex1(float img, float real) {
		this.img = img;
		this.real = real;
	}

	void printComplex1() {
		System.out.println(img);
		System.out.println(real);
	}

	static class Complex1Opt {
		static Complex1 addComplex1(Complex1 c1, Complex1 c2) {
			Complex1 c3 = new Complex1();
			c3.img = c1.img + c2.img;
			c3.real = c1.real + c2.real;
			return c3;
		}
	}
}

public class NTest2 {

	public static void main(String[] args) {
		Complex1 comp1 = new Complex1();
		Complex1 comp2 = new Complex1();
		comp1.setComplex1(1.2f, 1.5f);
		comp2.setComplex1(1.5f, 1.6f);
		Complex1 comp3 = Complex1.Complex1Opt.addComplex1(comp1, comp2);
		comp1.printComplex1();
		comp2.printComplex1();
		comp3.printComplex1();

	}

}
