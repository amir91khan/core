package thread;
class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println("run:"+i);
		}
	}
}
public class ThreadTest2 {

	public static void main(String[] args) {
		MyThreadTest1 mt=new MyThreadTest1();
		mt.start();
		for(int i=20;i>=1;i--)
		{
			System.out.println("main:"+i);
		}

	}

}
