package ud2.ejercicios;

import ud2.Util;

public class Digitos {
    public static void main(String[] args) {
    
        System.out.println("Introduce un número entero: ");
        int n = Util.leerInt();

        /*
         * LEER INT:
        
            public static int leerInt() {
            Scanner sc = new Scanner(System.in);
            int numeroEntero = 0;
            boolean numeroValido = false;
            do {
                try {

                    numeroEntero = sc.nextInt();
                    numeroValido = true;
                } catch (Exception e) {
                    String entradaIncorrecta = sc.nextLine();
                    System.out.println("El dato introducido (" + entradaIncorrecta + ") no es un número entero");
                }
            } while (!numeroValido);
            return numeroEntero;
            }

         * 
         */


        /* 
        int unidades = n % 10;
        int decenas = n / 10 % 10;
        int centenas = n / 100 % 10;
        int udMillar = n / 1000; 
        */
        //digito = n / i % 10

        for (int i = 1; i <= n; i *=10) {
            System.out.println(n / i % 10);
        }
        
    }
    
}
