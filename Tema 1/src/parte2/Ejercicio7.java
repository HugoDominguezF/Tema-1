package parte2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//declaramos todas las multiples variables y contantes que vamos a utilizar para calcular el precio de las entradas
		int etdadulto;
		int etdinfantil;
		final double INFANTIL = 15.15;
		final double ADULTO = 20;
		final double DESCUENTO = 5;
		double precio;
		double end;
		
		Scanner sc = new Scanner(System.in);
		
		//preguntamos al usuario la cantidad de entradas infantiles y de adulto que va a comprar
		System.out.println("Cuantas entradas infantiles vas a comprar");
		etdinfantil= sc.nextInt();
		System.out.println("¿Y de adulto?");
		etdadulto= sc.nextInt();
		
		//calculamos el precio de las entradas haciendo uso de las constantes que equivalen al precio
		precio= etdadulto*ADULTO+etdinfantil*INFANTIL;
		end = precio>=100 ? precio-precio*DESCUENTO/100:precio;
		
		//le decimos al usuario el precio final
		System.out.println("El precio final sera: "+end);
		
		//cerramos scanner
		sc.close();

	}

}
