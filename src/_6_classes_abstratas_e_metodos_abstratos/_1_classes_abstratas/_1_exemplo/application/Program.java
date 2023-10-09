package _6_classes_abstratas_e_metodos_abstratos._1_classes_abstratas._1_exemplo.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import _6_classes_abstratas_e_metodos_abstratos._1_classes_abstratas._1_exemplo.entities.Account;
import _6_classes_abstratas_e_metodos_abstratos._1_classes_abstratas._1_exemplo.entities.BusinessAccount;
import _6_classes_abstratas_e_metodos_abstratos._1_classes_abstratas._1_exemplo.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Account> accounts = new ArrayList<>();
		
		accounts.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		accounts.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
		accounts.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
		accounts.add(new BusinessAccount(1004, "Anna", 500.00, 500.00));
		
		double sum = 0.0;
		
		for (Account account : accounts) {
			sum += account.getBalance();
		}
		
		System.out.printf("Total balance: %.2f\n", sum);
		
		for (Account account : accounts) {
			account.deposit(10.00);
		}
		
		for (Account account : accounts) {
			System.out.printf("Updated balance for account %d: %.2f\n", 
					account.getNumber(),account.getBalance());
		}
	}
	
}
