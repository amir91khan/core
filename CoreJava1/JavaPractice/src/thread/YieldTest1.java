package thread;
class MyThread16 extends Thread
{
	public void run()
	{
		System.out.println("run");
	}
}
public class YieldTest1 {

	public static void main(String[] args) {
		MyThread16 mt=new MyThread16();
		mt.start();
		Thread.yield();
		System.out.println("main end");
	
		

	}

}
