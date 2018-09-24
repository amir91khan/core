package stringHandling;
class A
{

}
class B
{
	public String toString()
	{
		return "Hi";
	}
}

public class StringValue {

	public static void main(String[] args) {
		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(10.5));
		System.out.println(String.valueOf('a'));
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf("abc"));
		System.out.println(String.valueOf((A)null));
		System.out.println(String.valueOf(new A()));
		System.out.println(String.valueOf(new B()));
		
Integer.toString(5);
	}

}
