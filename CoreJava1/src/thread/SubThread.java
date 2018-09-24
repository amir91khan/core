package thread;

class SubThread extends Thread
{
	int diff=0;
	public void run()
	{
		for(int i=50;i>=1;i--)
		{
			diff=diff-1;
			System.out.println("Substraction:"+diff);
		}
	}
}