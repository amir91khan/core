package thread;

public class TestCreatingFromOCT {

	public static void main(String[] args) {
		System.out.println("main thread");
		MyThreadTest2 mt2=new MyThreadTest2();
		mt2.start();
		System.out.println("main exited");

	}

}
