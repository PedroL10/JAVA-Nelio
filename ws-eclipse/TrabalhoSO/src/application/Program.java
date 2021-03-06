package application;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pedido;

public class Program {

	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] pedidos = new String[10];		
  		
		pedidos[0] = "James Sandero; 13; 15";
		pedidos[1] = "Jean Green; 72; 0";
		pedidos[2] = ("Hank McCurtis; 37; 22");
		pedidos[3] = ("Scoot Winters; 29; 0");
		pedidos[4] = ("James Sandero; 22; 25");
		pedidos[5] = ("Pep Bandolero; 14; 10");
		pedidos[6] = ("Draco Veio; 72; 0");
		pedidos[7] = ("Kaio Comce; 11; 5");
		pedidos[8] = ("Givanildo Paraiba; 7; 1");
		pedidos[9] = ("Luizito; 35; 25");
		
		for (int i = 0; i< pedidos.length; i++) {
			String[] listaOrganizada = pedidos[i].split(";");
			System.out.println(listaOrganizada);
		}	
		
		sc.close();
	}
}
