package thread;

class MyThread14 extends Thread {
	public void run() {
		System.out.println("MyThread1 priority:" + this.getPriority());
		System.out.println("MyThread1 daemon:" + this.isDaemon());
	}
}

class MyThread15 extends Thread {
	public void run() {
		System.out.println("MyThread2 priority:" + this.getPriority());
		System.out.println("MyThread2 daemon:" + this.isDaemon());
		MyThread14 mt = new MyThread14();
		mt.start();

	}
}

public class DaemonThread3 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main started");
		Thread th = Thread.currentThread();
		System.out.println("main thread priority:" + th.getPriority());
		System.out.println("main thread daemon:" + th.isDaemon());
		MyThread15 mt1 = new MyThread15();
		System.out.println("MyThread15 original priority:" + mt1.getPriority());
		System.out.println("MyThread15 original daemon:" + mt1.isDaemon());
		mt1.setPriority(7);
		mt1.start();
		mt1.setDaemon(false);
		mt1.start();
		Thread.sleep(3000);
		System.out.println("main exited");

	}

}
