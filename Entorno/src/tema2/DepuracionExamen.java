package tema2;



	import java.util.Scanner;

	public class DepuracionExamen {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa el primer numero: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Ingresa el segundo numero: ");
	        int numero2 = scanner.nextInt();

	        System.out.print("Ingresa el tercer numero: ");
	        int numero3 = scanner.nextInt();

	        if (numero1 < numero2 || numero1 < numero3) {
	            System.out.println("El primer n�mero no puede ser menor que los otros.");
	        } else {
	            if (numero1 % numero2 == 0) {
	                System.out.println(numero1 +" es multiplo de: " +numero2);
	            }
	            if (numero1 % numero3 == 0) {
	            	System.out.println(numero1 +" es multiplo de: " +numero3);
	            }
	        }

	        scanner.close();
	    }
	}


