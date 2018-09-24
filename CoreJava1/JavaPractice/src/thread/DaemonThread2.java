package thread;

class DaemonDemo implements Runnable {
	Thread th;

	DaemonDemo() {
		th = new Thread(th);
		th.setDaemon(true);
		th.start();
	}

	public void run() {
		System.out.println("Run:" + th.isDaemon());
		for (int i = 1; i <= 100; i++) {
			System.out.println("Run:" + i);
		}
	}
}

public class DaemonThread2 {

	public static void main(String[] args) {
		DaemonDemo dd = new DaemonDemo();
		System.out.println("countdown start");
		for (int i = 1; i <= 5; i++) {
			System.out.println("main:" + i);
		}

	}

}
