package ud1.ejercicios.progparejas;

import java.util.Scanner;

public class HorasClaseAsistencia {
    //private final static String asignatura = "Progamacion";
    private final static double horasAsignatura = 240.0;

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        double numSesiones = (horasAsignatura * 60.0) / 50.0 ;
        double apercibimiento = numSesiones * (6.0 / 100.0);
        double perdidaEvContinua = numSesiones * (10.0 / 100.0);

        System.out.println("Numero de sesiones: " + numSesiones 
        + "\nNumero de faltas mínimo para el apercibimiento: " + apercibimiento 
        + "\nNumero de faltas para la perdida de la evaluación continua: " + perdidaEvContinua);
        
        System.out.print("Introduce el número de faltas: ");
        double numFaltas = sc.nextDouble();

        String msgApercibimiento = (numFaltas >= apercibimiento) ? "Tienes un apercibimiento." : "No tienes apercibimiento.";
        String msgPerdidaEvContinua = (numFaltas >= perdidaEvContinua) ? "Has perdido la evaluación continua." : "No has perdido la evaluación continua.";


        sc.close();
        System.out.println("\n\t" + msgApercibimiento + "\n\t" + msgPerdidaEvContinua);

    }
}
