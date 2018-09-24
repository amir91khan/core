package oops;
class MyThread16 extends Thread
{
	public void run()
	{
		System.out.println("run start");
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("run end");
		}
	}
}

public class Thread21 {

	public static void main(String[] args){
		System.out.println("main start");
		MyThread16 mt=new MyThread16();
		mt.start();
		//mt.interrupt();
		//Thread.yield();
		//mt.join();
		System.out.println("main end");
		
	}

}
