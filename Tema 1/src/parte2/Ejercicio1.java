package parte2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		 //declaramos las variables para redondear un numero y abrimos el scanner para leer el texto
		double numero;
		
		Scanner sc = new Scanner(System.in);
		
		//le pedimos un numero al usuario
		System.out.println("Dime un numero y lo redondeare");
		numero = sc.nextDouble();
		
		//redondeamos el numero utilizando el (int) delante
		System.out.println("Tu numero redondeado es " + (int)(numero+0.5));
		
		//cerramos scanner
		sc.close();
	}

}
