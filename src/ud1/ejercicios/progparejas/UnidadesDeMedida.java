package ud1.ejercicios.progparejas;

import java.util.Scanner;

public class UnidadesDeMedida {
    public static void main(String[] args) {
        double hectarea = 100*100;
        double med_CampoFutbol = 105*70;
        double med_canchaBaloncesto = 28*15;
        double med_pistaTenis = 23.77*10.97;
        double med_parqueRetiro = 125 * hectarea;

        System.out.print("Introduce las hectáreas afectadas: ");
        Scanner sc = new Scanner(System.in);
        double hectareasAfectadas = sc.nextDouble();
        double totalhectareasMetros = hectareasAfectadas * hectarea;
        double totalhectareasFutbol = totalhectareasMetros / med_CampoFutbol;
        double totalhectareasBaloncesto = totalhectareasMetros / med_canchaBaloncesto;
        double totalhectareasTenis = totalhectareasMetros / med_pistaTenis;
        double totalhectareasRetiro = totalhectareasMetros / med_parqueRetiro;

        sc.close();
        
        System.out.println(hectareasAfectadas + " hectareas son " + totalhectareasFutbol + " campos de fútbol");
        System.out.println(hectareasAfectadas + " hectareas son " + totalhectareasBaloncesto  + " canchas de baloncesto");
        System.out.println(hectareasAfectadas + " hectareas son " + totalhectareasTenis + " canchas de tenis");
        System.out.println(hectareasAfectadas + " hectareas son " + totalhectareasRetiro + " parques del retiro");
        System.out.println(hectareasAfectadas + " hectareas son " +  totalhectareasMetros + " metros");

    }
}
