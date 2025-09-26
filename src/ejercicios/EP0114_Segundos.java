package ejercicios;

import java.util.Scanner;

/**
 * @author Hugo Ch
 */

public class EP0114_Segundos {
    public static void main(String[] args) {
        double segundos, minutos, horas;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce las horas: ");
        horas = sc.nextDouble();
        double horasASegundos = horas * 3600;

        System.out.print("Introduce los minutos: ");
        minutos = sc.nextDouble();
        double minutosASegundos = minutos * 60;

        System.out.print("Introduce los segundos: ");
        segundos = sc.nextDouble();
        double totalSegundos = (horasASegundos + minutosASegundos + segundos);

        sc.close();

        System.out.print(horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
        System.out.println(" son: " + totalSegundos + " segundos.");

    }
}
