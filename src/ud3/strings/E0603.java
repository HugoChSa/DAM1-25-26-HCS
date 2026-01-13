package ud3.strings;


import java.util.Scanner;

public class E0603 {
    public static void main(String[] args) {


        System.out.print("El jugador 1 debe introducir una contraseña: ");
        Scanner sc = new Scanner(System.in);
        String contraseña = sc.nextLine();
        int i = 0;

        System.out.print("Introduce también el numero de intentos que tendrá el jugador para acertar: ");
        int numIntentosDisponibles = 0;
        numIntentosDisponibles = sc.nextInt();


        do { System.out.println(" ");
        i++;
        } while (i != 50);

        boolean iguales = false;
        
        System.out.println("Ahora el jugador 2 debe de acertar la contraseña.");
        String intentoJugador;
        int numIntentosJugador = 0;
        
        while (iguales) {
            intentoJugador = sc.nextLine();
            numIntentosJugador++;
            System.out.println("Intentos: " + numIntentosJugador + "/" + numIntentosDisponibles);
        
            if (contraseña.equalsIgnoreCase(intentoJugador)) {
            System.out.println("¡Has ganado!");
            } else {
                System.out.println("La contraseña no es correcta, vuelve a intentarlo.");
                System.out.println("Intentos: " + numIntentosJugador + "/" + numIntentosDisponibles);
            } 
            
            if (numIntentosDisponibles == numIntentosJugador) {
                System.out.println("Has gastado todos tus intentos. " + numIntentosJugador + "/" + numIntentosDisponibles);
            }  
        
        }
        
    }
}
