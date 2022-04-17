package util;

public class conversor {	
	
	public static final double IOF = 6.0;
			
			
	public static double calcCurrency(double dollar, double quantity) {
		double valor = dollar * quantity;
		return valor += valor * IOF/100;
	}
}

