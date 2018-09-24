package stringHandling;
import java.util.*;
public class StringTokenizer {


	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer();
		System.out.println("Number of Tokens:"+st.c);
		while(st.hashMoreTokens())
		{
			String token=st.nextToken();
			System.out.println(token);
		}

	}

}
