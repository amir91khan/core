package collection1;

import java.util.*;

import javax.print.DocFlavor.STRING;

public class TreeMap3 {

	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<Integer, String>();
		t.put(1, "A");
		t.put(2, "B");
		t.put(3, "C");
		t.put(4, "D");
		for (Map.Entry m : t.entrySet()) {
			{
				System.out.println(m.getKey() + "\t" + m.getValue());
			}
		}

	}

}
