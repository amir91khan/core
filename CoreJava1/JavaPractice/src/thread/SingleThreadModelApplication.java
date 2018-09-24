package thread;
public class SingleThreadModelApplication {

	public static void main(String[] args) {
		PrintNumbers pn=new PrintNumbers();
		
		long time1=System.currentTimeMillis();
		pn.print1To50();
		long time2=System.currentTimeMillis();
		pn.print50To1();
		System.out.println("Time Taken To Complete both tasks:"+((time2-time1)/1000)+"sec");

	}

}
