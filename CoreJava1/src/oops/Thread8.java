package oops;

public class Thread8 extends Thread {
	@Override
	public void run() {
		System.out.println("run");
			}
	@Override
	public void start() {
		System.out.println("start");
		
	}

	public static void main(String[] args) {
		Thread8 t=new Thread8();
		t.start();
		System.out.println("main");
		
	}

}
