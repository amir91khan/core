package thread;

 class MessagePrinterThread implements Runnable {
	 String msg;
	 PrintMessage pm;
	 Thread th;
	 public MessagePrinterThread(PrintMessage pm,String msg)
	 {
		 this.pm=pm;
		 this.msg=msg;
		 th=new Thread(this);
		 th.start();
	 }
	 public void run()
	 {
		 pm.printMsg(msg);
	 }
	

}
