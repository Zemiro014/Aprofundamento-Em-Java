package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class Program {
	
	public static void  main(String[] args) throws ParseException {
		
		// Programa que lê as informações de um arquivo usando "Streams" (BufferedReader, FileReader)		
		String path = "c:\\temp\\in.txt";		
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) 
		{
			System.out.println("Error: "+e.getMessage());			
		}
		finally {
			try {
				if(br != null) 
				{
					br.close();
				}
				if(fr != null) 
				{
					br.close();
				}
			}
			catch(IOException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
