package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Enter the name of the student");
		aluno.nome = sc.nextLine();
		System.out.println("Enter the grades of the student");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Final Grade: %.2f%n" , aluno.notaFinal());
		
		if (aluno.notaFinal() < 60.0 ) {
			System.out.println("You Failed!!!");
			System.out.printf("Missing %.2f Points%n", aluno.pontosQueFaltam());
		} else {
			System.out.println("Congratulations!!! You passed");
		}		
		
		sc.close();
	}

}
