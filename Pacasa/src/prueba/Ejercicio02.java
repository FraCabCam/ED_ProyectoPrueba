package prueba;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Indique su usuario por favor ");
		
		String usuario = scanner.nextLine();
		
		System.out.println("Bienvenido/a " + usuario + ", De dónde eres?");
		
		String donde = scanner.nextLine();
		
		System.out.println("Qué tal se vive en " + donde + "?");
		
		scanner.nextLine();
		
		System.out.println("Gracias por responder " + usuario + ", Un saludo");
		
		scanner.close();
	}

}
