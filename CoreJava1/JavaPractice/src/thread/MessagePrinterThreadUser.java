package thread;

public class MessagePrinterThreadUser {

	public static void main(String[] args) {
		PrintMessage pm=new PrintMessage();
		MessagePrinterThread ob1=new MessagePrinterThread(pm,"HI");
		MessagePrinterThread ob2=new MessagePrinterThread(pm,"HELLO");
		MessagePrinterThread ob3=new MessagePrinterThread(pm,"HOW ARE YOU");

	}

}
