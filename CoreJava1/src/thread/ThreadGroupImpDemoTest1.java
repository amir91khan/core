package thread;
class ThreadGroupImp implements Runnable
{
	String name;
	//public Object t;
	ThreadGroupImp(ThreadGroup thg,String threadName)
	{
		name=threadName;
		new Thread(thg,this).start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(name+":"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(name+"interrupted...");
		}
		System.out.println(name+"exiting...");
	}
}
public class ThreadGroupImpDemoTest1 {

	public static void main(String[] args) {
		ThreadGroup grpA=new ThreadGroup("Group A");
		ThreadGroup grpB=new ThreadGroup("Group B");
		ThreadGroupImp th1=new ThreadGroupImp(grpA,"Thread1");
		ThreadGroupImp th2=new ThreadGroupImp(grpA,"Thread2");
		ThreadGroupImp th3=new ThreadGroupImp(grpB,"Thread3");
		ThreadGroupImp th4=new ThreadGroupImp(grpB,"Thread4");
		grpA.list();
		grpB.list();
		System.out.println("Suspending GroupA...");
		grpA.suspend();
		//Thread.sleep(2000);
		System.out.println("Resuming GroupA...");
		grpA.resume();
		
		System.out.println("Main Thread existing...");
	

	}

}
