package apuntes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class HoraLocal {
    public static void main(String[] args) {
        LocalTime horaActual;
        horaActual = LocalTime.now();

        LocalDate fechaActual;
        fechaActual = LocalDate.now();

        System.out.println("La hora actual es: " + horaActual);    
       
        System.out.println("La fecha actual es: " + fechaActual);
    
        System.out.println("Fecha y hora actuales: " + LocalDateTime.now());
    }
    
}
