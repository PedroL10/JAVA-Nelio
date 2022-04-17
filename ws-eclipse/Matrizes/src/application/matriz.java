package application;

import java.util.Locale;
import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas linhas?");		
		int m = sc.nextInt();
		
		System.out.println("Quantas colunas? ");
		int n = sc.nextInt();
		
		int [][] mat = new int [m][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		
	
			
		System.out.println("Escolha um numero da matriz");
		int escolhido = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (escolhido == mat[i][j]) {
					System.out.println("Position " + i + ", " + j + ":");
					if(j > 0) System.out.println("Left: " + mat[i][j-1]);
					if(i > 0)System.out.println("Up: " + mat[i-1][j]);
					if(j < mat[i].length -1) System.out.println("Right: " + mat[i][j+1]);
					if(i < mat.length -1 )System.out.println("Down: " + mat[i+1][j]);
					
				} 
			}
		}
		
	
		sc.close();	

}

}