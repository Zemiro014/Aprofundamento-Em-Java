package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class Program {
	
	public static void  main(String[] args) throws ParseException 
	{		
		
		//Scanner sc = new Scanner(System.in);
			
		File file = new File("c:\\temp\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("Error opening file: "+e.getMessage());
		}
		finally // Finally é usado para declarar um bloco de código que será executado independemente de ocorrer ou não uma "Exception": Exemplo: fechar uma "conecção com BD", fechar um "File"
		{
			if(sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed");
		}
	}
}
