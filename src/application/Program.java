package application;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Program {
	
	public static void  main(String[] args) throws ParseException {
		
		// Programa que l� as informa��es de um arquivo
		
		File file = new File("c:\\temp\\in.txt");		
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
	}

}
