package collection1;

import java.util.*;

public class ArraySearch1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int[] a = { 10, 5, 20, 11, 6 };
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 6));//1
		System.out.println(Arrays.binarySearch(a, 14));//-5
		String[] s = { "A", "C", "D", "B" };
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s, "C"));//2
		System.out.println(Arrays.binarySearch(s, "E"));//-5
		Arrays.sort(s, MyComparator16());
		System.out.println(Arrays.binarySearch(s, "C", MyComparator16()));
		//2
		System.out.println(Arrays.binarySearch(s, "E", MyComparator16()));
		//-5
		System.out.println(Arrays.binarySearch(s, "F"));
		//-5

	}

	private static Comparator MyComparator16() {

		return null;
	}

}
