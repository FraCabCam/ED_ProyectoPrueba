package tema3;

public class Clase01 {

	public static void main(String[] args) {

		Integer tamaño = 6;

		Integer[] lista;

		lista = new Integer[tamaño];

		Integer[] lista2 = new Integer[8];

		Integer a = 3;

		lista[a] = 9; // el 9 lo mete en la posicion a

		lista[tamaño - 1] = 4;

		Integer x = lista[a];
		
		Integer tam = lista.length; // para preguntar que tamaño tiene

		for (int posicion = 0; posicion < tam; posicion++) {
			System.out.println(lista[posicion]);

		}

	}

}
