package ud4.carpetaotrosejs.e0709;

public class Bombilla {

    private boolean interruptor;

    private static boolean interruptorGeneral;

    boolean estaEncendida(){
        return interruptor;
    }

    void encender() {
        interruptor = true;
    }

    void apagar() {
        interruptor = false;
    }


    static void encenderInterruptorGeneral() {
        interruptorGeneral = true;

    }

    static void apagarInterruptorGeneral(){
        interruptorGeneral = false;
    }

    static boolean getInterruptorGeneral(){
        return interruptorGeneral;
    }


    public static void main(String[] args) {
        Bombilla b1 = new Bombilla();
        
        b1.encender();


        System.out.println("La bombilla está encendida? " + b1.estaEncendida());
        //System.out.println("Interruptor general: " + Bombilla.interruptorGeneral());
    
    }
    

}