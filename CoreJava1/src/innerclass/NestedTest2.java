package innerclass;
class Complex
{
	private float real;
	private float img;
	void setComplex(float real,float img)
	{
		this.real=real;
		this.img=img;
	}
	void printComplex()
	{
		System.out.println(real);
		System.out.println(img);
	}
	static class ComplexOperation
	{
		static Complex addComplex(Complex c1,Complex c2)
		{
			Complex c3=new Complex();
			c3.real=c1.real+c2.real;
			c3.img=c1.img+c2.img;
			return c3;
		}
	}
	
}
public class NestedTest2 {

	public static void main(String[] args) {
		Complex comp1=new Complex();
		Complex comp2=new Complex();
		comp1.setComplex(1.2f, 1.5f);
		comp2.setComplex(1.5f, 1.6f);
		Complex comp3=Complex.ComplexOperation.addComplex(comp1, comp2);
		comp1.printComplex();
		comp2.printComplex();
		comp3.printComplex();
		
		

	}

}
