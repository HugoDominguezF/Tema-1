package parte1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

				String nombre;
				
				String edad;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("¿Como te llamas?");
				
				nombre = sc.nextLine();
				
				System.out.println("¿Y cuantos años tienes?");
				
				edad = sc.nextLine();
				
				System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
				
				sc.close();

	}

}
