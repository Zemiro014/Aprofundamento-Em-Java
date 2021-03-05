package application;

import java.io.File;
import java.text.ParseException;
import java.util.Scanner;

public class Program {
	
	public static void  main(String[] args) throws ParseException {
		
		// Programa que pega as informações de um File
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		System.out.println("File name: "+path.getName()); // pega o nome do arquivo e despresa o caminho.
		System.out.println("File parent: "+path.getParent()); // pega o caminho do arquivo e despresa o nome.
		System.out.println("File path: "+path.getPath()); // pega o caminho todo do arquivo.
		sc.close();
	}

}
