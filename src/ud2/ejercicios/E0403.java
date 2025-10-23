package ud2.ejercicios;

import java.util.Scanner;

public class E0403 {
    public static void main(String[] args) {
    double radio, altura; 
    Scanner sc = new Scanner(System.in);
    radio = sc.nextDouble();

    altura = sc.nextDouble();
    int opcionUsuario;

    System.out.println("Introduce 1 para calcular el área. Introduce 2 para calcular el volúmen.");
    opcionUsuario = sc.nextInt();
    

    if (opcionUsuario == 1) {
        areaCilindro(altura, radio);    
    } if (opcionUsuario == 2) {
        volumenCilindro(altura, radio);
    } else System.out.println("Opción incorrecta");
    sc.close();

    }

    static void areaCilindro(double altura, double radio) {
        
        double area = (2 * Math.PI) * radio * (altura + radio);

        System.out.println("El área del cilindro es de: " + area + " metros cuadrados");

    }

    static void volumenCilindro(double altura, double radio) {
        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        System.out.println("El volúmen del cilindro es de: " + volumen + " metros cúbicos");

    }
    
}
