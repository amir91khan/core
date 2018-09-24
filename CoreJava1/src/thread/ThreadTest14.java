package thread;

class Example
{
	static {
		Thread th=Thread.currentThread();
		System.out.println("Example class is loaded through the thread:"+th.getName());
	}
	static void m1()
	{
		Thread th=Thread.currentThread();
		System.out.println("Example class m1 is executing  the thread:"+th.getName());
	}
	}
class MyThread12 extends Thread
{
	public void run()
	{
		Example.m1();
	}
}
public class ThreadTest14 {
	public static void main(String arg[])
	{
		new MyThread12().start();
		new Example().m1();
		
	}
	}


