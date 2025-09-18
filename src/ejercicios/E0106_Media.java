package ejercicios;

import java.util.Scanner;

public class E0106_Media {

    public static void main(String[] args) {
   

    System.out.println("Introduce 3 notas enteras");
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Primera nota: ");
    int nota1 = sc.nextInt();
    
    System.out.println("Segunda nota: ");
    int nota2 = sc.nextInt();
    
    System.out.println("Tercera nota: ");
    int nota3 = sc.nextInt();

    sc.close();

    double mediaAritmetica = (nota1+nota2+nota3)/3;


    System.out.println("La media aritmética es: " + mediaAritmetica);
    
    }

}
