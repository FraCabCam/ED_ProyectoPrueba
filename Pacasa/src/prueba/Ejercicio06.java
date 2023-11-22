package prueba;

import java.util.Scanner;

public class Ejercicio06 {public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Indique el precio sin IVA: ");
	
	Double precioSinIva= scanner.nextDouble();
	
	Double iva = precioSinIva * 0.21;
	
	System.out.println("Iva del precio indicado es: " + iva);

	System.out.println("El precio indicado con IVA es: " + (iva + precioSinIva));
	
	
	
	scanner.close();
	
}

}
