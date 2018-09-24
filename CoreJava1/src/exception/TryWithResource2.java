package exception;

public class TryWithResource2 {

	public static void main(String[] args) {
		try("a")
		{

	}
		try(PrintWriter pw=new PrintWriter(System.out))
				{

}
				try(PrintWriter pw=new PrintWriter(System.out))
				{
				
				}
				try(FileWriter fw=new FileWriter("abc.text"))
				{
					
				}
				catch(FileNotFoundException e)
				{
					
				}
				catch(IOExeption k) {
					
				}
				try(PrintWriter pw)
				{
		
}
	}
}