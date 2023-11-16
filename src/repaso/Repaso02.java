package repaso;

import java.util.Scanner;

public class Repaso02 {public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	
	System.out.println("Indique un numero a multiplicar: ");
	
	Long num1 = sc.nextLong();
	
	System.out.println("Ahora indique el otro numero: ");
	
	Long num2 = sc.nextLong();
	
	System.out.println("El resultado es: " + (num1 * num2));
	
	sc.close();
	
	
}

}
