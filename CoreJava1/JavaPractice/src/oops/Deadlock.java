package oops;
class FirstClass
{
	synchronized void firstClassMethod(SecondClass sc)
	{
		String name=Thread.currentThread().getName();
		System.out.println(name+"intered into FC.firstClassMethod()");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(name+"is is trying to call sc.lastMethod()");
		sc.lastMethod();
	}
	synchronized void lastMethod()
	{
		System.out.println("inside FC.lastMethod()");
	}
}
 class SecondClass
{
	synchronized void secondClassMethod(FirstClass fc)
	{
		String name=Thread.currentThread().getName();
		System.out.println(name+"is entered into sc.secondClassMethod()");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(name+"is trying to call fc.lastMethod()");
		fc.lastMethod();
	}
	synchronized void lastMethod()
	{
		System.out.println("inside sc.lastMethod()");
	}
}
 class DeadLockDemo implements Runnable
{
	FirstClass fc=new FirstClass();
	SecondClass sc=new SecondClass();
	 DeadLockDemo() {
		 Thread th=new Thread(this, "Racing Thread");
		 th.start();
		 fc.firstClassMethod(sc);
		 System.out.println("Back in main Thread");
		}
	public void run() {
		sc.secondClassMethod(fc);
		System.out.println("Back in other Thread");
		
	}
}
public class Deadlock {

	public static void main(String[] args) {
		DeadLockDemo d=new DeadLockDemo();
		
	}

}
