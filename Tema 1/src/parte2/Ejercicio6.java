package parte2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Declaramos las variables para calcular las medidas en centimetros 
		double mili;
		double centi;
		double metro;
		
		//abrimos el scanner para pbtener los valores escritos por el usuario
		Scanner sc = new Scanner(System.in);
		
		//le pedimos al usuario los tres valores para luego pasarlos a centimetros
		System.out.println("Escribe tres valores en milimetros, centimetros y metros");
		System.out.println("(el orden de numeros sera: milimetro, centimetro, metros)");		
		mili = sc.nextDouble();
		centi = sc.nextDouble();
		metro = sc.nextDouble();
		
		//le decimos al usuario a cantidad expresada en centimetros
		System.out.println("La suma de todo expresado en centimetros es: " + (centi+mili/10+metro*100) );
		
		//cerramos el scanner
		sc.close();

	}

}
