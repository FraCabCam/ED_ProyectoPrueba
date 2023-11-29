package prueba;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

    private static final int FILAS = 10;
    private static final int COLUMNAS = 10;
    private static final int MINAS = 20;

    private char[][] tableroVisible;
    private char[][] tableroReal;
    private boolean gameOver;

    public Buscaminas() {
        tableroVisible = new char[FILAS][COLUMNAS];
        tableroReal = new char[FILAS][COLUMNAS];
        gameOver = false;
        inicializarTablero();
        colocarMinas();
    }

    private void inicializarTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tableroVisible[i][j] = '-';
                tableroReal[i][j] = ' ';
            }
        }
    }

    private void colocarMinas() {
        Random random = new Random();
        int minasColocadas = 0;

        while (minasColocadas < MINAS) {
            int fila = random.nextInt(FILAS);
            int columna = random.nextInt(COLUMNAS);

            if (tableroReal[fila][columna] != '*') {
                tableroReal[fila][columna] = '*';
                minasColocadas++;
            }
        }
    }

    private void mostrarTablero(char[][] tablero) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void revelarCasilla(int fila, int columna) {
        if (fila >= 0 && fila < FILAS && columna >= 0 && columna < COLUMNAS
                && tableroVisible[fila][columna] == '-') {
            int minasCercanas = contarMinasCercanas(fila, columna);
            tableroVisible[fila][columna] = (char) (minasCercanas + '0');

            if (minasCercanas == 0) {
                revelarCasilla(fila - 1, columna - 1);
                revelarCasilla(fila - 1, columna);
                revelarCasilla(fila - 1, columna + 1);
                revelarCasilla(fila, columna - 1);
                revelarCasilla(fila, columna + 1);
                revelarCasilla(fila + 1, columna - 1);
                revelarCasilla(fila + 1, columna);
                revelarCasilla(fila + 1, columna + 1);
            }
        }
    }

    private int contarMinasCercanas(int fila, int columna) {
        int minasCercanas = 0;

        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                if (i >= 0 && i < FILAS && j >= 0 && j < COLUMNAS && tableroReal[i][j] == '*') {
                    minasCercanas++;
                }
            }
        }

        return minasCercanas;
    }

    private boolean haGanado() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (tableroVisible[i][j] == '-' && tableroReal[i][j] != '*') {
                    return false;
                }
            }
        }
        return true;
    }

    private void jugar() {
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            System.out.println("Tablero:");
            mostrarTablero(tableroVisible);

            System.out.print("Fila: ");
            int fila = scanner.nextInt();
            System.out.print("Columna: ");
            int columna = scanner.nextInt();

            if (tableroReal[fila][columna] == '*') {
                gameOver = true;
                System.out.println("¡Has perdido!");
                mostrarTablero(tableroReal);
            } else {
                revelarCasilla(fila, columna);

                if (haGanado()) {
                    gameOver = true;
                    System.out.println("¡Has ganado!");
                    mostrarTablero(tableroReal);
                }
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Buscaminas juego = new Buscaminas();
        juego.jugar();
    }
}


