package thread;

public class DeadLockDemo implements Runnable{
	FirstClass fc=new FirstClass();
	SecondClass sc=new SecondClass();
	DeadLockDemo()
	{
		Thread th=new Thread(this,"Racing Thread");
		th.start();
		fc.firstClassMethod(sc);
		System.out.println("Back in Main Thread");
	}
	public void run()
	{
		sc.secondClassMethod(fc);
		System.out.println("Back in other thread");
	}

}
