package parte2;

import java.util.Scanner;

public class Ejercicio4 {

public static void main(String[] args) {
		
		double x;
		double a;
		double b;
		double c;
		double y;
		
		Scanner sc = new Scanner(System.in);
		
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
		
		y = a*x*x+b*x+c;
		
		System.out.println("El resultado de la ecuacion es: " + y);
		
		sc.close();

	}

}
