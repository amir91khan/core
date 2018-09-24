package oops;

public class Arr4 {
	static void m1(int[] a) {
	a[3]=5;
	}
	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		m1(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"\t");
		}
		
	}

}
