package oops;
class MyThread4 extends Thread
{
	public void run()
	{
		for(int i=20;i>=1;i--)
		{
			System.out.println("run"+i);
		}
	}
}

public class Thread3 {

	public static void main(String[] args) {
		MyThread4 t=new MyThread4();
		
		t.start();
		t.run();
		for(int i=1;i<=20;i++)
		{
			System.out.println("main"+i);
		}
		
	}

}
