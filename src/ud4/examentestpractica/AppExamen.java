package ud4.examentestpractica;

import java.util.Scanner;

public class AppExamen {
    public static void main(String[] args) {

        Examen examenUD2 = new Examen("TEST UD2 - Programación");
        
        Pregunta[] preguntas = Pregunta.cargarFichero("DATOS - PreguntasTest.tsv");

        for (int i = 0; i < preguntas.length; i++) {
            examenUD2.addPregunta(preguntas[i]);
        }

        System.out.println(examenUD2);

        // Pedir respuestas al usuario
        Scanner sc = new Scanner(System.in);
        String respuestasUsuario;
        System.out.println("Introduce tus respuestas, separadas por un espacio");
        respuestasUsuario = sc.nextLine();
        System.out.println(respuestasUsuario);

        for (int i = 0; i < preguntas.length; i++) {
            
        }

        // Corregir y dar nota

        sc.close();
        System.out.println("FIN");
    }
}
