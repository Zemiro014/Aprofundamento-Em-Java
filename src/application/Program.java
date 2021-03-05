package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	
	public static void  main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		// Account acc1 = new Account(1001, "Alex", 1000.0);// Não se pode instanciar uma class "Account" por ela ser "Abstract"		
		List <Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Maria", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Bob", 1000.0, 500.0));
		list.add(new SavingsAccount(1003, "Alex", 300.0, 0.01));
		list.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for(Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n",sum);
		
		for(Account acc : list) {
			acc.deposit(10.0);
		}
		
		for(Account acc : list) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
		
		sc.close();
	}

}
