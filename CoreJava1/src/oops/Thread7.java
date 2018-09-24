package oops;
class MyThread7 extends Thread
{
	int x;

	public void setX(int x) {
		this.x = x;
	}
	  @Override
	public void run() {
		for(int i=0;i<this.x;i++)
		{
			System.out.println(getName()+"Run"+i);
		}
		
	}
	

	}

public class Thread7 {

	public static void main(String[] args) {
		MyThread7 t1=new MyThread7();
		t1.setX(5);
		t1.start();
		MyThread7 t2=new MyThread7();
		t2.setX(5);
		t2.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("main"+i);
		}
		
	}

}
