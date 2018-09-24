package thread;

public class ThreadTest13 {
	static 
	{
		System.out.println("in SB");
		Thread th=Thread.currentThread();
		System.out.println("SB is exceuted in\""+th.getName()+"\"thread\n");;
	}

	public static void main(String[] args) {
		System.out.println("\n in main thread");
		Thread th=Thread.currentThread();
		System.out.println("original name and priority of main thread");
		System.out.println("current thread  name:"+th.getName());
		System.out.println("current thread priority:"+th.getPriority());
		th.setName("xxyy");
		th.setPriority(7);
		System.out.println("\n modified name and priority of main thread");
		System.out.println("current thread name:"+th.getName());
		System.out.println("current thread priority:"+th.getPriority());
		
		

	}

}
