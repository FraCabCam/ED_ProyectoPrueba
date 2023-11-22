package tema3;

public class T3Ejercicio11 {

	public static void main(String[] args) {

		Integer array[][] = new Integer[5][10];
		Integer contador = 0;

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				
				contador++;
				array[i][j] = contador;
			}

		}

		for (int i = 0; i < array.length; i++) {
			Integer arrayDentro[] = array[i];

			for (int j = 0; j < arrayDentro.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
