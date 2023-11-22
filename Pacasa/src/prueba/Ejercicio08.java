package prueba;

import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Indique un numero:  ");

		String a = scanner.nextLine();

		System.out.println("Indique un numero decimal:  ");

		Double b = scanner.nextDouble();

		System.out.println("Indique otro numero entero:  ");

		Float c = scanner.nextFloat();

		Long x1 = Long.parseLong(a);

		String x2 = b.toString();

		Integer x3 = b.intValue();

		Long x4 = c.longValue();

		System.out.println(x1);
		
		System.out.println(x2);
		
		System.out.println(x3);
		
		System.out.println(x4);
		
		scanner.close();

	}

}
