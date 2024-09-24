package parte1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		boolean mayor;
		
		int edad;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuantos años tienes?");
		
		edad = sc.nextInt();
		
		mayor= (edad >= 18);
		
		System.out.println(mayor);
		
		sc.close();

	}

}
