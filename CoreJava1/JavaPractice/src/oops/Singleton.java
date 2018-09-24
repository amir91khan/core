package oops;
class Test22
{
	private static Test22 t=null;
	private Test22()
	{
	
	}
 public static Test22 getTest22()
{
	if(t==null)
	{
		t=new Test22();
	}
	return t;
}

}

public class Singleton {

	public static void main(String[] args) {
		System.out.println(Test22.getTest22().hashCode());
		System.out.println(Test22.getTest22().hashCode());
		
	}

}
