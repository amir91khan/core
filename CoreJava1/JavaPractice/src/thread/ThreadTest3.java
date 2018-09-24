package thread;

class MyThread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println(getName()+"Run:"+i);
		}
	}
}
public class ThreadTest3 {

	public static void main(String[] args) {
		MyThread2 m1=new MyThread2();
		m1.start();
		MyThread2 m2=new MyThread2();
		m2.start();
		MyThread2 m3=new MyThread2();
		m3.start();
		

	}

}
