package application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Order;
import entities.enums.OrdeStatus;

public class Program {
	
	public static void  main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Order order = new Order(1080, new Date(), OrdeStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrdeStatus os1 = OrdeStatus.DELIVERED;
		OrdeStatus os2 = OrdeStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		sc.close();
	}

}
