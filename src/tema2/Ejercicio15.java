package tema2;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número.");

		Integer numero = sc.nextInt();
		
		Integer contador = 0;
		
		while (contador <= 10) {
			System.out.println(numero + " x " + contador + " = " + numero*contador);
			contador++;
		}
	sc.close();	
	}
}
