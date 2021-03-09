package application;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	
	public static void  main(String[] args) throws ParseException 
	{		
		// Por padrão em java, quando O "EXCEPTION" não é tratada o programa termina de executar no ponto em que originou A "EXCEÇÃO".
		 method1();		
		System.out.println("End of program");	
	}
	
	public static void method1() 
	{
		System.out.println("***Method1 start***");
		method2();
		System.out.println("***Method1 end***");
	}
	public static void method2()
	{
		System.out.println("***Method2 start***");
		Scanner sc = new Scanner(System.in);
		try
		{
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position !");
			e.printStackTrace(); // serve para rastrear o percurso da excessão em questão
			sc.nextLine();
		}
		catch(InputMismatchException e) {
			System.out.println("Input Error");
		}
		
		sc.close();
		System.out.println("***Method2 end***");
	}
}
