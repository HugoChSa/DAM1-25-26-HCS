package ud3.api;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class E0506_Primitiva {
    public static void main(String[] args) {

//        System.out.println(Arrays.toString(numAciertos(nul1, null)));


        System.out.print("Tabla Aleatoria: ");
        System.out.println(Arrays.toString(tablaAleatoria(1, 49, 6)));
    }

    static int numAciertos(int[] apuesta, int[] ganadora) {

        int[] tablaApuesta = new int[6];
    
        while (tablaApuesta.length < apuesta.length) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce la apuesta: ");
            int i=0;
            tablaApuesta[i] = sc.nextInt();
        }  tablaApuesta = apuesta;


        int[] tablaGanadora = new int[6];
        while (tablaGanadora.length < ganadora.length) {
            Random rndG = new Random();
            
            for (int i = 0; i<ganadora.length; i++) {
            tablaGanadora[i] = rndG.nextInt(1, 49);
        } tablaGanadora = ganadora;
        System.out.println("Ganadora: " + Arrays.toString(ganadora));
        System.out.println("Apuesta: " + Arrays.toString(apuesta));
        }
        
        

        return numAciertos(tablaApuesta, tablaGanadora);
      

       
    }
    
    static int[] tablaAleatoria(int numInicio, int numFin, int longitud) {
        Random rnd = new Random();
        int[] tabla = new int[longitud];
         for (int i = 0; i<longitud; i++) {
            tabla[i] = rnd.nextInt(1, 49);
        }
        Arrays.sort(tabla);
        return tabla; 
        
        
    }
}
