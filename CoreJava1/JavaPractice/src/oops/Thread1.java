package oops;
class MyRunnable implements Runnable
{

	@Override
	public void run() {
		
	}

}
class MyThread extends Thread
{
	public MyThread() {
		super();
}
	MyThread(Runnable runable) {
	super(runable);
	}
	
@Override
public void run() {
	System.out.println("MyThread.run()");
}
}
public class Thread1 {

	public static void main(String[] args) {
		Thread t1=new Thread();
		t1.start();
		
	}

}
