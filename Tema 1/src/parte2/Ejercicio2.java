package parte2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//declaramos las variables y el scanner
		double num;
		double resto;
		double numero;
		double result;
		
		Scanner sc = new Scanner(System.in);
		
		//le pedimos al usuario un numero y lo asignamos
		System.out.println("Dime un numero y te dire cuanto te falta para que sea multiplo de siete");
		numero = sc.nextDouble();
		
		/*realizamos operaciones para calcular cuanto le falta al numero para llegar a ser multiplo de 7,
		  primero le hacemos el modulo para mas adelante restarle 7, esto se debe a que el resto que nos da es lo que
		  queda para que llegue al siete anterior (8-7=1, es decir que 7-1=6 que es lo que le queda a ocho para el siguiente
		  multiplo, luego hacemos una operacion ternaria para que no nos de 7 al acabar la formula,
		 */
		resto = numero % 7;
		num = 7- resto;
		result = num==7 ? 0:num;
		//imprimimos la respuesta y cerramos scanner
		
		System.out.println("Para que tu numero sea el proximo multiplo de siete necesita sumarle " + result);
		
		//cierro el scanner
		sc.close();

	}

}
