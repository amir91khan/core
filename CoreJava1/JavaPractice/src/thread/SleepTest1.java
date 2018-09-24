package thread;
class MyThread17 extends Thread
{
	public void run()
	{
		System.out.println("run");
	}
}
public class SleepTest1 {

	public static void main(String[] args)throws Exception {
		System.out.println("main start");
		MyThread17 mt=new MyThread17();
		mt.start();
		Thread.sleep(5000);
		System.out.println("main end");
		
		

	}

}
