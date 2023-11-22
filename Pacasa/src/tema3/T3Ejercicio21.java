package tema3;

public class T3Ejercicio21 {

	public static void main(String[] args) {

		Double array[] = new Double[] { 5.4, 3.1, 9.0, 4.7 };

		Double suma = 0.0;

		for (Double double1 : array) {

			System.out.print(" " + double1);
		}

		for (Double double1 : array) {

			suma += double1;

		}
		System.out.println();

		System.out.println("La suma de esos valores es " + suma);
	}

}
