package oops;

public class Thread11 extends Thread {
	public void run() {
		System.out.println("run");
		
	}
	public  void start() {
		System.out.println("start");
		run();
		super.start();
	}
	
	
	public static void main(String[] args) {
		Thread11 t=new Thread11();
		t.start();
		System.out.println("main");
		
	}

}
