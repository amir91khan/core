package classreusability;

class Complex {
	private float real;
	private float img;

	void setComplex(float real, float img) {
		this.real = real;
		this.img = img;
	}

	void printComplex() {
		System.out.println(real);
		System.out.println(img);
	}

	Complex addComplex(Complex c) {
		Complex c1 = new Complex();
		c1.real = real + c.real;
		c1.img = img + c.img;
		return c1;
	}
}

public class ComTest11 {

	public static void main(String[] args) {
		Complex comp1 = new Complex();
		Complex comp2 = new Complex();
		comp1.setComplex(1.2f, 1.5f);
		comp2.setComplex(1.5f, 3.7f);
		Complex comp3 = comp1.addComplex(comp2);
		comp1.printComplex();
		comp2.printComplex();
		comp3.printComplex();

	}

}
