package ud1.ejercicios;

import java.util.Scanner;

/**
 * @author Hugo Ch
 */

public class EP0121_CelsiusAFarenheit {
    public static void main(String[] args) {
        int farenheit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce los grados celsius o centígrados: ");
        farenheit = sc.nextInt();
        sc.close();
        int celsius = (9 / 5) * (farenheit - 32);

        System.out.println(farenheit + " ºF = " + celsius + " ºC");
    }
}
