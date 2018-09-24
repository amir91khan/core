package oops;
 class MyThread11 extends Thread
 {
	 MyThread11() {
		super();
	}
	 MyThread11(String name)
	 {
		 super(name);
		
	}
	 
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println(getName()+"i"+i);
		}
	}
 }

public class Thread15 {

	public static void main(String[] args) {
		MyThread11 mt1=new MyThread11();
		MyThread11 mt2=new MyThread11("child2");
		System.out.println("mt1 thread is initial name and priority");
		System.out.println("mt1 name:"+mt1.getName());
		System.out.println("mt1 priority"+mt1.getPriority());
		System.out.println();
		System.out.println("mt2 thread is initial name and priority");
		System.out.println("mt2 name:"+mt1.getName());
		System.out.println("mt2 priority"+mt1.getPriority());
		mt1.setName("child1");
		mt1.setPriority(6);
		mt2.setPriority(9);
		
		
	}

}
