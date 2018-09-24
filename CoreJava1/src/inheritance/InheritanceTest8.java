package inheritance;

class AA {
	private int x = 10;

	int getX() {
		return x;
	}
}

class BB extends AA {
	int p = 20;
}

public class InheritanceTest8 {

	public static void main(String[] args) {
		BB objb = new BB();
		// System.out.println(objb.x);
		System.out.println(objb.p);

	}

}
