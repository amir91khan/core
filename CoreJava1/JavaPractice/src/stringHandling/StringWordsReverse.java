package stringHandling;

public class StringWordsReverse {
	public static String reverseStringWords(String s)
	{
		String[] StringWords=s.split("");
		String resultString="";
		for(int i=StringWords.length-1;i>=0;i--)
		{
			resultString+=StringWords[i]+"";
		}
		return resultString;
	}

 
}
