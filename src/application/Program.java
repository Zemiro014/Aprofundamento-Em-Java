package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	
	public static void  main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc = new  Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING: Instanciar uma "SubClass" a uma variável do tipo "SuperClass"
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 1000.0, 0.01);
		
		// DOWNCASTING: é o inverso do "UPCASTING": Instanciar uma "Superclass" a uma variável do tipo "SubClass"; Para funcionar o DOWNCASTING, precisa-se esforçar o compilador		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// acc3 é um "SavingsAccount" e não um "BusinessAccount" logo vai dar um erro na hora de execução: Como ss prevenir destes erros? Verificar se acc3 é um "BusinessAccount" usando "instanceOf"		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan !");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;			
			acc5.updateBalance();
			System.out.println("Update !");
		}
		
		sc.close();
	}

}
