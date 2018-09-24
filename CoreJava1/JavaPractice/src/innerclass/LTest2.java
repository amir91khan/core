package innerclass;
class LocalTest
{
	private int data=30;
	void display()
	{
     class Local
     {
    	 void msg()
    	 {
    		 System.out.println(data);
    	 }
     }
     Local l=new Local();
     l.msg();
	}
}
public class LTest2 {

	public static void main(String[] args) {
		LocalTest t=new LocalTest();
		t.display();
		
		

	}

}
