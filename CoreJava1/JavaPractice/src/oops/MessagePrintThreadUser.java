package oops;
class PrintMessage
{
	synchronized void printMsg(String msg)
	{
		System.out.println("["+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
class MessagePrinterThread implements Runnable
{
	    String msg;
	    PrintMessage pm;
		
		public MessagePrinterThread(PrintMessage pm,String msg)
		{this.pm=pm;
		this.msg=msg;
		Thread th =new Thread(this);
		th.start();
		}
		
	 
	public void run() {
		pm.printMsg(msg);
		
	}
}

public class MessagePrintThreadUser {

	public static void main(String[] args) {
		PrintMessage pm=new PrintMessage();
		MessagePrinterThread ob1=new MessagePrinterThread(pm, "hi");
		MessagePrinterThread ob2=new MessagePrinterThread(pm, "hello");
		MessagePrinterThread ob3=new MessagePrinterThread(pm, "bye");
		
		
		
	}

}
