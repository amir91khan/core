package oops;
class Addition{
	static void add() {
		System.out.println("no-arg");
	}
	static void add(int a) {
		System.out.println("1 int arg");
	}
	static void add(int a,int b) {
		System.out.println("2 int arg");
	}
	static void add(int a,int b,int c) {
		System.out.println("3 int arg");
	}
	static void add(int a,int b,int c,int d) {
		System.out.println("4 int arg");
	}
}
public class Arr10 {

	public static void main(String[] args) {
		Addition a=new Addition();
		Addition.add();
		Addition.add(5);
		Addition.add(5,6);
		Addition.add(5,6,7);
		Addition.add(5,6,7,8);
		
	}

}
