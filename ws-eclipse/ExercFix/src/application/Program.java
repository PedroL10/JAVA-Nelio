package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.println();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit? (y/n): ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter the value of the deposit: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(name, number, initialDeposit);
		}
		else {
			account = new Account(name, number);
		}		
		
		System.out.println();
		System.out.print("Account data: ");
		System.out.print(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withDraw(withdrawValue);
		
		System.out.println("Udpdated account data: ");
		System.out.println(account);		
		
		sc.close();
	}

}
