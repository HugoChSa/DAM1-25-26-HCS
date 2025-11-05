package ud2.ejemplos.excepciones;
/**
* @author Hugo CS
*/

import java.util.InputMismatchException;

/*
* Division. Escribe un programa que solicite dos números enteros por
  teclado y muestre el resultado de dividir el primero (numerador)
  por el segundo (denominador).
* ¿Qué situaciones pueden provocar errores en tiempo de ejecución?
* B = 0
* Introducir un numero decimal cuando se espera un entero
  o cualquier otro dato que el programa no espere, como letras
*/

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        try {    
            int a, b;
        
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un número entero para el numerador: ");
            a = sc.nextInt();
            System.out.print("Introduce otro número entero para  el denominador: ");
            b = sc.nextInt();
            sc.close();
        
            int resultado = (a / b);

            System.out.println(a + " / " + b + " = " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error. Los datos de entrada deben de ser números enteros.");
            System.out.println("Se finalizará el programa.");
        } catch (ArithmeticException e) {
            System.out.println("Error al dividir: " + e.getMessage() + " El denominador no puede ser 0 o el resultado infinito.");
            System.out.println("Se finalizará el programa.");
        } catch (Exception e) {
            System.out.println("Excepción.");
            System.out.println("Se finalizará el programa.");
        }
        

    }

}
