package application;

import java.io.File;
import java.text.ParseException;
import java.util.Scanner;

public class Program {
	
	public static void  main(String[] args) throws ParseException {
		
		// Programa que lista todos os directórios
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		File[] folders = path.listFiles(File::isDirectory); // Criando um vector de "path" contidas no directoria especificado no "strPath"
		System.out.println("FOLDERS");
		for(File folder : folders) 
		{
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile); // Criando um vector de "files" contidas no directoria especificado no "strPath"
		System.out.println("FILES");
		for(File file : files) 
		{
			System.out.println(file);
		}
		
		// Criando uma subpast dentro do directoria especificado no "strPath"
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory  created successfully: "+ success);
		sc.close();
	}

}
