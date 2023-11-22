package prueba;

import java.util.Scanner;

public class Ejercicio07 {public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Indique su altura por favor: ");
	
	Double altura = scanner.nextDouble();
	
	System.out.println("Ahora indique su peso por favor:  ");
	
	Double peso = scanner.nextDouble();
	
	System.out.println("Su IMC es:  " + (peso / (altura * altura)));
	
	scanner.close();
	
	
	
}
}
