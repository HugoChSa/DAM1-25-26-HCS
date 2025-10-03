package ejerciciospractica;

import java.util.Scanner;

public class evaluacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double puntos;

        double criterio1 = 0, criterio2 = 0, criterio3 = 0, criterio4 = 0, criterio5 = 0, criterio6 = 0;
    

        int opCriterio1 = 0, opCriterio2 = 0, opCriterio3 = 0, opCriterio4 = 0, opCriterio5 = 0, opCriterio6 = 0;

        System.out.println("Criterio 1 - ¿El programa funciona?");
        System.out.println("\t-(0) Si y funciona");
        System.out.println("\t-(1) Si pero no hace lo que debe");
        System.out.println("\t-(2) No funciona");
        opCriterio1 = sc.nextInt();

        criterio1 = (opCriterio1 == 0) ? 4.0
                    : (opCriterio1 == 1) ? 2.0
                    : 0.0;

        System.out.println("Criterio 2 - ¿El programa funciona y es eficiente?");
        System.out.println("\t-(0) Si");
        System.out.println("\t-(1) Regular");
        System.out.println("\t-(2) No");
        opCriterio2 = sc.nextInt();
        criterio2 = (opCriterio2 == 0) ? 1.0
                    : (opCriterio2 == 1) ? 0.5
                    : 0.0;

        System.out.println("Criterio 3 - ¿Usa estructuras y tipos de datos adecuados al problema?");
        System.out.println("\t-(0) Siempre");
        System.out.println("\t-(1) A veces");
        System.out.println("\t-(2) Nunca");
        opCriterio3 = sc.nextInt();
        criterio3 = (opCriterio3 == 0) ? 1.0
                    : (opCriterio3 == 1) ? 0.5
                    : 0.0;

        System.out.println("Criterio 4 - ¿Usa identificadores adecuados al problema?");
        System.out.println("\t-(0) Siempre");
        System.out.println("\t-(1) A veces");
        System.out.println("\t-(2) Nunca");
        opCriterio4 = sc.nextInt();
        criterio4 = (opCriterio4 == 0) ? 1.5
                    : (opCriterio4 == 1) ? 0.75
                    : 0.0;

        System.out.println("Criterio 5 - ¿El programa es legible?");
        System.out.println("\t-(0) Mucho");
        System.out.println("\t-(1) Regular");
        System.out.println("\t-(2) Poco");
        opCriterio5 = sc.nextInt();
        criterio5 = (opCriterio5 == 0) ? 1.5
                    : (opCriterio5 == 1) ? 0.75
                    : 0.0;

        System.out.println("Criterio 6 - ¿Presenta la información completa al usuario?");
        System.out.println("\t-(0) Sí");
        System.out.println("\t-(1) Regular");
        System.out.println("\t-(2) No");
        opCriterio6 = sc.nextInt();
        criterio6 = (opCriterio6 == 0) ? 1.0
                    : (opCriterio6 == 1) ? 0.5
                    : 0.0;

                    sc.close();

        puntos = criterio1 + criterio2 + criterio3 + criterio4 + criterio5 + criterio6;
    System.out.println("Puntuación final: " + puntos);
    
    
    }
}
