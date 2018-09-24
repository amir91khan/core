package thread;

class Thread2 extends Thread {
	/*Add a;
	Thread2(Add a)
	{
		this.a=a;
	}
	public void run()
	{
		a.Add(70, 80);
	}
	//public void start() {
		// TODO Auto-generated method stub
		
	}

//}
*/
	public void run()
	{
		Add.add(70, 80);
	}
	}