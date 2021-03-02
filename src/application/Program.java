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
		
		System.out.println("Enter radius: ");
		System.out.print("Radiu: ");
		double radius = sc.nextDouble();
		
		double c = Calculate.circunference(radius);
		double v = Calculate.volume(radius);
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculate.PI);
		
		sc.close();
	}
}
