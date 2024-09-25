package parte1;

import java.util.*;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		boolean llueve;
		
		boolean tareas;
		
		boolean biblioteca;
		
		boolean aa;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Esta lloviendo?");
		
		llueve = sc.nextBoolean();
		
		System.out.println("¿Has hecho tus tareas?");
		
		tareas = sc.nextBoolean();
		
		System.out.println("¿Y tienes que ir a la biblioteca?");
		
		biblioteca = sc.nextBoolean();
		
		aa = llueve&&tareas || biblioteca;
		
		System.out.println(aa);
		
		sc.close();

	}

}
