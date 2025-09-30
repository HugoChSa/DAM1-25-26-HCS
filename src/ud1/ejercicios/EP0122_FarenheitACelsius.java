package ud1.ejercicios;

/**
 * @author Hugo Ch
 */

import java.util.Scanner;

public class EP0122_FarenheitACelsius {
    public static void main(String[] args) {
        int celsius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce los grados celsius o centígrados: ");
        celsius = sc.nextInt();
        sc.close();
        int farenheit = celsius * (9 / 5) + 32;

        System.out.println(celsius + " ºC = " + farenheit + " ºF");
    }
}
