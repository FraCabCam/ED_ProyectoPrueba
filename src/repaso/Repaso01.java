package repaso;

import java.util.Scanner;

public class Repaso01 {public static void main(String[] args) {
	System.out.println("Indique el valor del radio ");
	
	Scanner sc = new Scanner(System.in);
	
	Double radio = sc.nextDouble();
	
	System.out.println("La circunferencia es: " + 2 * 3.14 * radio);
	System.out.println("Y el area es: " + 3.14 * (radio * radio));
    sc.close();
	
}

}
