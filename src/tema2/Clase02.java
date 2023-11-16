package tema2;

import java.util.Scanner;

public class Clase02 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Dime tu edad");
	Integer edad = sc.nextInt();
	
	Boolean edadEsCero = edad == 0;
	if (!edadEsCero) {
		System.out.println("No es cero");
	}
	if (edad >= 18) {
		System.out.println("Eres mayor de edad");
	}
	else if (edad >= 12) { //si no se pone el else pregunta las dos cosas, el ese es para si se cumple una cosa y la otra al final sale lo de si es else 
		System.out.println("Eres adolescente");
	}
	else {
		System.out.println("Eres menor de edad");
	}
	sc.close();
	}
	
}
	
	


