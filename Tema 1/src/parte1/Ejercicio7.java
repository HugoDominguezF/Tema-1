package parte1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		String nombre;
		String direccion;
		String telefono;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime cual es tu nombre");
		
		nombre = sc.nextLine();
		
		System.out.println("Dime cual es tu direccion");
		
		direccion = sc.nextLine();
		
		System.out.println("Dime cual es tu telefono");
		
		telefono = sc.nextLine();
		
		System.out.println("Tus datos son:" );
		
		System.out.println("Nombre: " + nombre);
		
		System.out.println("Direccion: " + direccion );
		
		System.out.println("Telefono: " + telefono );
		
		sc.close();
	}

}
