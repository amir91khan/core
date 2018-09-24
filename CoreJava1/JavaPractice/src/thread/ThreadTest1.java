package thread;

class MyRunnable implements Runnable {
	public void run() {
		System.out.println("From MyRunnable.run()");
	}
}

class MyThread extends Thread {
	public void run(String s)
	{
	MyThread() {
		super();
	}

	MyThread(Runnable target) {
		super(target);
	}

	public void run() {
		System.out.println("From MyThread.run()");
	}
}

public class ThreadTest1 {

	public static void main(String[] args) {
		Thread th = new Thread();
		th.start();
		MyThread mt = new MyThread();
		mt.start();
		MyRunnable mr = new MyRunnable();
		mr.start();
		Thread th1 = new Thread(mr);
		th1.start();
		MyThread mt1 = new MyThread();
		Thread th3 = new Thread();
		th3.start();
		Thread th4 = new MyThread();
		th4.start();
		Thread th5 = new MyRunnable();
		th5.start();
		Runnable r = new MyRunnable();
		r.start();
		Thread th6 = new Thread(r);
		th6.start();
		Runnable r1 = new MyThread();
		r1.start();
		Thread th7 = new Thread(r);
		th7.start();
		MyRunnable mr3 = new MyRunnable();
		MyThread mt2 = new MyThread(mr3);

	}

}
