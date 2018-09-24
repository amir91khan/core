package inheritance;

class Animal1 {
	void eat() {
		System.out.println("animal eat...");
	}
}

class Dog1 extends Animal1 {
	void bark() {
		System.out.println("Dog barking.....");
	}
}

class BabyDog extends Dog1 {
	void weep() {
		System.out.println("BabyDog weeping....");
	}
}

public class MultileveTest1 {

	public static void main(String[] args) {
		BabyDog bd = new BabyDog();
		bd.weep();
		bd.bark();
		bd.eat();
	}

}
