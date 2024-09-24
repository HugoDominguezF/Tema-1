package parte1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		boolean par;
		
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero y te dire si es par");
		
		numero = sc.nextInt();
		
		par= (numero % 2 == 0);
		
		System.out.println(par);
		
		sc.close();

	}

}
