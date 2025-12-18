package ud3.api.ejercicios;

import java.util.Scanner;

public class Ajedrez {
    public static void main(String[] args) {
        char[][] tablero = inicializarTablero();
        boolean turnoBlancas = true;
        boolean fin = false;

        mostrarTableroConLeyenda(tablero);
        System.out.println(turnoBlancas ? "Turno de BLANCAS" : "Turno de NEGRAS");
        leerMovimiento();
        while (!fin) {
            //validarMovimiento
            //ejecutarMovimiento
            //comprobarJaqueOJaqueMate
            mostrarTableroConLeyenda(tablero);
            leerMovimiento();
        }

        //Mensaje final

        System.out.println("Fin de la partida.");
        
    }

    private static String leerMovimiento() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("¿Movimiento? Ejemplo \"e2 e4\": ");
        String entrada = sc.nextLine();
        entrada.charAt(0); // columnaOrigen  |  e
        entrada.charAt(1); // filaOrigen     |  2
        entrada.charAt(3); // columnaDestino |  e
        entrada.charAt(4); // filaDestino    |  4
        return null;
    }


    static char[][] inicializarTablero() {
        char[][] nuevoTablero = {
            {'t', 'c', 'a', 'd', 'r', 'a', 'c', 't'},
            {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},       
            {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {'T', 'C', 'A', 'D', 'R', 'A', 'C', 'T'}
        };
      
       return nuevoTablero;
    }

    static void mostrarTableroConLeyenda(char[][] t) {
        System.out.println();
        
        System.out.println("    A B C D E F G H ");
        System.out.println("   -----------------");
        for (int i = 0;  i < t.length; i++) {
            System.out.print(8 - i + " | ");
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j]);
                System.out.print(' ');
            }
            System.out.print("| " + (8 - i));
            System.out.println();
        }
        System.out.println("   -----------------");
        System.out.println("    a b c d e f g h ");
        System.out.println();
    }


    static void mostrarTablero(char[][] t) {
        for (int i=0; i< t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    static void mostrarTableroColoresCasillas(char[][] t) {
        for (int i = 0; i<t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if ((i + j) % 2 == 0)
                    t[i][j] = 'B';
                else 
                    t[i][j] = 'N';

            } 
        }
      
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        
    }

}
