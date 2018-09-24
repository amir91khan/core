package thread;
class MyThread10 extends Thread
{
	public void run()
	{
		System.out.println("run executed"+getName());
	}
}
public class ThreadTest11 {

	public static void main(String[] args) {
		MyThread10 mt=new MyThread10();
		MyThread10 mt1=new MyThread10();
		mt.setPriority(7);
		mt1.setPriority(9);
		System.out.println("main executed");
		

	}

}
