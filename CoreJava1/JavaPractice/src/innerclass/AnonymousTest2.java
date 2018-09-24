package innerclass;

abstract class Person1 {
	abstract void eat();
}

public class AnonymousTest2 {

	public static void main(String[] args) {
		Person1 p = new Person1() {
			void eat() {
				System.out.println("eating fruits");
			}

		};
		p.eat();
	}
 
}
