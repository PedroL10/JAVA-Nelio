package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of taxpayers: ");
		int N = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for (int i = 1; i<= N; i++) {
			System.out.println("Taxpayer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				Double he = sc.nextDouble();
				Individual ind1 = new Individual(name, anualIncome, he);
				list.add(ind1);
			}
			else {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				Company comp1 = new Company(name, anualIncome, numberOfEmployees);
				list.add(comp1);
			}			
		}
		
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		for (TaxPayer tp : list) {			
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
		}		
		
		System.out.println();
		double sum = 0.0;
		for (TaxPayer tp : list) {
			sum += tp.tax();		
		}	
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();

	}

}
