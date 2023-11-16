package repaso;

import java.util.Scanner;

public class Repaso03 {public static void main(String[] args) {
	Scanner  sc =new Scanner(System.in);
	
	System.out.println("Indique un numero a multiplicar: ");
	
	String num1 = sc.nextLine();

	
	System.out.println("Ahora indique el otro numero: ");
	
	String num2 = sc.nextLine();
	
	Long num1Long = Long.parseLong(num1);
	
	Long num2Long = Long.parseLong(num2);
	
	Long resultado = num1Long * num2Long;
	
	
	System.out.println("El resultado es: " + resultado);
	
	sc.close();
	
	
	
	
	
	
	
	
}

}
