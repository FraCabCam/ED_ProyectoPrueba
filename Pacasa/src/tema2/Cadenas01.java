package tema2;

public class Cadenas01{
	public static void main(String[] args) {
	
	String cadena =  "Francisco Javier Cabrera Camino.";
	
	String sinEspaciosFinalInicial = cadena.trim();
	
	String enMayusculas = cadena.toUpperCase();
	
	String enMinusculas = cadena.toLowerCase();
	
	String repetidaTresVeces = cadena.repeat(3);
	
	String desdeLaJotaEnAdelante = cadena.substring(9);

	String desdeLaErreHastalaJota = cadena.substring(1,9);
	
	String cambiandoLaJotaPorEquis = cadena.replaceAll("J", "X");
	
	


	}

}
