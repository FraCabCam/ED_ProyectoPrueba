package tema3;

import java.util.Scanner;

public class Ejercicio16 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una palabra");

		String palabra = sc.nextLine();
		
		String palabraInvertida[] = palabra.split("");
		
		
		for (int i = 0; i < palabraInvertida.length; i++) {
			
		}
		
		for (int i = palabraInvertida.length; i > 0; i--) {
			
			System.out.println(palabraInvertida[i -1]);
			
		}
	}

}
