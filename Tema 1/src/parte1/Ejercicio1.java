package parte1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// 1º Declaramos una variable
		double numero;
		
		// 2º Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		// 3º Le pedimos un numero al usuario
		System.out.println("Dime un numero");
		
		// 4º Obtenemos el numero y lo aplicamos a una variable
		numero = sc.nextDouble();
		
		// 5º Leemos el numero de la variable
		System.out.println("Tu numero es " + numero);
		
		// 6º Cerramos el Scanner
		sc.close();
	}

}