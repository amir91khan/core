package oops;

public class Thread16 {
	static
	{
		System.out.println("in SB");
		Thread th=Thread.currentThread();
		System.out.println("SB is executing in \""+th.getName()+"\"thread\n");
	}

	public static void main(String[] args) {
		System.out.println("\n In main Method");
		Thread th=Thread.currentThread();
		System.out.println("original name  n priority of main thread");
		System.out.println("current thread name:"+th.getName());
		System.out.println("current thread priority:"+th.getPriority());
		th.setName("aamir");
		th.setPriority(7);
		System.out.println("\n modified name  n priority of main thread");
		System.out.println("current thread name:"+th.getName());
		System.out.println("current thread priority:"+th.getPriority());
		
		
	}

}
