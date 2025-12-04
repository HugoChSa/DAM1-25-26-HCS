package ud3.api;

import java.util.Arrays;

public class Primitiva {


    static int numAciertos(int[] apuesta, int[] ganadora){
        int contador=0; 
        for (int i=0; i< ganadora.length; i++ ){
        
            if (Arrays.binarySearch(ganadora, apuesta[i])>=0) {
                contador++;
            }
        }

        return contador;

    }
    public static void main(String[] args) {
        int[] apuesta= {1, 48, 30, 20, 5, 6};
        int[] tabla_ganadora= {1, 2, 6, 8, 5, 9};

        Arrays.sort(tabla_ganadora);
      
        int aciertos= numAciertos(apuesta, tabla_ganadora);

        System.out.println(aciertos); //3






        
    }


    
    
}
