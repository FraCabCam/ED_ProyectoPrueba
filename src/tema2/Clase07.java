package tema2;

public class Clase07 {

	public static void main(String[] args) {

		// para ver si un número es par

		Integer x = 432;

		Integer resto = x % 2;

		// % modulo sirve para saber si 432 es múltiplo de 7 porque resto daría 0

		if (resto == 0) {

			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
	}
}
