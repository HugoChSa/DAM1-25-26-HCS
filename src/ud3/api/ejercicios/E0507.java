package ud3.api.ejercicios;

import java.util.Arrays;

public class E0507 {
    
    public static void main(String[] args) {
        int tabla[] = {1, 2, 3, 2, 3, 4};
        int tabla_sin_repetidos[] = sinRepetidos(tabla);
        System.out.println(Arrays.toString(tabla_sin_repetidos));
        
    }

    static int[] sinRepetidos(int t[]) {
        int[] tabla_auxiliar = new int[1];
        for (int i = 0; i < t.length; i++) {
            if (buscar(tabla_auxiliar, t[i]) == false) {
                tabla_auxiliar = Arrays.copyOf(tabla_auxiliar, tabla_auxiliar.length + 1);
                tabla_auxiliar[t.length-1]=t[i];
            }
        }
        return tabla_auxiliar;
        
    }

    static boolean buscar(int t[], int clave) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                return true;                
            }
        } return false;
    }


}
