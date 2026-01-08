package ud3.api.ejercicios.matrices;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class DiagonalesIguales {
    public static void main(String[] args) {

    }

    static boolean diagonalesIguales(int[][] t) {
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;

        for (int i = 0; i < t.length; i++) {
            sumaDiagonalPrincipal += t.length;
            for (int j = 0; j<t[i].length; j++) {
                sumaDiagonalSecundaria += t[i].length;
                System.out.print(sumaDiagonalPrincipal);
                //System.out.println(sumaDiagonalSecundaria);
                if (sumaDiagonalPrincipal == sumaDiagonalSecundaria) {
                    return true;
                    
                }
            }
        }

        return false;
    }



    int[][] t21 = {
            { 1, 2, 3 },
            { 1, 2, 3 },
            { 1, 2, 3 }
    };
    int[][] t22 = { { 1 } };
    int[][] t23 = {};
    int[][] t24 = null;
    int[][] t25 = {
            { 1, 2, 1 },
            { 1, 2, 3 },
            { 1, 2, 3 }
    };
    int[][] t26 = {
            { 1, 2, 3 },
            { 1, 2, 3 },
            { 1, 2, 3 },
            { 1, 2, 3 }
    };
    int[][] t27 = {
            { 1, 2, 3, 4 },
            { 1, 2, 3, 4 },
            { 1, 2, 3, 4 }
    };

    @Test
    public void testDiagonalesIgualesTrue() {
        assertTrue(diagonalesIguales(t21));
    }

    @Test
    public void testDiagonalesIgualesMatriz1() {
        assertTrue(diagonalesIguales(t22));
    }

    @Test
    public void testDiagonalesIgualesMatrizVacia() {
        assertFalse(diagonalesIguales(t23));
    }

    @Test
    public void testDiagonalesIgualesMatrizNull() {
        assertFalse(diagonalesIguales(t24));
    }

    @Test
    public void testDiagonalesIgualesFalse() {
        assertFalse(diagonalesIguales(t25));
    }

    @Test
    public void testDiagonalesIgualesVertical() {
        assertFalse(diagonalesIguales(t26));
    }
}
