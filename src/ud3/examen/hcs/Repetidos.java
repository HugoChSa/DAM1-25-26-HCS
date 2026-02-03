package ud3.examen.hcs;

import java.util.Arrays;

/**
 * @Author Hugo Chan Saball
 */

public class Repetidos {
 
    public static void main(String[] args) {
        int[] t = {1, 3, 5, 3, 7, 4, 2, 8, 2, 4, 6, 2, 6};
    
        System.out.println("Tabla original: " + Arrays.toString(t));
        System.out.println("Números repetidos: " + repetidos(t));
    }

    static int[] repetidos(int t[]){
        int[] tabla = new int[t.length];
        tabla = Arrays.copyOf(t, t.length);
    
        
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                if (t[i] == tabla[j]) {
                    
                }
            }
        }

        return t;   //Arrays.sort(tabla);;
        
    }
    
}
