package application;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	
	public static void  main(String[] args) throws ParseException {
		
		// Programa que pega as informa��es de um File
		
		Scanner sc = new Scanner(System.in);		
		
		try 
		{
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position !");
		}
		catch(InputMismatchException e) {
			System.out.println("Input Error");
		}
		
		System.out.println("End of program");
		
		sc.close();
	}

}
