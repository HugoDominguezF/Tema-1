package parte1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		final int IVA = 21;
		double precio;
		double total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un precio de un objeto");
		
		precio = sc.nextDouble();
		
		total = (precio*IVA)/100;
		System.out.println("Tu objeto vale " + (precio+total) + " € con IVA incluido");
		
		sc.close();

	}

}
