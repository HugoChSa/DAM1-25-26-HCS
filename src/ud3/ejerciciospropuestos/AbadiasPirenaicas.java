package ud3.ejerciciospropuestos;

import java.util.Arrays;

public class AbadiasPirenaicas {
    public static void main(String[] args) {

        int[] medidasCordillera = { 3000, 3500, 3200, 3400, 3200, -1 };

        System.out.println(getMontanasAbadias(medidasCordillera));

    }

    static int[] getMontanasAbadias(int[] MontanasCordillera) {
        
        
        int numAbadias = 0;
        int numMontañas = 0;
        int numMontanas = 0;
        int[] medidasCordillera = MontanasCordillera.clone() ;
        for (int i = 0; i < MontanasCordillera.length; i++) {
            while (numMontanas <= 1000 && i != -1) {
                medidasCordillera = new int[i];
                numMontanas++;
                int t = 0;
                if (t > i) {
                    
                }
                String t = Arrays.toString(medidasCordillera);
                
            }
        }

        //return medidasCordillera;
    }
}
