package thread;
class MyThread18 extends Thread
{
	public void run()
	{
		System.out.println("run start");
		try
		{
			System.out.println("before pause1");
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println("IE raised");
		}
		System.out.println("after pause1");
		try
		{
			System.out.println("before paused2");
			Thread.sleep(10000);;
		}
		catch(Exception e)
		{
			System.out.println("after pause2");
			System.out.println("run end");
		}
	}
}
public class InterruptedException {

	public static void main(String[] args)throws Exception {
		System.out.println("main start");
		MyThread18 mt=new MyThread18();
		//mt.interrupt();
		mt.start();
		mt.interrupt();
		Thread.sleep(2000);
		mt.interrupt();
		System.out.println("main end");
		
		
		
		

	}

}
