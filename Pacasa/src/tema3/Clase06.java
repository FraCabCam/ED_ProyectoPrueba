package tema3;

public class Clase06 {
	public static void main(String[] args) {
		
		String texto = "Estoy aqui aburrido mirando";
		
		Integer[] numeros = new Integer[5];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = 1*2;
		}
		Integer suma = 0;
		
		
		for (Integer x : numeros) {
			
			
			suma = suma + x;
			
		}
			System.out.println(suma);
			
			
	
	}
}
