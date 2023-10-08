package _2_upcasting_e_downcasting.exemplo.application;

import _2_upcasting_e_downcasting.exemplo.entities.Account;
import _2_upcasting_e_downcasting.exemplo.entities.BusinessAccount;
import _2_upcasting_e_downcasting.exemplo.entities.SavingsAccount;

public class Program {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Account account = new Account(1001, "Alex", 0.0);
		BusinessAccount businessAccount = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		Account account1 = businessAccount;
		Account account2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account account3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		BusinessAccount account4 = (BusinessAccount) account2;
		account4.loan(100.0);
		
		// BusinessAccount account5 = (BusinessAccount) account3;
		if (account3 instanceof BusinessAccount) {
			BusinessAccount account5 = (BusinessAccount) account3;
			account5.loan(200.0);
			
			System.out.println("Loan!");
		}
		
		if (account3 instanceof SavingsAccount) {
			SavingsAccount account5 = (SavingsAccount) account3;
			account5.updateBalance();
			
			System.out.println("Update!");
		}
	}
	
}
