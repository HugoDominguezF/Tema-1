package parte1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// 1º Declaramos una variable
		double numero;
		
		// 2º Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		// 3º Le pedimos la edad al usuario
		System.out.println("Dime tu edad");
		
		// 4º Obtenemos el numero y lo aplicamos a una variable
		numero = sc.nextDouble();
		
		// 5º Leemos el numero de la variable sumandole uno al resultado
		System.out.println("El proximo año tendras " + (numero + 1));
		
		// 6º Cerramos el Scanner
		sc.close();
			}
	}
