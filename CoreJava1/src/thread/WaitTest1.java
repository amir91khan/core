package thread;

public class WaitTest1 {
	synchronized void m1()
	{
		try
		{
			System.out.println("Hi");
			wait(6000);
			System.out.println("Hello");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		WaitTest1 wt=new WaitTest1();
		wt.m1();
		

	}

}
