package thread;

public class WaitNotify {

	public static void main(String[] args) {
		Factory bajaj=new Factory();
		new Producer(bajaj);
		new Consumer(bajaj);

	}

}
