package ejercicios;

/**
 * @author Hugo Ch.
 */

import java.util.Scanner;

public class AreaTriangulo {
 public static void main(String[] args) {
    
    double base, altura;

    System.out.println("Introduce la longitud de la base: ");
    Scanner sc = new Scanner(System.in);
    base = sc.nextDouble();
    System.out.println("Introduce la altura: ");
    altura = sc.nextDouble();
    sc.close();

    double Area = (base * altura) / 2;

    System.out.println("El área es de: " + Area);

 }   
}
