package ud3.api.ejercicios.matrices;

import java.util.Arrays;
import java.util.Scanner;

public class EP0514_Sueldos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] sueldos = new double[0];

        System.out.print("Introduce un sueldo: ");
        double sueldo = sc.nextDouble();
        
        while (sueldo != -1) {
            //Añadir sueldo al Array
            sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);
            sueldos[sueldos.length -1] = sueldo;

            //Leer siguiente sueldo
            System.out.print("Introduce un sueldo: ");
            sueldo = sc.nextDouble();
            
        }
        Arrays.sort(sueldos);
        System.out.println();
        for (int i = sueldos.length -1; i >=0; i--) {
            System.out.println(sueldos[i] + " ");        
        }

        System.out.println("Máximo sueldo: " + sueldos[sueldos.length -1]);
        System.out.println("Mínimo sueldo: " + sueldos[0]);

        double suma = 0;
        for (double s : sueldos) {
            suma += s;
        }
        double media = suma / sueldos.length;
        System.out.println("Media de sueldos: " + media);

        int contSueldosMayoresMedia = 0;
        int contSueldosMenoresMedia = 0;
        for (double s : sueldos) {
            if (s > media) {
                contSueldosMayoresMedia++;
            } else if (s < media) {
                contSueldosMenoresMedia++;
            }
        }
        System.out.println("Número de sueldos por encima de la media: " + contSueldosMayoresMedia);
        System.out.println("Número de sueldos por debajo de la media: " + contSueldosMenoresMedia);
    }

     
}
