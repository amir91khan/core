package oops;
class MyThread6 extends Thread
{
	int x;

	public MyThread6(int x) {
		
		this.x = x;
	}
	@Override
	public void run() {
		for(int i=0;i<this.x;i++)
		{
			System.out.println(getName()+"run"+i);
		}
	}
      
}

public class Thread6 {

	public static void main(String[] args) {
		MyThread6 t1=new MyThread6(5);
		t1.start();
		MyThread6 t2=new MyThread6(7);
		t2.start();
		for(int i=0;i<=5;i++)
		{
			System.out.println("main"+i);
		}
		
	}

}
