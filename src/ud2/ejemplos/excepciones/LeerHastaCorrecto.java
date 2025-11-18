package ud2.ejemplos.excepciones;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerHastaCorrecto {
    public static void main(String[] args) {
   /*  Scanner sc = new Scanner(System.in);
    int numerador = 0;       
    boolean numeroValido = false;
    
    do {
          try {    
            
            System.out.print("Introduce un número entero para el numerador: ");
            numerador = sc.nextInt();
            
            numeroValido = true;
            } catch(Exception e) {
                String entradaIncorrecta = sc.nextLine();
                System.out.println("El dato introducido (" + entradaIncorrecta + ") no es un número entero.");
                
            }
        } while (!numeroValido);
        
        try {    
            int denominador;
            System.out.print("Introduce otro número entero para  el denominador: ");
            denominador = sc.nextInt();
            sc.close();
        
            int resultado = (numerador / denominador);

            System.out.println(numerador + " / " + denominador + " = " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error. Los datos de entrada deben de ser números enteros.");
            //System.out.println("Finalizando programa.");
        } catch (ArithmeticException e) {
            System.out.println("Error al dividir: " + e.getMessage() + " El denominador no puede ser 0 o el resultado infinito.");
            //System.out.println("Finalizando programa.");
        } catch (Exception e) {
            System.out.println("Excepción.");
            //System.out.println("Finalizando programa.");
        } finally {
            System.out.println("Finalizando programa.");
        }
        */
    }

    public int leerInt() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        @SuppressWarnings("unused")
        int numerador = 0;  
        int numeroEntero = 0;     
        boolean numeroValido = false;
    
          try {    
            
            System.out.print("Introduce un número entero para el numerador: ");
            numerador = sc.nextInt();
            
            numeroValido = true;
            } catch(Exception e) {
                String entradaIncorrecta = sc.nextLine();
                System.out.println("El dato introducido (" + entradaIncorrecta + ") no es un número entero.");
                
            }while (!numeroValido);
            return numeroEntero;
        } 
        
    
    }

