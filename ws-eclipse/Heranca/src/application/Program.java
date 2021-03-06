package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		///UPCASTING -----------------		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		// --------------------
		
		//DOWNCASTING -----------------
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount) acc3; DownCasting n?o pode ser feito com classes irm?s
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);		
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		
		Account acc10 = new Account(1010, "Pedro", 1000.00);
		acc10.withdraw(200.00);
		System.out.println(acc10.getBalance());
		
		
		Account acc11 = new SavingsAccount(1011, "Pedro", 1000.00, 0.01);
		acc11.withdraw(200.00);
		System.out.println(acc11.getBalance());
		
		Account acc15 = new BusinessAccount(1012, "Loretinha", 1000.00, 500.0);
		acc15.withdraw(200.00);
		System.out.println(acc15.getBalance());
	}

}











