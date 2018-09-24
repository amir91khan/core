package thread;

class MyThread13 extends Thread
{

	public static void main(String[] args) {
		MyThread13 mt=new MyThread13();
		mt.setDaemon(true);
		mt.start();
		

	}

}
