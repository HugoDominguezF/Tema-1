package parte1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		double notas1;
		
		double notas2;
		
		double notas3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuanta nota tienes en el primer trimestre?");
		
		notas1 = sc.nextDouble();
		
		System.out.println("¿Cuanta nota tienes en el segundo trimestre?");
		
		notas2 = sc.nextDouble();
	
		System.out.println("¿Cuanta nota tienes en el tercer trimestre?");
		
		notas3 = sc.nextDouble();
		
		System.out.println("La nota media es " + (int)(notas1+notas2+notas3)/3 + ", en el expediente academico sera " + (notas1+notas2+notas3)/3);
		
		sc.close();

	}

}
