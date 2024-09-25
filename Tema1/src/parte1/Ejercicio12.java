package parte1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		//declaramos las variables y abrimos el scanner
		double peras;
		double manzanas;
		
		Scanner sc = new Scanner(System.in);
		
		//preguntamos el valor de las peras y manzanas y las asignamos a las variables
		System.out.println("¿Cuantos kilos de peras quieres?");
		peras = sc.nextDouble();
		
		System.out.println("¿Y de manzanas?");
		manzanas = sc.nextDouble();
		
		//multiplicamos la cantidad de manzanas y peras por lo que valen y imprimimos la respuesta
		System.out.println("En total valen: " + (manzanas*2.35)+ " € las manzanas y " + (peras*1.95) + " € las peras, en total es: " + (manzanas*2.35+peras*1.95) + " €" );
		
		//cerramos el scanner
		sc.close();
	}
}