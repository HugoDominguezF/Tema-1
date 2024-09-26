package parte1;

import java.util.*;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		////declaramos las variables y abrimos el scanner
		boolean llueve;
		boolean tareas;
		boolean biblioteca;
		boolean aa;
		
		Scanner sc = new Scanner(System.in);
		
		//preguntamos si esta lloviendo, si ha hecho las tareas o si tiene que ir a la biblioteca
		System.out.println("¿Esta lloviendo?");
		llueve = sc.nextBoolean();
		
		System.out.println("¿Has hecho tus tareas?");
		tareas = sc.nextBoolean();
		
		System.out.println("¿Y tienes que ir a la biblioteca?");
		biblioteca = sc.nextBoolean();
		
		//si llueve o hay tareas declaramos que no puede salir a menos que tenga que ir a la biblioteca
		aa = llueve&&tareas || biblioteca;
		
		System.out.println(aa);
		
		//cerramos scanner
		sc.close();

	}

}
