package oops;
class PrintNumber
{
	public void print1to10()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try
			
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
		public void print10to1()
		{
			for(int i=10;i>=1;i--)
			{
				System.out.println(i);
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}
			
				
		}		
		
	
}

public class Thread12 {

	public static void main(String[] args) {
		PrintNumber p=new PrintNumber();
		long time1=System.currentTimeMillis();
		p.print1to10();
		System.out.println();
		p.print10to1();
		long time2=System.currentTimeMillis();
		System.out.println("time taken to complete both task:"+((time2-time1)/1000)+"sec");
		
	}

}

