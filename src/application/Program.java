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
		finally // Finally � usado para declarar um bloco de c�digo que ser� executado independemente de ocorrer ou n�o uma "Exception": Exemplo: fechar uma "conec��o com BD", fechar um "File"
		{
			if(sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed");
		}
	}
}
