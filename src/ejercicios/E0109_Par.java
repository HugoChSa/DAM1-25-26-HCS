package ejercicios;

import java.util.Scanner;

/**
 * @author Hugo Ch.
 */

public class E0109_Par {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        int numero;
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        sc.close();
        boolean esPar = numero % 2 == 0;  


        System.out.print("El número " + numero + " es par? ");
        System.out.println(esPar);
    }    
}
