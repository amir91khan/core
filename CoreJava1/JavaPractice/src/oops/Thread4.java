package oops;
class MyThread5 extends Thread
{
	public void run() 

{
		for(int i=1;i<=5;i++)
		{
			System.out.println(getName()+"run"+i);
		}
}
}

public class Thread4  {

	public static void main(String[] args) {
		MyThread5 t1=new MyThread5();
		t1.start();
		MyThread5 t2=new MyThread5();
		t2.start();
		
	}

}
