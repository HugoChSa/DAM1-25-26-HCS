package ud3;

public class ClaseMath {
   
    static double random(double min, double max){
        double random = Math.random();
        random *= max - min;
        random  -= min;
        return random;
    }
   
    public static void main(String[] args) {
    //System.out.println(random(-360, 360));
    
    for (int i = 0; i < 10000; i++) {
        double rnd = random(-360, 360);
        if (rnd < -360 || rnd >= 360) {
            System.out.println("NÚMERO FUERA DE RANGO.");
        } if (rnd == -360 || rnd == 360) {
            System.out.println(rnd);
        }
    }

    for (int i = 0; i < 1000; i++) {
        double rnd = random(100, 200);
         System.out.println(rnd);
        if (rnd < 100 || rnd >= 200) {
            System.out.println("NÚMERO FUERA DE RANGO.");
    }
    }
    
    /*double numero = random(-360, 360);
    System.out.println(numero);
   

    System.out.println("Raíz Cuadrada: " + Math.sqrt(numero));
    System.out.println("Redondeo a la cifra más cercana: " + Math.round(numero));
    System.out.println("Redondeo hacia arriba: " + Math.ceil(numero));
    System.out.println("Redondeo hacia abajo: " + Math.floor(numero));
    System.out.println("Valor absoluto: " + Math.abs(numero));
    System.out.println("Potencia al cubo: " + Math.pow(numero, 3));
    System.out.println("Logaritmo natural: " + Math.log(numero));
    System.out.println("Seno: " + Math.sin(numero));
    System.out.println("Coseno: " + Math.cos(numero));
    */
    }

}
