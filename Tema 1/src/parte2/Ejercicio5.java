package parte2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//declaramos el valor de las variables de tiempo para calcular las horas, minutos, segundos
		int valor;
		int segundos;
		int minutos;
		int horas;
		
		//abrimos el scanner para leer lo que el usuario pone
		Scanner sc = new Scanner(System.in);
		
		//le pedimos al usuario que nos de un valor de segundos para transformarlos a horas y minutos
		System.out.println("Escribe una cantidad en segundos");
		valor= sc.nextInt();
		
		//calculamos las horas y minutos utilizando el operador modulo
		horas= valor/3600;
		minutos= (valor%3600)/60;
		segundos= (valor%3600)%60;
		
		//le decimos al usuario cuanto equivale la cantidad de segundos a horas y minutos
		System.out.println("El resultado de la ecuacion es: "+horas+" horas "+minutos+" minutos "+segundos+ " segundos");
		
		
		//cerramos el scanner
		sc.close();

	}

}
