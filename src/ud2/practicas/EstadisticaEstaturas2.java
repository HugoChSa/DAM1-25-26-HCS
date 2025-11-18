package ud2.practicas;

import java.util.ArrayList;
import java.util.Scanner;

public class EstadisticaEstaturas2 {
    public static void main(String[] args) {
    
        ArrayList<Integer> alturas = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        int altura = 0;
        int alturasEnTotal = 0;

        while (altura >= 0) {

            altura = sc.nextInt();
            if (altura > 0) {
                alturasEnTotal += altura;
                alturas.add(altura);
                
            } 
        }

        int mayor = 0;
        int menor = 1000;

        for (int i = 0; i < alturas.size(); i++) {
            int numActual = alturas.get(i);
            if (numActual > mayor) {
                mayor = numActual;
                
            }
            if (numActual < menor) {
                menor = numActual;
                
            }
        }

    
        int totalAlumnos = alturas.size();
        int media = alturasEnTotal / alturas.size();
        System.out.println("Total alumnos: " + totalAlumnos);
        System.out.println("Media altura: " + media + " cm");
        System.out.println("Altura más alta: " + mayor + " cm");
        System.out.println("Altura más baja: " + menor + " cm");

        sc.close();

    }
}
