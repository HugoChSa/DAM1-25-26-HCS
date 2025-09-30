package ud1.apuntes;

import java.util.Scanner;

public class LeerNumeroEntero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int NumEntero = sc.nextInt(); 
        
        sc.close();
        
        System.out.println("El número es: " + NumEntero);

    }
    
}
