package oops;
class Example
{
	static {
		Thread t=Thread.currentThread();
		System.out.println("Example class loaded"+t.getName());
	}
	static void m1()
	{
		Thread t=Thread.currentThread();
		System.out.println("Example class m1 is loaded"+t.getName());
	}
}
class MyThread12 extends Thread
{
	
	public void run() {
		Example.m1();
		
	}
}

public class Thread17 {

	public static void main(String[] args) {
		new MyThread12().start();
		new Example().m1();
		
	}

}
