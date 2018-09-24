package thread;

public class MyThreadTest2 extends Thread {
	public void run()
	{
		MyThreadTest2 mt1=new MyThreadTest2();
	 mt1.start();
		for(int i=1;i<=20;i++)
		{
			System.out.println("MyThread run:"+i);
		}
	}

	
	
		
	}


