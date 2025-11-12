package ud2.practicas;

import java.util.Scanner;

public class EncuestaCursosEspecializacion {
    public static void main(String[] args) {
        int totalRespuestasPr1 = 0, totalRespuestasPr2 = 0, totalRespuestasPr3 = 0;

        int totalRespuestasPr1_Op1 = 0, totalRespuestasPr1_Op2 = 0;
        int totalRespuestasPr2_Op1 = 0, totalRespuestasPr2_Op2 = 0, totalRespuestasPr2_Op3 = 0;
        int totalRespuestasPr3_Op1 = 0, totalRespuestasPr3_Op2 = 0, totalRespuestasPr3_Op3 = 0;

        int totalAlumnos = 0;

        boolean respondeOtroAlumno = true;
        Scanner sc = new Scanner(System.in);

        while (respondeOtroAlumno) {
            totalAlumnos++;

            System.out.println("Encuesta ciclos.");
            
            int respuesta1 = 0, respuesta2 = 0, respuesta3 = 0;
            //Pregunta 1
            System.out.println("Al acabar el ciclo estarías interesado en seguir formandote en el colegio haciendo un curso de especialización?");
            System.out.println("(1 -> Sí) | (2 -> No)");
            while (respuesta1 != 1 && respuesta1 != 2) {
                respuesta1 = sc.nextInt();
                if (respuesta1 != 1 && respuesta1 != 2) {
                    System.out.println("Opción incorrecta, vuelve a introducir la respuesta.");
                }
            } 
            totalRespuestasPr1++;

            
            if (respuesta1 == 1) {
                totalRespuestasPr1_Op1++;
                //Pregunta 2
                System.out.println("¿Cual de los siguientes ciclos te gustaría que el centro ofreciese?");
                System.out.println("1. Ciberseguridade en contornos das tecnoloxías da información\r\n" + "2. Desenvolvemento de videoxogos e realidade virtual\r\n" + "3. Intelixencia artificial e big data");

                while (respuesta2 != 1 && respuesta2 != 2 && respuesta2 != 3) {
                    respuesta2 = sc.nextInt();
                    if (respuesta2 != 1 && respuesta2 != 2 && respuesta2 != 3) {
                        System.out.println("Opción incorrecta, vuelve a introducir la respuesta.");
                    }
                } 
                switch (respuesta2) {
                    case 1:
                        totalRespuestasPr2_Op1++;
                        break;
                    case 2:
                    totalRespuestasPr2_Op2++;
                        break;
                    case 3:
                    totalRespuestasPr2_Op3++;
                        break;
                }


                totalRespuestasPr2++;
        
        
                //Pregunta 3
                System.out.println("¿Preferirías que el horario fuese de mañana, tarde o no te importa?");
                System.out.println("1. Horario de mañana\r\n" + "2. Horario de tarde\r\n" + "3. Indiferente");

                while (respuesta3 != 1 && respuesta3 != 2 && respuesta3 != 3) {
                    respuesta3 = sc.nextInt();
                    if (respuesta3 != 1 && respuesta3 != 2 && respuesta3 != 3) {
                        System.out.println("Opción incorrecta, vuelve a introducir la respuesta.");
                    }
                }
                 
                switch (respuesta3) {
                    case 1:
                        totalRespuestasPr3_Op1++;
                        break;
                    case 2:
                    totalRespuestasPr3_Op2++;
                        break;
                    case 3:
                    totalRespuestasPr3_Op3++;
                        break;
                }

                totalRespuestasPr3++;
            } 
            else totalRespuestasPr1_Op2++;
        




            System.out.println("¿Quiere continuar otro alumno?");
            System.out.println("(1 -> Sí) | (Cualquier otro número -> No)");
            int aux = sc.nextInt();
            if (aux != 1) {
                respondeOtroAlumno = false;
            }
            
        }   
        sc.close();
    
        double porcentajePr1_Op1 = 0, porcentajePr1_Op2 = 0;
        double porcentajePr2_Op1 = 0, porcentajePr2_Op2 = 0, porcentajePr2_Op3 = 0;
        double porcentajePr3_Op1 = 0, porcentajePr3_Op2 = 0, porcentajePr3_Op3 = 0;
        
        //P1
        porcentajePr1_Op1 = (double) ( (double) totalRespuestasPr1_Op1 / (double) totalRespuestasPr1) * 100.0;
        porcentajePr1_Op2 = (double) ( (double) totalRespuestasPr1_Op2 / (double) totalRespuestasPr1) * 100.0;


        //P2
        porcentajePr2_Op1 = (double) ((double) totalRespuestasPr2_Op1 / (double) totalRespuestasPr1_Op1) * 100.0;
        porcentajePr2_Op2 = (double) ((double) totalRespuestasPr2_Op2 / (double) totalRespuestasPr1_Op1) * 100.0;
        porcentajePr2_Op3 = (double) ((double) totalRespuestasPr2_Op3 / (double) totalRespuestasPr1_Op1) * 100.0;

        //P3
        porcentajePr3_Op1 = (double) ((double) totalRespuestasPr3_Op1 / (double) totalRespuestasPr1_Op1) * 100.0;
        porcentajePr3_Op2 = (double) ((double) totalRespuestasPr3_Op2 / (double) totalRespuestasPr1_Op1) * 100.0;
        porcentajePr3_Op3 = (double) ((double) totalRespuestasPr3_Op3 / (double) totalRespuestasPr1_Op1) * 100.0;

        System.out.println(totalAlumnos + " alumnos han hecho la encuesta.");
        System.out.println("La pregunta 1 ha sido contestada por: " + totalRespuestasPr1);
        System.out.println("La pregunta 2 ha sido contestada por: " + totalRespuestasPr2);
        System.out.println("La pregunta 3 ha sido contestada por: " + totalRespuestasPr3);

        System.out.println("PORCENTAJES:");
        //P1
        System.out.println("P1 R1: " + porcentajePr1_Op1);
        System.out.println("P1 R2: " + porcentajePr1_Op2);
    
        //P2
        System.out.println("P2 R1: " + porcentajePr2_Op1);
        System.out.println("P2 R2: " + porcentajePr2_Op2);
        System.out.println("P2 R3: " + porcentajePr2_Op3);
        
        //P3
        System.out.println("P3 R1: " + porcentajePr3_Op1);
        System.out.println("P3 R2: " + porcentajePr3_Op2);
        System.out.println("P3 R3: " + porcentajePr3_Op3);
    }
}
