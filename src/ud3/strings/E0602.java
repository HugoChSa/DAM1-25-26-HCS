package ud3.strings;

import java.util.Scanner;

public class E0602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase1;
        System.out.println("Introduce la primera frase: ");
        frase1 = sc.nextLine();

        System.out.println("Introduce la segunda frase: ");
        String frase2 = sc.nextLine();

        int longitudF1 = frase1.length();
        int longitudF2 = frase2.length();

        if (longitudF1 > longitudF2) {
            System.out.println("La frase más corta es la frase 2");
            //System.out.println(frase2);    
            System.out.println("Número de caracteres: " + longitudF2);
        } 
        if (longitudF1 < longitudF2) {
            System.out.println("La frase más corta es la frase 1");
            //System.out.println(frase1);
            System.out.println("Número de caracteres: " + longitudF1);
        } 
        else if (longitudF1 == longitudF2) {
            System.out.println("Las 2 frases tienen la misma cantidad de caracteres");
            System.out.println("Número de caracteres: ");
            System.out.println("Frase 1: " + longitudF1 + " Frase 2: " + longitudF2);
        }
        
    }
}
