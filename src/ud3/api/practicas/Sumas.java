package ud3.api.practicas;

import java.util.Arrays;

public class Sumas {
    public static void main(String[] args) {
        int[] tabla = {1, 3, -2, 5};
        System.out.println(Arrays.toString(sumas(tabla)));
        
    }

    public static int[] sumas(int t[]) {
        int ntabla[] = new int[3];
        int sumaTotal = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;


        for (int i = 0; i < t.length; i++) {
            sumaTotal += t[i];
        } ;

        for (int i = 0; i < t.length; i++) {
            if (t[i] > 0) {
               sumaPositivos += t[i]; 
            } else if (t[i] < 0) {
               sumaNegativos += t[i]; 
            }
        } 
        ntabla[1] = sumaTotal;
        
        ntabla[2] = sumaPositivos;
        
        ntabla[3] = sumaNegativos;
  

       
       return ntabla;

    }
    
}
