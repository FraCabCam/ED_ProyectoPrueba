package repaso;

import java.util.Scanner;

public class Repaso04 {public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Indique su numero favorito ");
	Integer num = sc.nextInt();
	
	
	// El nextInt lee solo números si luego quieres que te diga algo escrito sigue en bucle buscando números. En ese caso se pone nextLine.
	// En plan no pongas Integer nombre = sc.nextInt(); si no va a haber respuesta a ello
	// Se llama limpiar buffet de entrada
	sc.nextLine();
	
	System.out.println("Ahora indique su ciudad favorita ");
	String ciudad = sc.nextLine();
	System.out.println(" Gracias, por lo que veo tu número favorito es " + num + " y tu ciudad favorita es " + ciudad );
	
	
	
	sc.close();
	
	
	
}

}
