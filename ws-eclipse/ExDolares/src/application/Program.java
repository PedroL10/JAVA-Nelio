package application;

import java.util.Locale;
import java.util.Scanner;
import util.conversor;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?");
		double dollar = sc.nextDouble();
		System.out.print("How many dollar to be bought?");
		double quantity = sc.nextDouble();
		
		double valorConvertido = conversor.calcCurrency(dollar, quantity);
		System.out.printf("Value to be paid: %.2f%n", valorConvertido);
		
		sc.close();

	}

}
