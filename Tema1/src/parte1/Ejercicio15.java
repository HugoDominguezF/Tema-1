package parte1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		//declaramos las variables y abrimos el scanner
		final int IVA = 21;
		double precio;
		double total;
		
		Scanner sc = new Scanner(System.in);
		
		//preguntamos el precio inicial
		System.out.println("Dime un precio de un objeto");
		precio = sc.nextDouble();
		
		//creamos una variable que obtendra el porcentaje que es el IVA
		total = (precio*IVA)/100;

		//le damos el valor al usuario del objeto con el IVA
		System.out.println("Tu objeto vale " + (precio+total) + " € con IVA incluido");
		
		//cerramos scanner
		sc.close();
		
	}

}
