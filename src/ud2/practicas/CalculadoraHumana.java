package ud2.practicas;
/* 
import java.util.Random;
import java.util.Scanner;

import ud2.Util;

public class CalculadoraHumana {
    
    //Inicia el juego y muestra el bucle principal del programa

    public static void main(String[] args) {
        final int MAX_ACIERTOS = 7;
        final int MAX_NUM = 200;
        int aciertos = 0;
        int operando1, operando2;
        
        mostrarInstrucciones();

        operando1 = generarAleatorio();
        int resultado = generarOperacion(operando1);
        int resultadoUsuario = pedirResultado();

        //int resultadoEsperado = generarPrimeraOperacion();

        
        while (resultado == resultadoUsuario) {
            aciertos++;
            operando1 = resultado;
            resultado = generarOperacion(operando1);
            resultadoUsuario = pedirResultado();

        }


        if (aciertos >= MAX_ACIERTOS) {
            System.out.println("Enhorabuena! Has conseguido " + aciertos + " aciertos.");
        } else {
            System.out.println("No conseguiste " + MAX_ACIERTOS + " aciertos.");
        }

    }


    static int generarOperacion(int operando1) {
        boolean operadorValido = true;

        do {
        int operador = generarAleatorio(4);
                switch (operador) {
                    case 1: //Suma
                    if (operando1 < 150) {
                        operadorValido = true;
                        //Generar operando 2

                    }

                        break;
                    
                    case 2: //Resta
                    if (operando1 >= 50) {
                            
                        //Generar operando 2
                    }
                        break;

                    case 3: //Multiplicación
                    if (operando1 < 20) {
                        operadorValido = true;

                        //Generar operando 2
                    }
                        break;
                    
                    case 4: //División
                    if (operando1 > 50 && !Util.esPrimo(operando1)) {
                        operadorValido = true;

                        //Generar operando 2
                    }
                        break;
                    
                    default:
                        break;
                }

        } while (!operadorValido);
        

    }


    static int pedirResultado() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    /**
     * Genera un núm aleatorio entre 2 y max inclusives
     * @param max
     * @return
     */

/*
     static int generarAleatorio(int max){
    Random rnd = new Random();
        return rnd.nextInt(max -1) + 2;

    }


    static void mostrarInstrucciones(final int MAX_ACIERTOS) {
        System.out.println("Resuelve las operaciones. Para ganar debes acertar " + MAX_ACIERTOS + " veces");
        System.out.println();
    }





    static void mostrarInstrucciones() {

    }

    static void generarPrimeraOperacion() {
    }    

    //static mostrarInstrucciones() {}

}
*/
  