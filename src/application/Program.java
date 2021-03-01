package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculate;


/*
 * Na mesma "class" não se deve chamar um método não estático da class dentro dos métodos estático da class.
 * */
public class Program {
	
	
	
	public static void  main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculate calc = new Calculate();
		
		System.out.println("Enter radius: ");		
		System.out.print("Radiu: ");
		double radius = sc.nextDouble();
		
		double c = calc.circunference(radius);
		double v = calc.volume(radius);
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		sc.close();
	}
	
	
}
