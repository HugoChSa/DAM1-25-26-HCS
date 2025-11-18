package ud2.practicas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EstadisticaEstaturas {
    
    public static void main(String[] args) {
        int totalAlumnos = 0, alturaMasAlta = 0, alturaMasBaja = 1000;
        double mediaAltura = 0;
        int altura = 0;
        int sumaAlturas = 0;
        Scanner sc = new Scanner(System.in);


        while (altura >= 0) {
            try {

                System.out.println("Introduce la siguiente altura (en centímetros):");
                altura = sc.nextInt();
                if (altura >= 0) {

                    sumaAlturas += altura; 

                if (altura >= alturaMasAlta) {
                    alturaMasAlta = altura;
                }
                if (altura <= alturaMasBaja) {
                    alturaMasBaja = altura;
                }
                totalAlumnos++;
                
            }
        
            }
            catch (InputMismatchException error) {
                System.out.println("El carácter introducido no es numérico.");
            }

        }

        sc.close();
        
        mediaAltura  = (double) sumaAlturas / totalAlumnos; 

        System.out.println("El número total de alumnos es: " + totalAlumnos);
        System.out.println("La media de estatura es: " + mediaAltura);
        System.out.println("La altura más alta es: " + alturaMasAlta);
        System.out.println("La altura más baja es: " + alturaMasBaja);
    }
}
