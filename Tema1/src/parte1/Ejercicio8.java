package parte1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		//declaramos las variables y creamos el scanner
		String nombre;
		String edad;
		
		Scanner sc = new Scanner(System.in);
		
		//preguntamos al usuario como se llama y guardamos la respuesta
		System.out.println("¿Como te llamas?");
		nombre = sc.nextLine();
		
		//preguntamos al usuario la edad y guardamos la respuesta
		System.out.println("¿Y cuantos años tienes?");
		edad = sc.nextLine();
		
		//respondemos al usuario con la frase:
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		
		//cerramos el scanner
		sc.close();

	}

}
