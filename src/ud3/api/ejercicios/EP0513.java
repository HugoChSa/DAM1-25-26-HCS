package ud3.api.ejercicios;

import java.util.Arrays;
import java.util.Random;

public class EP0513 {
    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5};
        System.out.println("TABLA NORMAL: " + Arrays.toString( t));
        copiaDesordenada(t);
        System.out.println("TABLA DESORDENADA: " + Arrays.toString(t));
    }

   

static int[] copiaDesordenada(int[] tOrdenada){
        int[] t = tOrdenada.clone();
        Random rnd = new Random();
        // Recorrer cada elemento
        for (int i = 0; i < t.length; i++) {
            // Genero una posición aleatoria
            int posRnd = rnd.nextInt(t.length);
            // Intercambio los valores de la posición actual y la aleatoria
            int aux = t[i];
            t[i] = t[posRnd];
            t[posRnd] = aux;
        }         
        return t;
        
    }
}
