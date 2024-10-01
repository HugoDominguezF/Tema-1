package parte2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		
		int valor;
		int segundos;
		int minutos;
		int horas;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una cantidad en segundos");
		
		valor= sc.nextInt();
		
		horas= valor/3600;
		minutos= (valor%3600)/60;
		segundos= (valor%3600)%60;
		
		System.out.println("El resultado de la ecuacion es: "+horas+" horas "+minutos+" minutos "+segundos+ " segundos");
		
		sc.close();

	}

}
