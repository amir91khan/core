package oops;
class DaemonThread implements Runnable
{
	Thread th;
	 DaemonThread() {
		 th=new Thread(this);
		 th.setDaemon(true);
		 th.start();
		
	}
	 public void run() {
		System.out.println("Run:"+th.isDaemon());
		for(int i=1;i<=50;i++)
		{
			System.out.println("Run:"+i);
		}
	}
}

public class Thread19 {

	public static void main(String[] args) {
		DaemonThread d=new DaemonThread();
	
		System.out.println("Abc countdown starts");
		for(int i=1;i<=5;i++)
		{
			System.out.println("main:"+i);
		}
		
	}

}
