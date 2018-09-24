package constructor;
class Time
{
	private int hh,mm,ss;
	Time(int hh)
	{
		this.hh=hh;
		
	}
	Time(int hh,int mm)
	{
		this.hh=hh;
		this.mm=mm;
	}
	Time(int hh,int mm,int ss)
	{
		this.hh=hh;
		this.mm=mm;
		this.ss=ss;
	}
	void printTime()
	{
		System.out.println(hh);
		System.out.println(mm);
		System.out.println(ss);
	}
}
public class ConTest6 {

	public static void main(String[] args) {
		Time t1=new Time(8);
		t1.printTime();
		
		
	}

}
