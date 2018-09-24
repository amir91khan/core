package collection1;
import java.util.*;
class IntegerComparator implements Comparartor
{
	public int compare(Object o1,Object o2)
	{
		int x=(Integer)01;
		int y=(Integer)02;
		if(x>y)
			return -1;
		else if(x<y)
		return +1;
		else
			return 0;
	}
	public boolean equals(Object o)
	{
		
}
}

public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		for(int x:ts)
			System.out.println(x);
		

	}

}
