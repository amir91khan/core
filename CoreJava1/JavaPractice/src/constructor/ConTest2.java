package constructor;
class Triangle1
{
	private float base;
	private float height;
	Triangle1(){
		base=1.5f;
		height=2.5f;
		
		
	}
	float findArea()
	{
		return 0.5f*base*height;
		
	}
}
public class ConTest2 {

	public static void main(String[] args) {
		Triangle1 t1=new Triangle1();
		System.out.println(t1.findArea());
		
	}

}
