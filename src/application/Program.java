package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.SavingsAccount;

public class Program {
	
	public static void  main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Polimorfismo: significa se beneficiar da mesma operação em variáveis do mesmo tipo e obter comportamentos diferentes.
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1020, "Alex", 1000.0, 0.01);
		
		// O método "withdraw possui várias formas  que lhe permite ter comportamentos variados
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		sc.close();
	}

}
