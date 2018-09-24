package wrapper;

public class WTest9 {
static void m1(String name)
{
	switch(name)
	{
	case "PK":
		System.out.println("Pk is number1");
		break;
	case "MB":
		System.out.println("MB is number2");
		break;
	case "NTR":
		System.out.println("NTR is number2");
		break;
		default:
			System.out.println("number is not dscide:"+name);
	}
}
	public static void main(String[] args) {
		m1("PK");
		m1("MB");
		m1("NTR");
		m1("AK");
		m1("SK");
		

	}

}
