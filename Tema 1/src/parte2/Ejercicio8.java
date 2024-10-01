package parte2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		double metros;
		double centimetros;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuantos metros recorrio el lanzamiento?");
		metros= sc.nextDouble();	
		
		centimetros= metros*100;
		
		System.out.println("La longitud en centimetros es: "+(int)centimetros);
			
		sc.close();

	}

}
