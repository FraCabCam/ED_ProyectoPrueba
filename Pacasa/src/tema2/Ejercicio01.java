package tema2;

import java.util.Scanner;

public class Ejercicio01 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Indique su año de nacimiento");
	
	Integer edad = sc.nextInt();
	
	if (edad >= 1928 && edad <= 1945) {
		System.out.println(" Perteneceres a la Generación silenciosa");
		}
	else if (edad >= 1946 && edad <=1964) {
		System.out.println("Ok Boomer");
		
	}
	else if (edad >= 1965 && edad <=1980) {
		System.out.println("Perteneces a la Generación X");
	}
	
	else if (edad >= 1981 && edad <=1996) {
		System.out.println("Perteneces a la Generación Y o Milennial");
	}
	
	else if (edad >= 1997 && edad <= 2012) {
		System.out.println("Perteneces a la Generación Z o Zoomer");
	}
	
	else if (edad >= 2010 && edad <= 2023) {
		System.out.println("Perteneces a la Gneración Alfa");
	}
	
	else if (edad <= 1900) {
		System.out.println("No me engañes tu estás muerto");
	}
	else if (edad >= 2024) {
		System.out.println("Pero si tu todavia no has nacido crack.");
	}
	sc.close();
	
}

}
