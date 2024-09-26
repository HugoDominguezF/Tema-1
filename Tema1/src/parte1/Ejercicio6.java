package parte1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//declaramos las variables
		double numero1;
		double numero2;
		
		//creamos un scanner
		Scanner sc = new Scanner(System.in);
		
		//Preguntamos al usuario por dos numeros y guardamos los valores
		System.out.println("Dime dos numeros");
		
		numero1 = sc.nextDouble();
		numero2 = sc.nextDouble();
		
		//ahora mostramos en distintas lineas el resultado de la suma/resta/multiplicacion/division de los dos numeros operando
		System.out.println("Sus operaciones son" );
		System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
		System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
		System.out.println("Multiplicacion: " + numero1 + " * " + numero2 + " = " + (numero1 * numero2));
		System.out.println("Division: " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
		
		//cerramos scanner
		sc.close();
	}

}
