package oops;
class MyThread10 extends Thread
{
	public void run() {
		System.out.println(getName()+"run executed");
		
	}
}

public class Thread14 {

	public static void main(String[] args) {
		
		MyThread10 mt1=new MyThread10();
		MyThread10 mt2=new MyThread10();
		mt1.setPriority(7);
		mt2.setPriority(9);
		mt1.start();
		mt2.start();
	}

}
