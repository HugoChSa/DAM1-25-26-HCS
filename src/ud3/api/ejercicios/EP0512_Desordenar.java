package ud3.api.ejercicios;

import java.util.Arrays;
import java.util.Random;

public class EP0512_Desordenar {
    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5};
        System.out.println("TABLA NORMAL: " + Arrays.toString( t));
        desordenar(t);
        System.out.println("TABLA DESORDENADA: " + Arrays.toString(t));
    }

    static void desordenar(int t[]) {
        Random rnd = new Random();
        //Generar posición aleatoria
        int posicionRnd = rnd.nextInt(t.length);
        
        //Recorrer cada elemento
        for (int i=0; i<t.length; i++) {
            //Intercambiar los valores de la posición actual y la aleatoria
            int aux = t[i];
            t[i] = t[posicionRnd];
            t[posicionRnd] = aux;    
        } 


    }
}
