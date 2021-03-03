package application;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrdeStatus;

public class Program {
	
	public static void  main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p;
		OrderItem item;
		Order ord;
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String cli_name = sc.nextLine();
		System.out.print("Email: ");
		String cli_email = sc.nextLine();
		System.out.print("Birth date (DD/MM/yyyy): ");
		String cli_birthDate = sc.nextLine();
		Client cli = new Client(cli_name, cli_email, new Date(cli_birthDate));
		
		System.out.println();
		System.out.println("Enter order data: ");		
		System.out.print("Status: ");
		String status =  sc.next();		
		ord = new Order(1080, cli, OrdeStatus.valueOf(status), new Date("20/04/2018 11:25:09"));
		System.out.print("How many items to this order?: ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i = 1; i <= n; i++)
		{
			System.out.println("Enter # "+i+" item data:");
			System.out.print("Product Name: ");
			String prod_name = sc.next();
			System.out.print("Product price: ");
			double prod_price = sc.nextDouble();
			System.out.print("Product quantity: ");
			int quantity = sc.nextInt();
			p = new Product(prod_name, prod_price);
			item = new OrderItem(quantity, p);		
			ord.addItem(item);
		}		
		System.out.print(ord);
		
		sc.close();
	}

}
