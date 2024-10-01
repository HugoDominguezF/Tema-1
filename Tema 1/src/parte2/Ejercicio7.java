package parte2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int etdadulto;
		int etdinfantil;
		final double INFANTIL = 15.15;
		final double ADULTO = 20;
		final double DESCUENTO = 5;
		double precio;
		double end;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantas entradas infantiles vas a comprar");
		etdinfantil= sc.nextInt();
		
		System.out.println("¿Y de adulto?");
		etdadulto= sc.nextInt();	

		precio= etdadulto*ADULTO+etdinfantil*INFANTIL;
		end = precio>=100 ? precio-precio*DESCUENTO/100:precio;
		
		System.out.println("El precio final sera: "+end);
			
		sc.close();

	}

}
