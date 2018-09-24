package thread;
class MyThread11 extends Thread
{
	MyThread11()
	{
		super();
	}
	MyThread11(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(getName()+"i:"+i);
		}
	}
}
public class ThreadTest12 {

	public static void main(String[] args) {
		MyThread11 m1=new MyThread11("child1");
		MyThread11 m2=new MyThread11("child2");
		System.out.println("m1 thread inintial name and priority");
		System.out.println("m1name:"+m1.getName());
		System.out.println("m1 priority:"+m1.getPriority());
		System.out.println();
		System.out.println("m2 thread initial name and priority");
		System.out.println("m2 name:"+m2.getName());
		System.out.println("m2 priority:"+m2.getPriority());
	//	m1.setName("child1");
		m1.setPriority(6);
		m2.setPriority(9);
		System.out.println("m1 thread changed name and priority");
		System.out.println("m1 name:"+m1.getName());
		System.out.println("m1 priority:"+m1.getPriority());
		System.out.println();
		System.out.println("m2 thread changed name and priority");
		System.out.println("m2 name:"+m2.getName());
		System.out.println("m2 priority:"+m2.getPriority()); 
		m1.start();
		m2.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main i:"+i);
		}
		
		

	}

}
