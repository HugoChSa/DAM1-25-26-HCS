package ud1.apuntes;

import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        System.out.println("Introduce un número: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();
        double raiz = Math.sqrt(numero);  

        System.out.println("La raíz cuadrada de " + numero + " es igual a " + raiz);
    }
}
