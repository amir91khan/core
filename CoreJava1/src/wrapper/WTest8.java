package wrapper;

public class WTest8 {
static	 void m1(Integer io)
	 {
	switch(io)
	{
	case 1:
		System.out.println("case 1");
		break;
	case 2:
		System.out.println("case 2");
		break;
	default:
		System.out.println("default");
		
	}

	 }


	public static void main(String[] args) {
		m1(1);
		m1(2);
		m1(3);
	m1(-1);
		//m1(null);
		

	}

}
