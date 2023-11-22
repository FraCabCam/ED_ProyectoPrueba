package prueba;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¿Cuánto te gustaría ganar al año? ");
		
		Integer num = scanner.nextInt();
		
		System.out.println("En ese caso tu salario mensual seria de: " + (num / 12) + " euros.");
		
		scanner.close();

	}

}
