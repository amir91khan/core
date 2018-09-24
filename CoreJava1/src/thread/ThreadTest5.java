package thread;
class MyThread4 extends Thread
{
	int x;
	public void setX(int x)
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
public class ThreadTest5 {

	public static void main(String[] args) {
		MyThread4 m1=new MyThread4();
		m1.setX(10);
		m1.start();
		MyThread4 m2=new MyThread4();
		//m2.setX(20);
		m2.start();
		for(int i=0;i<20;i++)
		{
			System.out.println("main:"+i);
		}
		

	}

}
