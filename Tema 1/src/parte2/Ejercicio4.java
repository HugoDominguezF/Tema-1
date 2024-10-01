package parte2;

import java.util.Scanner;

public class Ejercicio4 {

public static void main(String[] args) {
		
		//declaramos las variables pertenecientes a la ecuacion
		double x;
		double a;
		double b;
		double c;
		double y;
		
		Scanner sc = new Scanner(System.in);
		
		//le pedimos al usuario que cite el valor de las tres incognitas y las vamos mostrando poco a poco
		System.out.println("Escribe cuatro valores para la siguiente ecuacion= y=ax^2+bx+c");
		System.out.println("(el orden de numeros sera: a,b,c,x)");
		a = sc.nextDouble();
		System.out.println("a= "+a);
		b = sc.nextDouble();
		System.out.println("b= "+b);
		c = sc.nextDouble();
		System.out.println("c= "+c);
		x = sc.nextDouble();
		System.out.println("x= "+x);
		
		//calculamos la ecuacion
		y = a*x*x+b*x+c;
		
		//enseñamos el resultado al usuario
		System.out.println("El resultado de la ecuacion es: " + y);
		
		//cerramos el scanner
		sc.close();

	}

}
