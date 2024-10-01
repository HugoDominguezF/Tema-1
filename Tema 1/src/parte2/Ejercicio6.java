package parte2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Declaramos las variables para calcular 
		double mili;
		double centi;
		double metro;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tres valores en milimetros, centimetros y metros");
		System.out.println("(el orden de numeros sera: milimetro, centimetro, metros)");
		
		mili = sc.nextDouble();
		centi = sc.nextDouble();
		metro = sc.nextDouble();
		
		
		System.out.println("La suma de todo expresado en centimetros es: " + (centi+mili/10+metro*100) );
		
		sc.close();

	}

}
