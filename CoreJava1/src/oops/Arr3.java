package oops;
class Empl
{
	static void m1(int[] a)
	{
		System.out.println("Array Size:"+a.length);
		System.out.println("its elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t");
		}
	}
}

public class Arr3 {

	public static void main(String[] args) {
		int[] i1= {5,3,6,7};
		Empl.m1(i1);
	    int[] i2=new int[5];
	    Empl.m1(i2);
	    Empl.m1(new int[] {3,4,5});
	}

}
