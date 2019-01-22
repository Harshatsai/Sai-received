package fileIOPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DelimiterDemo {
	
	public static void main(String[] args) throws IOException {
		try {
			  Scanner s = new Scanner(new BufferedReader(new FileReader("C:\\Assignments\\newFile.txt")));
			  s.useDelimiter(",");
			   while (s.hasNext()) 
			   {
				   System.out.println(s.next());
			   }
			   s.close();
			}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
		
	}
}
