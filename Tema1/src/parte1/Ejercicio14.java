package parte1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		//declaramos las variables y abrimos el scanner
		double notas1;
		double notas2;
		double notas3;
		
		Scanner sc = new Scanner(System.in);
		
		//preguntamos al usuario cuales son las notas
		System.out.println("¿Cuales son tus notas?");
		
		notas1 = sc.nextDouble();
		notas2 = sc.nextDouble();
		notas3 = sc.nextDouble();
		
		//hacemos la media de las notas redondeando una
		System.out.println("La nota media es " + (int)(notas1+notas2+notas3)/3 + ", en el expediente academico sera " + (notas1+notas2+notas3)/3);
		
		//cerramos el scanner
		sc.close();

	}

}
