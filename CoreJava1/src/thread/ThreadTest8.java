package thread;
class MyThread7 extends Thread
{
	public void run()
	{
		System.out.println("run");
	}
	public void start()
	{
		System.out.println("start");
		run();
		super.start();
	}
}
public class ThreadTest8 {

	public static void main(String[] args) {
		MyThread7 m1=new MyThread7();
		m1.start();
		System.out.println("main");
		

	}

}
