package ud1.ejercicios;

import java.util.Scanner;

/**
 * @authos Hugo Ch.
 */
public class EcuacionGrado2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Valor de a = " );
        int a = sc.nextInt();
        
        System.out.print("Valor de b = ");
        int b = sc.nextInt();
        
        System.out.print("Valor de c = ");
        int c = sc.nextInt();
        sc.close();

        double sqrt = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        
        double x1 = (-b + sqrt) / (2 * a);
        double x2 = (-b - sqrt) / (2 * a);

        String resultado = Double.isNaN(sqrt) ? "No existe solución" : "x1= " + x1 + " x2= " + x2 ;
        System.out.println(resultado);
    }
}
