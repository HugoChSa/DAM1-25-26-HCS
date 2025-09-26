package ejercicios;

import java.util.Scanner;

/**
 * @author Hugo Ch
 */

public class EP0155_Horas {
    public static void main(String[] args) {
        double segundos, minutos, horas;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce los segundos que se pasarán a horas: ");
        horas = sc.nextDouble();
        double segundosAHoras = horas / 3600;

        System.out.print("Introduce los minutos: ");
        minutos = sc.nextDouble();
        double segundosAMinutos = minutos / 60;

        System.out.print("Introduce los segundos: ");
        segundos = sc.nextDouble();

        sc.close();

        System.out.print("El resultado es: ");
        System.out.println(segundosAHoras + " horas, " + segundosAMinutos + " minutos y " + segundos + " segundos.");

        /*
         * System.out.print(horas + " son " + segundosAHoras + " horas ");
         * System.out.println(minutos + " son " + segundosAMinutos + " minutos ");
         */

    }
}
