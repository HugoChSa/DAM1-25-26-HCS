package ud2.ejercicios;

import ud2.Util;

public class EP0211 {
    public static void main(String[] args) {
        
        System.out.print("Introduce un número (entero) de 3 o 4 cífras para saber si es capicúa: ");

        int n = Util.leerInt();
/* 
        int unidades = n % 10;
        int decenas;
        int centenas = n / 100;
        int udMillar;


        boolean esCapicua3U = unidades == centenas;

        System.out.println(esCapicua3U ? "Es capicúa." : "NO es capicúa.");
*/
        
        int unidades = n % 10;
        int decenas = n / 10 % 10;
        int centenas = n / 100 % 10;
        int udMillar = n / 1000;
        boolean esCapicua4U = unidades == udMillar && centenas == decenas;
        System.out.println(esCapicua4U ? "Es capicúa." : "NO es capicúa.");
        


       


        
    }
    
}
