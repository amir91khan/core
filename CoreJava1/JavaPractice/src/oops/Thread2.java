package oops;
//class MyRun implements Runnabale
//{}
class MyThread1 extends Thread
{}
class MyThread2 extends Thread implements Runnable
{}
class MyThread3 extends Thread
{
	@Override
	public void run() {
		System.out.println("run no-param");
	}
	public void run(String s)
	{
		System.out.println("run String-param");
	}
}

public class Thread2 {

	public static void main(String[] args) {
		MyThread3 t=new MyThread3();
		t.start();
		
	}

}
