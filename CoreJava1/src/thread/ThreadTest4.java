package thread;
class MyThread3 extends Thread
{
	int x;
	MyThread3(int x)
	{
		this.x=x;
	}
	public void run()
	{
		for(int i=0;i<this.x;i++)
		{
			System.out.println("Run:"+i);
		}
	}
}
public class ThreadTest4 {

	public static void main(String[] args) {
		MyThread3 m1=new MyThread3(10);
		
		m1.start();
		MyThread3 m2=new MyThread3(20);
		m2.start();
		MyThread3 m3=new MyThread3(30);
		m3.start();
		for(int i=0;i<20;i++)
		{
			System.out.println("main:"+i);
		}

	}

}
