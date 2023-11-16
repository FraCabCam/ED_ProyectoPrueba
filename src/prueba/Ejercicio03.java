package prueba;

import java.util.Scanner;

public class Ejercicio03 {public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Cuántos años tienes?");
	Integer edad = scanner.nextInt();
	System.out.println("Su edad es de " + edad + " años.");
	scanner.close();
	
}

}
