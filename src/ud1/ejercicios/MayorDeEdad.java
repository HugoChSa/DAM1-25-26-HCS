package ud1.ejercicios;

import java.util.Scanner;

public class MayorDeEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();
        
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();

        System.out.print("Te llamas " + nombre);
        System.out.println(" y tienes " + edad + " años.");
        
        boolean MayorDeEdad;
        MayorDeEdad = edad >=18;
        System.out.println("¿Eres mayor de edad? " + MayorDeEdad);
    
        sc.close();

    }
    
}
