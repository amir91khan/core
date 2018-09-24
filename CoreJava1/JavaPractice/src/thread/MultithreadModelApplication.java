package thread;

class MultiThreadModelApplication extends Thread {
	static PrintNumbers pn = new PrintNumbers();

	public void run() {
		pn.print50To1();
	}

	public static void main(String[] args) {
		MultiThreadModelApplication mt = new MultiThreadModelApplication();
		long time1 = System.currentTimeMillis();
		mt.start();

		pn.print1To50();
		long time2 = System.currentTimeMillis();
		System.out.println("Time Taken To both tasks: " + ((time2 - time1) / 1000) + "sec");

	}

}
