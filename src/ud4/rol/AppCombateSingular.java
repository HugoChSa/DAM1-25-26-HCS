package ud4.rol;

public class AppCombateSingular {
    public static void main(String[] args) {
        Personaje per1 = new Personaje("Aragorn", Raza.HUMANO, 80, 90, 80, 10, 0, 50);
        Personaje per2 = new Personaje("Legolas", Raza.ELFO, 70, 100, 80, 10, 0, 60);


        System.out.println("COMBATE SINGULAR");
        System.out.println("-----------------------------------");
        System.out.println("CONTRINCANTES:");
        System.out.println(per1.mostrar());
        System.out.println(per2.mostrar());
        System.out.println("-----------------------------------");
        boolean turnoPer1 = per1.getAgilidad() >= per2.getAgilidad();


        while (per1.estaVivo() && per2.estaVivo()) {
            if (turnoPer1) {
                ejecutarAtaque(per1, per2);
                
            } else {
                ejecutarAtaque(per2, per1);
                
            }
            turnoPer1 = !turnoPer1;
        }

        System.out.println("El ganador es: ");
        System.out.println(per1.estaVivo() ? per1.getNombre() : per2.getNombre());


    }

    private static void ejecutarAtaque(Personaje atacante, Personaje defensor) {
        int danho = atacante.atacar(defensor);
        if (danho > 0) {
            System.out.println("* " + atacante.getNombre() + " golpea a " + defensor.getNombre());
            System.out.println(defensor + " pierde " + danho + " PV.");
            System.out.println("");
        } else {
            System.out.println("* " + defensor.getNombre() + " ha evitado el ataque.");
            System.out.println("");
        }
    }
    
}
