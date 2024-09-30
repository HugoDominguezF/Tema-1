package parte2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		double num;
		double resto;
		double numero;
		double numero2;
		double result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime dos numeros");
		numero = sc.nextDouble();
		numero2 = sc.nextDouble();
		
		resto = numero % numero2;
		num = numero2- resto;
		result = num==numero2 ? 0:num;
		
		System.out.println(numero + " necesita " + result + " para ser multiplo de " + numero2);
		
		sc.close();

	}

}
