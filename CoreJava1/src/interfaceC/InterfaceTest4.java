package interfaceC;
interface A1
{
	static void m1()
	{
		System.out.println("inside static method");
	}
	default void m2()
	{
		System.out.println("inside default method");
	}
	void m3();
}
public class InterfaceTest4 {

	public static void main(String[] args) {
		A1.m1();
		
	}

}

