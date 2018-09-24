package thread;
class MyThread8 extends Thread
{
	public void run()
	{
		System.out.println("run start");
		System.out.println("from run method after start call:"+this.getState());
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("run end");
	}
};
public class ThreadTest9 {

	public static void main(String[] args)throws InterruptedException 
	{
		MyThread8 mt=new MyThread8();
		System.out.println("from main method after obj creation:"+mt.getState());
		mt.start();
		System.out.println("from main method after obj creation:"+mt.getState());
		Thread.sleep(500);
		System.out.println("from main method after obj creation:"+mt.getState());
		Thread.sleep(6000);
		System.out.println("from main method after obj creation:"+mt.getState());
		

	}

}
