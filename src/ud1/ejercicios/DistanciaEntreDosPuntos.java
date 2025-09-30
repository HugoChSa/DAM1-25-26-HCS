package ud1.ejercicios;

/**
 * @author Hugo Ch.
 */
import java.util.Scanner;

public class DistanciaEntreDosPuntos {
    public static void main(String[] args) {

        double x1, x2, y1, y2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la X del primer punto: ");
        x1 = sc.nextDouble();
        System.out.print("Introduzca la Y del primer punto: ");
        y1 = sc.nextDouble();

        System.out.print("Introduzca la X del segundo punto: ");
        x2 = sc.nextDouble();
        System.out.print("Introduzca la Y del segundo punto: ");
        y2 = sc.nextDouble();

        sc.close();
        
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("La distancia entre los puntos " + x1 + "," + y1 + " y "
                + x2 + "," + y2 + " es: " + distancia);
    }
}
