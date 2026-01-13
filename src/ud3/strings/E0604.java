package ud3.strings;

import java.util.Scanner;

public class E0604 {
    public static void main(String[] args) {
        String cad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        cad = sc.nextLine();
        sc.close();
        System.out.println("El número de espacios en blanco es de: " + contarEspacios(cad));

    }

    static int contarEspacios (String cad) {
        int n = cad.length();
        String cad2 = cad.replaceAll(" ", " ");
        int n2 = cad2.length();
        int espacios = n - n2;
        
        return espacios;
        
    }

}
