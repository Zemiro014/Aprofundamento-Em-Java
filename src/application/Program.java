package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculate;
import entities.Triangle;

public class Program {
	
	public static void  main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle X, Y;
		X = new Triangle();
		Y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		X.a = sc.nextDouble();
		X.b = sc.nextDouble();
		X.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle X: ");
		Y.a = sc.nextDouble();
		Y.b = sc.nextDouble();
		Y.c = sc.nextDouble();
		
		System.out.printf("Triangle X area: %.4f%n", X.area());
		System.out.printf("Triangle Y area: %.4f%n", Y.area());
		
		Calculate calc = new Calculate();
		
		if (calc.comparingTheValueOf_X_And_Y(X.area(), Y.area()) == 1) 
		{			
			System.out.println("The X area is greater then Y area");			
		}
		else if (calc.comparingTheValueOf_X_And_Y(X.area(), Y.area()) == 2) 
		{			
			System.out.println("The areas have the same values");			
		}
		else {
			System.out.println("The Y area is greater then X area");	
		}
	}

}
