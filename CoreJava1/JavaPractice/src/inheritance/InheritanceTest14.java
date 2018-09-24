package inheritance;

class Q {
	{
		System.out.println("NSBQ");
	}

	Q() {
		System.out.println("NPCQ");
	}
}

class R extends Q {
	{
		System.out.println("NSBR");
	}

	R() {
		System.out.println("NPCR");
	}
}

public class InheritanceTest14 {

	public static void main(String[] args) {
		R obj1 = new R();

	}

}
