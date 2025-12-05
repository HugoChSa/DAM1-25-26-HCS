package ud3.api.ejercicios;

import java.util.Arrays;


public class E0508 {
    public static void main(String[] args) {
        int[] tabla = {1, 2, 3};
        
        System.out.print("Tabla: ");
        System.out.println(Arrays.toString(tabla));
        System.out.println("----------------");

        System.out.print("Tabla Par: ");
        System.out.println(Arrays.toString(getPares(tabla)));
        
        System.out.print("Tabla Impar: ");
        System.out.println(Arrays.toString(getImpares(tabla)));

    }

    public static int[] getPares(int t[]) {
        int[] tablaPar = new int[0];
        for (int i=0; i<t.length; i++) {
            if (t[i] % 2 == 0) {
                tablaPar = Arrays.copyOf(tablaPar, tablaPar.length +1);
                tablaPar[tablaPar.length-1] = t[i];        
            }
        }return tablaPar;
        
   
    }
    
    public static int[] getImpares(int t[]) {
        int[] tablaImpar = new int[0]; 
        for (int i=0; i<t.length; i++) {
            if (t[i] % 2 != 0) {
                tablaImpar = Arrays.copyOf(tablaImpar, tablaImpar.length+1);
                tablaImpar[tablaImpar.length-1] = t[i];
            }
        }
        return tablaImpar;
        
    }

}

