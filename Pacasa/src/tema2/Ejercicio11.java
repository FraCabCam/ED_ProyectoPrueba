package tema2;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String email;
		
		String dominioEmail;

		do {

			System.out.println("Introduce tu email");

			email = sc.nextLine();
			
			Integer posicionArroba = email.indexOf("@");
			
			dominioEmail = email.substring(posicionArroba+1);
			
		if (!email.contains("@") || dominioEmail.endsWith(".") || dominioEmail.contains(".") || dominioEmail.startsWith("."));
		
			System.out.println("email inválido");

		}

		while (!email.contains("@") || dominioEmail.endsWith(".") || dominioEmail.contains(".") || dominioEmail.startsWith("."));

		sc.close();

	}
}
