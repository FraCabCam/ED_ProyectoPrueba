package tema2;

public class Clase01 {public static void main(String[] args) {
	 Integer x = 25;
	 Integer y = 20;
	 Integer z = 30;
	 
	 Boolean menorQueAmbos = x < y && x < z;    // && es pal y todo tiene que ser cierto
	 Boolean menorQueAlguno = x < y || x < z;   // || es par or, alguno de los dos tiene que ser cierto
	 
	 System.out.println(menorQueAmbos);
	 System.out.println(menorQueAlguno);
}

}
