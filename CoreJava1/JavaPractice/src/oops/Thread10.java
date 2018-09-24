package oops;
class AddThread extends Thread
{
	int sum=0;
	@Override
	public void run() {
		
		for(int i=1;i<=50;i++)
		{
			sum=sum+i;
			System.out.println("sum"+sum);
		}
	}
}
class SubThread extends Thread
{
	int sub=0;
	@Override
	public void run() {
		for(int i=50;i>=1;i--)
		{
			sub=sub-i;
			System.out.println("sub"+sub);
		}
	}
}

public class Thread10 {

	public static void main(String[] args) {
		AddThread a=new AddThread();
		a.start();
		SubThread s=new SubThread();
		s.start();
		System.out.println("main exited");
		
	}

}
