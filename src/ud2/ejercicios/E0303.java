package ud2.ejercicios;

/**
 * @author Hugo Chan
 */

import java.util.Random;
import java.util.Scanner;

public class E0303 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int numAleatorio = rnd.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        int n = 0;

        System.out.println(numAleatorio);

        System.out.println("Intenta averiguar el número secreto entre 1 y 100. (Para rendirte introduce -1).");

        while (n != numAleatorio && n != -1) {
            System.out.print("Número: ");
            n = sc.nextInt();

            if (n > numAleatorio && n != -1) {
                System.out.println("El número es menor.");

            }
            if (n < numAleatorio && n != -1) {
                System.out.println("El número es mayor.");
            } 
            if (n > 100 || n < -1) {
                System.out.println("El número introducido esta fuera del rango.");
                
            }
        }
        if (n == -1) {
            System.out.println("Te has rendido. El número era: " + numAleatorio);

        } else
            System.out.println("¡Has acertado!");

        sc.close();
    }
}
