package prueba;

import java.util.Scanner;

public class Ejercicio04 {public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Indique su año de nacimiento: ");
	
	Integer año = scanner.nextInt();
	
	System.out.println("Su edad es " +  (2023 - año) + " años");
	
	scanner.close();
}

}
