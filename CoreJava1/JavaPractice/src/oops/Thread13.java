package oops;
class MyThread9 extends Thread
{
	public void run()
	{
		System.out.println("run start");
		System.out.println("from run method tm state after start call:"+this.isAlive());
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException ie)
		{}
		System.out.println("end run");
			//ie.printStackTrace();
		}
	};

public class Thread13 {

	public static void main(String[] args)throws InterruptedException {
		MyThread9 mt=new MyThread9();
		System.out.println("from main method mt state after obj creation:"+mt.isAlive());
		mt.start();
		System.out.println("from main method mt state after start call:"+mt.isAlive());
		Thread.sleep(500);
		System.out.println("from main method mt state after mt.sleep:"+mt.isAlive());
		Thread.sleep(6000);
		System.out.println("from main method mt state after run completed:"+mt.isAlive());
		
		
		
		
	}

}
