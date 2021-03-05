package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

public class Program {
	
	public static void  main(String[] args) throws ParseException {
		
		// Programa que escreve caracteres em um arquivo usando "Streams" (BufferedReader, FileReader) em um bloco "try-with-resources"	
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night", "Good evning"};
		
		String path = "c:\\temp\\out.txt";
		
		/*
		 * Se vc não especificar o "true" em "FileWriter", cada vez que tu rodar o programa ele irá destruir o arquivo anterior e recria-lo. 
		 * 
		 * Com "true" especificado ele irá adicionar novos conteudos ao arquivo exixtente sempre que vc rodar o programa
		 * */
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) 
		{
			
			for (String line : lines) 
			{
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) 
		{
			e.printStackTrace();			
		}
	}

}
