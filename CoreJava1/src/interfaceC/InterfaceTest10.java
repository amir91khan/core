package interfaceC;
interface Drawable3
{
	void draw();

static int cube(int x)

{
	return x*x*x;
}
}
class Rectangle4 implements Drawable3
{
	public void draw()
	{
		System.out.println("drawing rectangle");
	}
	}
	public class InterfaceTest10 {
   

	public static void main(String[] args) {
		Drawable3 d=new Rectangle4();
		d.draw();
		System.out.println(Drawable3.cube(2) );
		
		

	}

}
