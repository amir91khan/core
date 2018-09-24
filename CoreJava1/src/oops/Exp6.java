package oops;

public class Exp6 {

	public static void main(String[] args) {
	    int a=10;
	    try
	    {
	    	int b=20;
	    	System.out.println(a);
	    	System.out.println(b);
	    }
	    catch(ArithmeticException e)
	    {
	    	a=30;
	    	//int c=40;
	    }
	    System.out.println(a);
	   //System.out.println(b);
	}

}
