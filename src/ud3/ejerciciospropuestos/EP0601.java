package ud3.ejerciciospropuestos;

import java.util.Scanner;

public class EP0601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Introduce una sentencia de entrada y el programa eliminará los comentarios: ");
        String frase = sc.nextLine();*/
        String codigo = "if (a==3) /* igual a tres */ a++; /* incrementamos a */";
        System.out.println(eliminaComentarios(codigo));
        
        //System.out.println("if (a==3) /* igual a tres */ a++; /* incrementamos a */");
        sc.close();
    }
    
    public static String eliminaComentarios(String codigo){
        String sinComentarios ="";
        int contadorComent = 0;
        int posInicioComent = codigo.indexOf("/*");
        while (posInicioComent != -1) {
            contadorComent++;
            sinComentarios += codigo.substring(0, posInicioComent);
            // Proceso el comentario
            int posFinComent = codigo.indexOf("*/", posInicioComent);
            // Eliminar comentario???
            codigo = codigo.substring(0, posInicioComent) + 
                     codigo.substring(posFinComent + 2, codigo.length());


            //String comentario = codigo.substring(posInicioComent, posFinComent);
            posInicioComent = codigo.indexOf("/*", posFinComent);
            
        }

        System.out.println("El código tiene " + contadorComent + " bloques de comentarios.");
        return sinComentarios;
        
    }
}
