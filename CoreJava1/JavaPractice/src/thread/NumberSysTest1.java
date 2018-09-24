package thread;

class PrintNumber {
	synchronized void display() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(Thread.currentThread().getName() + "run:" + i);
		}
	}
}

class MyThread20 extends Thread {
	PrintNumber pn;

	MyThread20(PrintNumber pn) {
		this.pn = pn;
	}

	public void run() {
		pn.display();
	}
}

public class NumberSysTest1 {

	public static void main(String[] args) {
		PrintNumber pn1 = new PrintNumber();
		PrintNumber pn2 = new PrintNumber();
		MyThread20 mt1 = new MyThread20(pn1);
		MyThread20 mt2 = new MyThread20(pn2);
		mt1.start();
		mt2.start();

	}

}
