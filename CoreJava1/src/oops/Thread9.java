package oops;
class MyThread8 extends Thread
{
	int x;
	boolean xInitialized=false;

	public void setX(int x) {
		this.x = x;
		xInitialized=true;
	}
	public void run()
	{
		if(!xInitialized)
			{throw new IllegalStateException("Error:x is not initialized for"+"the thread["+getName()+"]");
		
			
		}
	for(int i=0;i<this.x;i++)
	{
		System.out.println(getName()+"Run:"+i);
	}
}
}

public class Thread9 {

	public static void main(String[] args) {
		MyThread8 t1=new MyThread8();
		t1.setX(5);
		t1.start();
		MyThread8 t2=new  MyThread8();
		t2.setX(5);
		t2.start();
		MyThread8 t3=new MyThread8();
		t3.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main"+i);
		}
	}

}
