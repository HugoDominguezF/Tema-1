package parte1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
				
		//declaramos las variables y abrimos el scanner
		double euros;
		double pesetas;
			
		Scanner sc = new Scanner(System.in);
				
		//le pedimos un valor al usuario y asignamos el valor a pesetas
		System.out.println("Dime una cantidad de pesetas");
		pesetas = sc.nextDouble();
		
		//hacemos la confersion de pesetas a euro
		euros = pesetas / 166;
				
		//respondemos la cantidad de euros que equivalen las pesetas
		System.out.println("La cantidad de pesetas a euro es:");
		System.out.println(euros + " €");
				
		//cerramos el scanner
		sc.close();

	}

}
