package parte1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		//declaramos las variables
		boolean mayor;
		int edad;
		
		//creamos un scanner
		Scanner sc = new Scanner(System.in);
		
		//preguntamos al usuario el valor de su edad y recojemos el valor
		System.out.println("¿Cuantos años tienes?");
		
		edad = sc.nextInt();
		
		//ponemos un diferenciador que nos indicara si tiene mas de 18 años o igual true, si tiene menos false
		mayor= (edad >= 18);
		
		//le indicamos al usuario si es verdad que es mayor de edad
		System.out.println(mayor);
		
		//cerramos el scanner
		sc.close();

	}

}
