package parte1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		double numero1;
		double numero2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime dos numeros");
		
		numero1 = sc.nextDouble();
		
		numero2 = sc.nextDouble();
		
		System.out.println("Sus operaciones son" );
		
		System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
		
		System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
		
		System.out.println("Multiplicacion: " + numero1 + " * " + numero2 + " = " + (numero1 * numero2));
		
		System.out.println("Division: " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
		
		sc.close();
	}

}
