package oops;
class MyThread14 extends Thread
{
	public void run()
	{
		System.out.println("MyThread14 priority"+this.getPriority());
		System.out.println("MyThread14 daemon"+this.isDaemon());
	}
}
class MyThread15 extends Thread
{
	
	public void run() {
		System.out.println("MyThread15 priority"+this.getPriority());
		System.out.println("MyThread15 daemon"+this.isDaemon());
		
	}
}

public class Thread20 {

	public static void main(String[] args)throws InterruptedException {
		System.out.println("main started");
		Thread th=Thread.currentThread();
	//	System.out.println("main thread priority"+this.getPriority());
		//System.out.println("main thread daemon"+this.isDaemon());
        MyThread15 mt2=new MyThread15();
        mt2.start();
      //  System.out.println("MyThread15 original priority"+this.getPriority());
       // System.out.println("MyThread15 original priority"+this.isDaemon());
        mt2.setPriority(7);
        mt2.setDaemon(true);
        mt2.start();
        Thread.sleep(3000);
        System.out.println("main exited");
    	
	}

}
