package ud3.api.ejercicios;

import java.util.Arrays;
import java.util.Random;

public class E0505 {
    public static void main(String[] args) {
        System.out.println(rellenaPares(2, 3));
    }

    static int[] rellenaPares(int longitud, int fin) {
        Random rnd = new Random();
        int[] tabla = new int[longitud];
        
        for (int i = 0; i<longitud; i++) {
            int num;
            do {
                num = rnd.nextInt(fin - 1) + 2;
            } while (num % 2 != 0);
            tabla[i] = num;
        }
        Arrays.sort(tabla);
        return tabla; 
    }
}
