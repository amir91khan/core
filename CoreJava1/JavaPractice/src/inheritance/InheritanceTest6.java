package inheritance;

class G {
	G() {
		System.out.println("NPCG");
	}
}

class H extends G {
	H() {
		System.out.println();
	}
}

class I extends H {
	I() {
		System.out.println("NPCI");
	}
}

public class InheritanceTest6 {

	public static void main(String[] args) {
		I obji = new I();

	}

}
