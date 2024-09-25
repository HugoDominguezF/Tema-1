package parte1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// 1º Declaramos todas las variables que vamos a usar
		int epoca_actual;
		
		int nacimiento;
		
		// 2º Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		// 3º Preguntamos el año de nacimiento
		System.out.println("Dime en que año naciste");
		
		// 4º Obtenemos el valor "nacimiento"
		nacimiento = sc.nextInt();
		
		// 5º Preguntamos ahora el año actual
		System.out.println("Ahora dime en que año estamos actualmente");
		
		// 6º Obtenemos el valo "epoca_actual"
		epoca_actual = sc.nextInt();
		
		// 7º Calculamos la edad del usuario restando el año actual con el año de nacimiento, obteniendo su edad
		System.out.println("Entonces tendras "+(epoca_actual - nacimiento)+" años");
		
		// 8º Cerramos el Scanner
		sc.close();
	}

}
