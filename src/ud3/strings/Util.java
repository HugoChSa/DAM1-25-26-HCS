package ud3.strings;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Util {

    
    public static String leerPassword() {
        Console cons = System.console();

        String passwd = new String(cons.readPassword());

        return passwd;
    }


    public static String invertirCadena(String str) {
        String cadenaInvertida = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            cadenaInvertida += str.charAt(i);
        }
        return cadenaInvertida;
    }    

    public static int contarEspacios(String cad1) {
        int n = cad1.length();
        String cad2 = cad1.replaceAll(" ", "");
        int n2 = cad2.length();
        return n - n2;
    }

    public static boolean esVocal(char ch) {
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";

        boolean esVocal = false;
        
        for (int i = 0; i < vocales.length(); i++) {
            if (ch == vocales.charAt(i))
                esVocal = true;
        }

        return esVocal;
    }

    public static String sinVocales(String cad) {
        String sinVocales = "";

        for (int i = 0; i < cad.length(); i++) {
            char caracter = cad.charAt(i);
            if(!esVocal(caracter))
                sinVocales += caracter;
        }

        return sinVocales;
    }
    

    /**
     * Crea un fichero de texto con el contenido de un String
     * 
     * @param str
     * @param filePath
     */
    public static void writeStringToFile(String str, String filePath) {
        try {
            // Creamos un objeto FileWriter que nos permitirá escribir en el fichero
            FileWriter writer = new FileWriter(filePath);
            // Escribimos el String en el fichero
            writer.write(str);
            // Cerramos el fichero
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Lee y carga el contenido de un fichero de texto a un String
     * 
     * @param filePath
     * @return
     */
    public static String readFileToString(String filePath) {
        StringBuilder fileContent = new StringBuilder();
        try {
            // Creamos un objeto FileReader que nos permitirá leer el fichero
            FileReader reader = new FileReader(filePath);
            // Creamos un buffer para leer el fichero de forma más eficiente
            BufferedReader buffer = new BufferedReader(reader);
            // Leemos el fichero línea a línea
            String line;
            while ((line = buffer.readLine()) != null) {
                // Vamos añadiendo cada línea al StringBuilder
                fileContent.append(line);
                // Añadimos un salto de línea al final de cada línea
                fileContent.append("\n");
            }
            // Cerramos el buffer y el fichero
            buffer.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("No existe el fichero.");
            // e.printStackTrace();
        }
        // Devolvemos el contenido del fichero como un String
        return fileContent.toString();
    }

}
