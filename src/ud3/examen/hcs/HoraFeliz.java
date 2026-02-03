package ud3.examen.hcs;


import java.time.LocalTime;

import java.util.Random;

/**
 * @Author Hugo Chan Saball
 */

public class HoraFeliz {

    
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Random rnd = new Random();
        
        @SuppressWarnings("unused")
        int horaHoraFeliz;
        @SuppressWarnings("unused")
        int minutosHoraFeliz;
        
        
        @SuppressWarnings("unused")
        String horaFeliz;

        //Random horaHoraFeliz = Random(); 
       
        LocalTime horaActual = LocalTime.now();
        String horaAhora = horaActual.toString();

        //String horaFelizCompleta = Integer(horaFeliz, minutosHoraFeliz).format("hh:mm");
        System.out.println("La hora feliz es: " );
        System.out.print("La hora actual es: ");
        System.out.printf(horaAhora.format("hh:mm"));

    }

    

}
