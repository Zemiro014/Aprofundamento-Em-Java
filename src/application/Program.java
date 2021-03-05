package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	
	public static void  main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			System.out.println("Employe # " +i+" data: ");
			System.out.print("Common, Used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			System.out.println();
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();			
			if(ch == 'i') 
			{
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			else if (ch == 'u')
			{
				System.out.print("Manufacture date (DD/MM/yyyy): ");
				String manufactureDate = sc.next();
				list.add(new UsedProduct(name, price, new Date(manufactureDate)));
			}
			else 
			{
				list.add(new Product(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for(Product p : list) {
			System.out.println(p.priceTag());
		}
		sc.close();
	}

}
