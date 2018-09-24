package oops;
class Add
{
	int x,y;

	public Add(int x, int y) {
		this.x = x;
		this.y = y;
		try
		{
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		int res=this.x+this.y;
		System.out.println("In"+Thread.currentThread().getName()+"Result:"+res);
	}

	public void Add(int i, int j) {
		// TODO Auto-generated method stub
		
	}
	
}
class Thread23 extends Thread

{
	Add a;
	Thread23(Add a){
		this.a=a;
	}
	public void run()
	{
		a.Add(70,80);
	
	}
}

public class Thread22 {

	public static void main(String[] args) {
		Add a=new Add(50, 60);
	Thread23 t=new Thread23(a);
	t.start();
		
		
	}

}
