package innerclass;
interface Animal
{
	void eat();
	
}

public class ATest2 {

	public static void main(String[] args) {
		Animal dog=new Animal()
				{
			public void eat()
			{
				System.out.println("dog eat");
			}
				};
				dog.eat();
		

	}

}
