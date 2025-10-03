package ejerciciospractica;

import java.util.Scanner;

public class recetasEIngredientes {
    public static void main(String[] args) {
        double manzana, agua, azucar, limon;
        manzana = 1.5 * 1000.0;
        agua = 330 / 1000.0;
        azucar = 120.0;
        limon = 1.0;
        
        System.out.println("Receta de compota de manzana: ");
        System.out.println("https://www.abc.es/recetasderechupete/compota-de-manzana-casera/12509/");
        System.out.print("Número de personas: ");
        Scanner sc = new Scanner(System.in);
        int numPersonas = sc.nextInt();

        double azucarUnaPersona = (azucar * 1) / 6;
        double aguaUnaPersona = (agua * 1) / 6;
        double manzanaUnaPersona = (manzana * 1) / 6;
        double limonUnaPersona = (limon * 1) / 6;
        
        /*
        System.out.println("Para " + numPersonas + " se necesitan:");
        System.out.println(numPersonas * azucarUnaPersona + " gramos de azucar");
        System.out.println(numPersonas * aguaUnaPersona + " litros de agua");
        System.out.println(numPersonas * manzanaUnaPersona + " gramos de manzana");
        System.out.println(numPersonas * limonUnaPersona + " gramos de limón");
        */

        sc.close();

        System.out.println("Para " + numPersonas + " se necesitan: " +
        "\n\t-" + azucarUnaPersona *  numPersonas + " gramos de azucar" +
        "\n\t-" + aguaUnaPersona * numPersonas + " litros de agua" + 
        "\n\t-" + manzanaUnaPersona * numPersonas + " gramos de manzana" +
        "\n\t-" + limonUnaPersona * numPersonas + " gramos de limón"
        );

    }
}
