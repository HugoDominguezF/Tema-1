package parte2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//declaramos variables que seran los dos numeros pedidos al usuario y el resto de la division entre ellos, abrimos el scanner
		double num;
		double resto;
		double numero;
		double numero2;
		double result;
		
		Scanner sc = new Scanner(System.in);
		
		//le pedimos los numeros al usuario y realizamos la operacion mencionada, luego calculamos el numero que le falta a num1 
		System.out.println("Dime dos numeros");
		numero = sc.nextDouble();
		numero2 = sc.nextDouble();
		
		resto = numero % numero2;
		num = numero2- resto;
		result = num==numero2 ? 0:num;
		
		//mostramos el resultado
		System.out.println(numero + " necesita " + result + " para ser multiplo de " + numero2);
		
		//cerramos el scanner
		sc.close();

	}

}
