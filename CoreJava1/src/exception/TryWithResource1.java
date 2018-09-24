package exception;

import java.io.*;
import java.io.BufferedReader;

public class TryWithResource1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (

				BufferedReader br = new BufferedReader(new FileReader("abc.text"));) {
			String line = br.readLine();
			System.out.println(line);
		}

	}
}
