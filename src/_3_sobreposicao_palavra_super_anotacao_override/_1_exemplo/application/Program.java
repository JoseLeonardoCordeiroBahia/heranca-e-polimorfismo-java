package _3_sobreposicao_palavra_super_anotacao_override._1_exemplo.application;

import _3_sobreposicao_palavra_super_anotacao_override._1_exemplo.entities.Account;
import _3_sobreposicao_palavra_super_anotacao_override._1_exemplo.entities.BusinessAccount;
import _3_sobreposicao_palavra_super_anotacao_override._1_exemplo.entities.SavingsAccount;

public class Program {
	
	public static void main(String[] args) {
		System.out.println("Account1");
		Account account1 = new Account(1001, "Alex", 1000.0);
		account1.withdraw(200.0);
		System.out.println(account1.getBalance());
		
		System.out.println("-----------------------------------------------");
		System.out.println("Account2");
		Account account2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		account2.withdraw(200.0);
		System.out.println(account2.getBalance());
		
		System.out.println("-----------------------------------------------");
		System.out.println("Account3");
		Account account3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		account3.withdraw(200.0);
		System.out.println(account3.getBalance());
	}

}
