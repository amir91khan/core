package inheritance;

class P1 {
	static int x;
	static {
		x = 10;
	}
}

public class StaticBlockTest16 {

	public static void main(String[] args) {
		System.out.println(P1.x);

	}

}
