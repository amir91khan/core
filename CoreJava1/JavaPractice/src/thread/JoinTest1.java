package thread;

class JoinDemo extends Thread {
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(getName() + ":" + i);
			if (i == 5 && getName().equals("child2")) {
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}

public class JoinTest1 {

	public static void main(String[] args) {
		System.out.println("main started");
		JoinDemo jd1 = new JoinDemo();
		jd1.setName("chiled1");
		jd1.start();
		JoinDemo jd2 = new JoinDemo();
		jd2.setName("child2");
		jd2.start();
		System.out.println("main end");

	}

}
