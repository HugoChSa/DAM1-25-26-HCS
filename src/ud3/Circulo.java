package ud3;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
       /*
        double r = Math.random(10, 100);
        double
        
        
        //double scan = sc.nextInt();
        //volumenEsfera(scan);
        */
        System.out.print("Radio: ");
        Scanner sc = new Scanner(System.in);
        double radio = sc.nextDouble();
        System.out.print("Volumen esfera: " + volumenEsfera(radio));
        sc.close();

    }

    static double volumenEsfera(double radio) {
        //radio = Math.random();
        double volumenEsfera;
        volumenEsfera = (4.0/3.0)*Math.PI*Math.pow(radio, 3);
        return volumenEsfera;
    }

   
}
