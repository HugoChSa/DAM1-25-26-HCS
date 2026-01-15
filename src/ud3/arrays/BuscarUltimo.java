package ud3.arrays;

import java.util.Arrays;
import java.util.Random;

public class BuscarUltimo {
    public static void main(String[] args) {
        System.out.println("ARRAY: " + Arrays.toString(arrayAleatorio()));
        Arrays.sort(arrayAleatorio());
        System.out.println("       [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] <- POSICIONES");
        //System.out.println("La ultima posición de la clave es: " + buscar(, 1));
    }

     public static int[] arrayAleatorio(){
        int longitud=10; 
        int[] array= new int[longitud];
        Random random= new Random();

       
        for(int i=0; i<longitud; i++){
            array[i]= random.nextInt(1, 10);
        }
        return array; 
    }


    static int buscar(int t[], int clave) {
        for (int i=0; i<t.length; i++) {
            if (t[i] == clave) {
                return i;
            }
        }
        return -1;
    }
}
