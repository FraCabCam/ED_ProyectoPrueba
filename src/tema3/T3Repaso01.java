package tema3;

public class T3Repaso01 {
	public static void main(String[] args) {
		
		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
		
		Integer contador = 0;
		
		for (int i = 0; i < listaNotas.length; i++) {
			
			if (listaNotas[i] < 5) {
				
				contador++;
			}
			
			
		}
		
		for (int i = 0; i < listaNotas.length; i++) {
			
			
	}
		System.out.print("Total alumnos suspensos: " + contador);
	}

}
