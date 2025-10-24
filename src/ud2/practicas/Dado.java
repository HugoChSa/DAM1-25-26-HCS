package ud2.practicas;

import java.util.Random;

public class Dado {
    final static int NUM_LANZAMIENTOS = 1000000;

    public static void main(String[] args) {
        int totalLanzCara1 = 0, totalLanzCara2 = 0, totalLanzCara3 = 0, totalLanzCara4 = 0, totalLanzCara5 = 0, totalLanzCara6 = 0, 
        totalLanzamientos = 0;


        Random rnd = new Random();

        System.out.println("Lanzando un dado " + NUM_LANZAMIENTOS + " veces: ");
        

        for (int i = 0; i < NUM_LANZAMIENTOS; i++) {
            int resultadoDado = rnd.nextInt(6) + 1;
            if (resultadoDado == 1) totalLanzCara1++;
            if (resultadoDado == 2) totalLanzCara2++;
            if (resultadoDado == 3) totalLanzCara3++;
            if (resultadoDado == 4) totalLanzCara4++;
            if (resultadoDado == 5) totalLanzCara5++;
            if (resultadoDado == 6) totalLanzCara6++;

        }

        totalLanzamientos = totalLanzCara1 + totalLanzCara2 + totalLanzCara3 + totalLanzCara4 + totalLanzCara5 + totalLanzCara6;
        double porcentaje1 =  ((double) totalLanzCara1 / (double) totalLanzamientos) * 100.;
        double porcentaje2 =  ((double) totalLanzCara2 / (double) totalLanzamientos) * 100.;
        double porcentaje3 =  ((double) totalLanzCara3 / (double) totalLanzamientos) * 100.;
        double porcentaje4 =  ((double) totalLanzCara4 / (double) totalLanzamientos) * 100.;
        double porcentaje5 =  ((double) totalLanzCara5 / (double) totalLanzamientos) * 100.;
        double porcentaje6 =  ((double) totalLanzCara6 / (double) totalLanzamientos) * 100.;


        System.out.println("RESULTADOS:");
        System.out.println("Ha salido 1: " + totalLanzCara1 + " veces (" + String.format("%.2f", porcentaje1) + ")");
        System.out.println("Ha salido 2: " + totalLanzCara2 + " veces (" + String.format("%.2f", porcentaje2) + ")");
        System.out.println("Ha salido 3: " + totalLanzCara3 + " veces (" + String.format("%.2f", porcentaje3) + ")");
        System.out.println("Ha salido 4: " + totalLanzCara4 + " veces (" + String.format("%.2f", porcentaje4) + ")");
        System.out.println("Ha salido 5: " + totalLanzCara5 + " veces (" + String.format("%.2f", porcentaje5) + ")");
        System.out.println("Ha salido 6: " + totalLanzCara6 + " veces (" + String.format("%.2f", porcentaje6) + ")");



    }
    
}


/*
 * N_LANZAMIENTOS = 6;

totalLanzCara1 = 0;
totalLanzCara2 = 0;
totalLanzCaras = 0;

for ( i < N_LANZAMIENTOS ) {
     lanzarDado();
     if(dado == 2) totalLanzCara2++;
     .....
}

totalLanzamientos = totalLanzCara1 + 2 + ...
mostrarTotalCaras( totalLanzCara1, 2... )
mostrarPorcentajes()
 */
