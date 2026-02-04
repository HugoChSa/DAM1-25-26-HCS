package ud4.clases;

import java.util.Scanner;

public class CuentaCorriente {
    
    // Atributos


    public class Cuenta {

        String DNI;
        String nombre;
        String apellido1, apellido2;
        int saldo;
    }

    Cuenta cuenta = null;

    // Métodos
    
    public Cuenta crearCuenta() {
        Cuenta cuenta = new Cuenta();
        Scanner sc = new Scanner(System.in);
        System.out.print("DNI: ");
        cuenta.DNI = sc.nextLine();
        
        System.out.print("Nombre: ");
        cuenta.nombre = sc.nextLine();
        System.out.print("Apellido 1: ");
        cuenta.apellido1 =sc.nextLine();
        System.out.print("Apellido 2: ");
        cuenta.apellido2 = sc.nextLine();
        cuenta.saldo = 0;
        System.out.println("Saldo = " + cuenta.saldo);
        

        return cuenta;
    }

}

    /*
        System.out.println("DNI: ");
        System.out.println("Nombre del titular: ");
        System.out.println("Saldo = ");
    */