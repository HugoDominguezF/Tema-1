package parte1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//declaramos las variables y abrimos el scanner
		boolean par;
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		//le pedimos un numero al usuario y guardamos el valor
		System.out.println("Dime un numero y te dire si es par");
		numero = sc.nextInt();
		
		//comprobamos mediante un modulo si el numero es par o impar
		par= (numero % 2 == 0);
		
		//respondemos si es par el numero
		System.out.println(par);
		
		//cerramos el scanner
		sc.close();

	}

}
