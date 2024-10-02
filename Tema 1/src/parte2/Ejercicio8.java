package parte2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//declaramos las variables que vamos a utilizar para calcular la distancia recorrida
		double metros;
		double centimetros;
		
		Scanner sc = new Scanner(System.in);
		
		//le preguntamos al usuario cuantos metros ha recorrido, le pedimos el valor en metros
		System.out.println("¿Cuantos metros recorrio el lanzamiento?");
		metros= sc.nextDouble();	
		
		//pasamos el valor a centimetros
		centimetros= metros*100;
		
		//le decimos al usuario la cantidad expresada en centimetros y la truncamos
		System.out.println("La longitud en centimetros es: "+(int)centimetros);
		
		//cerramos scanner
		sc.close();

	}

}
