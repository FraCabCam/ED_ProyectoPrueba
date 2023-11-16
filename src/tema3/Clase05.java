package tema3;

public class Clase05 {
	public static void main(String[] args) {
		
		String texto = "Estoy aqui aburrido mirando";
		
		String[] trozos = texto.split("a");
		
		for (int i = 0; i < trozos.length; i++) {
			
			System.out.println("En la posicion " + i + " tengo : " +  trozos[i]);
		}
	}

}
