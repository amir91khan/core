package thread;

class MyThread6 extends Thread
{
	public void run()
	{
		System.out.println("run");
		

	}
	public void start()
	{
		System.out.println("start");
	}
	public class ThreadTest6 extends Thread
	{
		public void main(String arg[])
		{
			MyThread6 m1=new MyThread6();
			m1.start();
			System.out.println("main");
			
		}
	}

}
