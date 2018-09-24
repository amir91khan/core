package thread;
class  MyThread9 extends Thread
{
	public void run()
	{
		System.out.println("run start");
		System.out.println("from run method mt state after start call:"+this.isAlive());
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{}
			System.out.println("run start");
		}
	};

public class ThreadTest10 {

	public static void main(String[] args)throws InterruptedException {
		MyThread9 mt=new MyThread9();
		System.out.println("from main thread mt state after obj creation:"+mt.isAlive());
		mt.start();
		System.out.println("from main thread mt state after obj creation:"+mt.isAlive());
		Thread.sleep(500);
		System.out.println("from main thread mt state after obj creation:"+mt.isAlive());
		Thread.sleep(6000);
		System.out.println("from main thread mt state after obj creation:"+mt.isAlive());
		
		
		

	}

}
