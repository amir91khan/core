package collection;
import java.util.Vector;
public class VectorTest2 {

	public static void main(String[] args) {
		Vector v=new Vector(3);
		System.out.println("initial capacity and size of vector is....");
		System.out.println("Capacity:"+v.capacity());
		System.out.println("Size:"+v.size());
		System.out.println();
		Customer c1=new Customer("Newton",30,new Address("2-3101/1","Ameerpet","Hyd","12345"));
	Customer c2=new Customer("Einstene",23,new Address("1-10-1022/3","Kokatpally","Hyd","23335"));
	//Customer c3=new Customer("Yuvi",31,new Address("2-20-2002/4","RelienceFresh","Hyd","12356"));
v.add(c1);
v.add(c2);
	}
	
}
