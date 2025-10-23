package ud2.ejercicios;

/**
 * @author Hugo CS
 */

import java.util.Scanner;

public class E0401 {
    public static void main(String[] args) {
        //System.out.println("Introduce el número de veces que se repetirá el mensaje: ");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        eco(n);
    }

    static void eco(int n) {
       
        for (int i = 0; i < n; i++) {
            System.out.println("Eco...");

        }

        
    }

}
