package tema3;

public class Clase04 {

	public static void main(String[] args) {

		Integer[][] x = new Integer[4][3];

		for (int i = 0; i < x.length; i++) {
			Integer[] arrayInterior = x[i];
			for (int j = 0; j < arrayInterior.length; j++) {
				arrayInterior[j] = 1;
			}
		}

		for (int i = 0; i < x.length; i++) {
			Integer[] arrayInterior = x[i];
			for (int j = 0; j < arrayInterior.length; j++) {
				arrayInterior[j] = 1;
				System.out.print(arrayInterior[j]);

			}
			System.out.println();
		}
	}

}
