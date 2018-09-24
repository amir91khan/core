package thread;
class AddThread extends Thread
{
	int sum=0;
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			sum=sum+i;
			System.out.println("Summation:"+sum);
		}
	}
}



