package ud3.api.ejercicios.matrices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CentroMatriz {
    public static void main(String[] args) {

    }

    static int centroMatriz(int[][] t) {

        int x=0, y=0; 
        @SuppressWarnings("unused")
        int matriz[][] = new int[x][y];

        @SuppressWarnings("unused")
        int centroMatriz;
        for (int i = 0; i<t.length; i++){
            for(int j = 0; j<t[i].length; j++){
                
            }
        }

        return 0;
    }

    @Test
    public void testCentroMatrizNula() {
        // Caso de matriz nula
        assertEquals(0, CentroMatriz.centroMatriz(null));
    }

    @Test
    public void testCentroMatrizVacía() {
        // Caso de matriz vacía
        assertEquals(0, CentroMatriz.centroMatriz(new int[][] {}));
    }

    @Test
    public void testCentroMatrizUno() {
        // Caso de matriz con elementos
        int[][] matriz1 = {
            {3}
        };
        assertEquals(3, CentroMatriz.centroMatriz(matriz1));
    }
}
