package parte1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
				
		// Declaramos las variables
		double euros;
				
		double pesetas;
				
				
		Scanner sc = new Scanner(System.in);
				
				
		System.out.println("Dime una cantidad de pesetas");
				
				
		pesetas = sc.nextDouble();
				
		euros = pesetas / 166;
				
		System.out.println("La cantidad de pesetas a euro es:");
				
		System.out.println(euros + " €");
				
				
		sc.close();

	}

}
