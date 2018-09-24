package oops;
class Test33
{
	public static Test33 t1=null;
	public static Test33 t2=null;
	private Test33()
	{

	}
	public static Test33 getTest33()
	{
		if(t1==null)
		{
			t1=new Test33();
			return t1;
			
		}
		else if(t2==null)
		{
			t2=new Test33();
			return t2;
		}
		else
		{
			if(Math.random()<0.5)
			{
				return t1;
			}
				else
					return t2;

			}
		
			
		}
	}


public class Singleton1 {

	public static void main(String[] args) {
		System.out.println(Test33.getTest33().hashCode());
		System.out.println(Test33.getTest33().hashCode());
		System.out.println(Test33.getTest33().hashCode());
		System.out.println(Test33.getTest33().hashCode());
		
	}
		
	}


