package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);

	 System.out.println("Size of the array: ");
	 int n = sc.nextInt();
	 double [] vect = new double [n];
 	 
	 for (int i = 0; i < n; i++ ) {
		 System.out.print("Type the item: ");
		 vect[i] = sc.nextDouble();
	 }
	 System.out.print("VECT: [ ") ;
	 for ( int i  = 0 ; i < n; i++) {
	 System.out.print(+ vect[i] + ", ");
	 }
	 System.out.print(" ]");
	 
	 double sum =0.0;
	 for ( int i = 0; i< n; i++) {
		 sum += vect[i];
	 }
	 
	 double avg = sum /n;
	 
     System.out.println();
	 System.out.println("SUM: " + sum);
	 System.out.printf("AVERAGE: %.2f%n" , avg);
	 sc.close();
	}

}
