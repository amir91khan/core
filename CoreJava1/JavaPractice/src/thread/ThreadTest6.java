package thread;

class MyThread5 extends Thread {
	int x;
	boolean xInitialized = false;

	public void setX(int x) {
		this.x = x;
		xInitialized = true;
		
	}

	public void run() {
		if (!xInitialized) {
			throw new IllegalStateException("Error:x is not initalized for" + "the thread[" + getName() + "]");
		}
		for (int i = 0; i < this.x; i++) {
			System.out.println("Run:" + i);
		}
	}
}

public class ThreadTest6 {

	public static void main(String[] args) {
		MyThread5 m1 = new MyThread5();
		m1.setX(5);
		m1.start();
		
		  MyThread5 m2=new MyThread5(); 
		  m2.setX(10); 
		  m2.start();
		 

MyThread5 m3 = new MyThread5();
		m3.start();
		for (int i = 0; i < 8; i++) {
			System.out.println("main" + i);
		}
	}
}
