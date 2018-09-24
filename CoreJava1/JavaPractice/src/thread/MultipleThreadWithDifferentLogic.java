package thread;

public class MultipleThreadWithDifferentLogic {

	public static void main(String[] args) {
		System.out.println("main started");
		AddThread add=new AddThread();
		add.start();
		SubThread sub=new SubThread();
		sub.start();
		System.out.println("main exited");

	}

}
