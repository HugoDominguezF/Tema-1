package parte1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//declaramos las variables y abrimos el scanner
		String nombre;
		String direccion;
		String telefono;
		
		Scanner sc = new Scanner(System.in);
		
		//preguntamos cual es el nombre del usuario y recopilamos el dato, lo mismo con la direccion y el telefono
		System.out.println("Dime cual es tu nombre");
		nombre = sc.nextLine();
		
		System.out.println("Dime cual es tu direccion");
		direccion = sc.nextLine();
		
		System.out.println("Dime cual es tu telefono");
		telefono = sc.nextLine();
		
		//indicamos en distintas lineas los datos proporcionados
		System.out.println("Tus datos son:" );
		System.out.println("Nombre: " + nombre);
		System.out.println("Direccion: " + direccion );
		System.out.println("Telefono: " + telefono );
		
		//cerramos scanner
		sc.close();
	}

}
