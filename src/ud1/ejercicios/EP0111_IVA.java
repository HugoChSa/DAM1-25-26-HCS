package ud1.ejercicios;

/**
 * @author Hugo Ch
 */
import java.util.Scanner;

public class EP0111_IVA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la base imponible:");

        double baseImponible = sc.nextDouble();

        System.out.println("Introduzca el IVA que se debe aplicar: ");
        double IVA = sc.nextDouble();
        double calcularIVA = (baseImponible + IVA) / 1.21;

        sc.close();

        System.out.println("Importe correspondiente al iva: " + calcularIVA);
        System.out.println("Importe total: " + calcularIVA);

        // ????

    }
}
