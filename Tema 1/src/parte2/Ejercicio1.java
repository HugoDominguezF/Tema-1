package parte2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		 //declaramos las variables y el scanner
		double numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero y lo redondeare");
		numero = sc.nextDouble();
		
		System.out.println("Tu numero redondeado es " + (int)(numero+0.5));
		
		sc.close();
	}

}
