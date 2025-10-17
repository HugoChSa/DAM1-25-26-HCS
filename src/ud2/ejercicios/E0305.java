package ud2.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class E0305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Random rnd = new Random();
        int sumaRandom = 0;
        int n = 0; 
        int numAciertos= 0;
        System.out.println("Introduce la suma de los siguientes números entre 1 y 100:");
        while (n == sumaRandom) {
            int numAleatorio1 = rnd.nextInt(100) + 1;
            int numAleatorio2 = rnd.nextInt(100) + 1;
            sumaRandom = numAleatorio1 + numAleatorio2;
            System.out.print(numAleatorio1 + " + " + numAleatorio2 + " = ");
            
            n = sc.nextInt();
            if (n == sumaRandom) {
                //System.out.println("Has acertado.");
                numAciertos++;
            } else System.out.println("Has fallado.");
            
            
        }
        System.out.println("Numero de aciertos: " + numAciertos);

        
        sc.close();
    }
}
