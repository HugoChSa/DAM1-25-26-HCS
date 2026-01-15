package ud3.strings;

import java.util.Arrays;
import java.util.Scanner;

public class E0612_Anagramas {
    public static void main(String[] args) {
        System.out.print("Introduce una palabra: ");
        Scanner sc = new Scanner(System.in);
        String palabra1 = sc.nextLine();
        
        System.out.print("Introduce otra palabra: ");
        String palabra2 = sc.nextLine();
        
        
        System.out.println(sonAnagramas(palabra1, palabra2));
    }

    static boolean sonAnagramas(String palabra1, String palabra2) {
        palabra1.toLowerCase();
        palabra2.toLowerCase();
        /*if (sonAnagramas = false) {
            System.out.println(palabra1 + " y " + palabra2 + " NO son anagrámas.");
        } 
        if (sonAnagramas = true) {
            System.out.println(palabra1 + " y " + palabra2 + " SÍ son anagrámas.");
        }
                    if (Arrays.equals(letraPalabra1, letraPalabra1)) {
            return true;
                
        } else {
            return false;
        }        
       
*/
        if (palabra1.length() != palabra2.length() || palabra1 == palabra2)
            return false;
        
        char[] letraPalabra1 = palabra1.toCharArray();
        char[] letraPalabra2 = palabra2.toCharArray();
        Arrays.sort(letraPalabra1);
        Arrays.sort(letraPalabra2);
          
        return Arrays.equals(letraPalabra1, letraPalabra2);

    }
}
