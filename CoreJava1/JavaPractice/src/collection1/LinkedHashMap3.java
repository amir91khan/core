package collection1;
import java.util.*;
class Book11
{
	int id;
	String name,author,publisher;
	int qty;
	public Book11(int id,String name,String author,String publisher,int qty)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.qty=qty;
	}
}
public class LinkedHashMap3 {

	public static void main(String[] args) {
		Map<Integer,Book11> map=new LinkedHashMap<Integer,Book11>();
		Book11 b1=new Book11(101,"Java","JG","ABC",1000);
		Book11 b2=new Book11(102,"AngularJs","Google","PQR",900);
		Book11 b3=new Book11(103,"Oracle","SUN","XYZ",800);
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		for(Map.Entry<Integer,Book11> m:map.entrySet())
		{
			int key=m.getKey();
			Book11 b=m.getValue();
			System.out.println(key+"Details:");
			System.out.println(b.id+"\t"+b.name+"\t"+b.author+"\t"+b.publisher+"\t"+b.qty);
		}
		
		

	}

}
