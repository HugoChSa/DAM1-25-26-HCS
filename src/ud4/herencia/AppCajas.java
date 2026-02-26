package ud4.herencia;

public class AppCajas {
    public static void main(String[] args) {
        Caja c = new Caja(100, 100, 100, Unidad.CM);
        c.setEtiqueta("Caja Pequeña");
        System.out.println(c);
        System.out.println("Volúmen: " + c.getVolumen() + " metros cúbicos.");
        
        
        Caja c2 = new Caja(100, 100, 100, Unidad.M);
        c2.setEtiqueta("Caja Grande");
        System.out.println(c2);
        System.out.println("Volúmen: " + c2.getVolumen() + " metros cúbicos.");
    }  
    
}
