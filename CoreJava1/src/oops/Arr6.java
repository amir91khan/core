package oops;

public class Arr6 {
static void m1(Example1[] e) {
	e[1]=null;
	e=null;
}
	public static void main(String[] args) {
		Example1[] e=new Example1[5];
		e[0]=new Example1();
		Example1 e1=new Example1();
		e[3]=e1;
		//line #1:e1=null;
		//line#2:m1(e);
		
	}

}
