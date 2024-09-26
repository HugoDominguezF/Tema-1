package parte1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// 1º Declaramos todas las variables que vamos a usar
		double nota2;
		
		double nota1;
		
		// 2º Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		// 3º Preguntamos la primera nota
		System.out.println("Dime la primera nota");
		
		// 4º Obtenemos el valor "nota1"
		nota1 = sc.nextDouble();
		
		// 5º Preguntamos la segunda nota
		System.out.println("Dime la segunda nota");
		
		// 6º Obtenemos el valor "nota2"
		nota2 = sc.nextDouble();
		
		// 7º Calculamos la mecia aritmetrica sumando ambas notas y dividiendolas entre la cantidad de notas que hay (2) y se la decimos al usuario
		System.out.println("Tu media aritmetica es " + ((nota1 + nota2) / 2));
		
		// 8º Cerramos el Scannner
		sc.close();

	}

}
