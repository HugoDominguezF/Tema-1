package parte1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// 1º Declaramos todas la variable que vamos a usar
		double radio;
		
		// 2º Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		// 3º Preguntamos el calor de el radio de la circunferencia
		System.out.println("Dime un numero que sirva como radio de una circunfenceria y te dire la longitud y el area");
		
		// 4º Establecemos el valor del radio
		radio = sc.nextDouble();
		
		// 5º calculamos la longitud y el area utilizando Math.PI para obtener el valor pi
		System.out.println("La longitud de ese circulo es " + (radio*2*Math.PI)+" y el area es " + (radio*radio*Math.PI));
		
		// 6º Cerramos el Scanner
		sc.close();
		
		
	}

}
