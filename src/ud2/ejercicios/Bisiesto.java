package ud2.ejercicios;
/**
 * @author Hugo CS
 */
import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el año: ");
        int anho = sc.nextInt();
        sc.close();
        
        //boolean esBisiesto = (anho % 4 == 0 && anho % 100 != 0 && anho % 400 != 0) || (anho % 4 !=0 && anho % 100 == 0 && anho % 400 == 0);
        //anho % 4 == 0 || anho % 100 == 0 && anho % 400 == 0;

        boolean esBisiesto = anho % 400 == 0 || anho % 4 == 0 && anho % 100 != 0;

        if (esBisiesto) {
            System.out.println("El " + anho +" es un año bisiesto");
        } else {
            System.out.println("El " + anho + " NO es un año bisiesto");
        }


    }
    
}
