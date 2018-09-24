package inheritance;

class Animal {
	void eat() {
		System.out.println("eating aniaml....");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking dog....");
	}
}

public class SingleTest1 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();

	}

}
