package ejercicios;

import java.util.Scanner;
public class E0107_Circulo {
    //Formula perímetro círculo: P = 2πr 
    //Formula Área círculo:     A = πr²
    public static void main(String[] args) {
    
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el valor del radio del círculo: ");
    double radio = sc.nextDouble();
    
    sc.close();

    double area = Math.PI * Math.pow(radio, 2);
    double perimetro = (2 * Math.PI * radio);


    System.out.println("El círculo tiene un area de: " + area);
    System.out.println("El círculo tiene un perimetro de: " + perimetro);

    }


    
    
}
