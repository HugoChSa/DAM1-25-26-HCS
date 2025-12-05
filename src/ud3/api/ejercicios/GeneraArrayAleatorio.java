package ud3.api.ejercicios;

import java.util.Random;

public class GeneraArrayAleatorio {
    public static void main(String[] args) {
       int n[] = arrayAleatorio(10);

       for (int numero : n) {
        System.out.println(numero);
       }
    }

    static int[] arrayAleatorio(int n) {
        Random rnd = new Random();
        int array[] = new int[n];

        for (int i = 0; i<n; i++) {
            array[i] = rnd.nextInt(19) - 9;
        }
        return array;
            
    }
        
}
