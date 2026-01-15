package ud3.strings;

import java.util.Random;
import java.util.Scanner;

public class E0614_Juego_Anagrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*
        //Si una persona introduce la palabra//
        
        System.out.print("Introduce una palabra: ");
        String palabraOriginal = sc.nextLine();
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        } 
        */
    
        String[] palabras = {"amor", "teclado", "programa", "instituto", "ciudad"};
        //Elige una palabra al azar y genera un anagrama
        Random rnd = new Random();
        String palabraOriginal = palabras[rnd.nextInt(palabras.length)];
        String anagrama = (generarAnagrama(palabraOriginal));

        
        System.out.println("Adivina la palabra oculta");
        System.out.println("Escribe la palabra oculta asociada a este anagrama \"" + anagrama + "\"");
        String palabraUsuario = sc.nextLine();
        while (!palabraOriginal.equals(palabraUsuario)) {
            System.out.println("Incorrecto, intántalo de nuevo.");
            palabraUsuario = sc.nextLine();
        }
        System.out.println("Enhorabuena has acertado!");
    }

    public static String generarAnagrama(String palabraOriginal) {
        char[] t = palabraOriginal.toCharArray();
        Random rnd = new Random();
        
        // Recorrer cada elemento
        for (int i = 0; i < t.length; i++) {
            // Genero una posición aleatoria
            int posRnd = rnd.nextInt(t.length);
            // Intercambio los valores de la posición actual y la aleatoria
            int aux = t[i];
            t[i] = t[posRnd];
            t[posRnd] = (char) aux;

        } String palabraModificada = String.valueOf(t);
        return palabraModificada;
    }
}
