package parte1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		double peras;
		
		double manzanas;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("¿Cuantos kilos de peras quieres?");
		
		
		peras = sc.nextDouble();
		
		System.out.println("¿Y de manzanas?");
		
		manzanas = sc.nextDouble();
		
		System.out.println("En total valen: " + (manzanas*2.35)+ " € las manzanas y " + (peras*1.95) + " € las peras, en total es: " + (manzanas*2.35+peras*1.95) + " €" );
		
		
		sc.close();
	}
}