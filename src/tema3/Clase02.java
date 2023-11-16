package tema3;

import java.util.Iterator;

public class Clase02 {
	
	public static void main(String[] args) {
		
		String[] palabras = new String[3];
		
		palabras[0] = "fran";
		palabras[1] = "guapo";
		
		String x = palabras[0];
		
		for (int i = 0; i < palabras.length; i++) {
			String string = palabras[i];
			System.out.println(string);
			
		}
		Integer[] numeros = new Integer[3]; 
		for (int i = 0; i < palabras.length; i++) {
			numeros[i] = 1 + 1;
		}
		
		String[] engendro = new String[3];
		for (int i = 0; i < engendro.length; i++) {
			engendro[i] = palabras[i] + " " + numeros[i];
		}
		
		for (int i = 0; i < engendro.length; i++) {
			System.out.println(engendro[i]);
			
		}
	}
	

}
