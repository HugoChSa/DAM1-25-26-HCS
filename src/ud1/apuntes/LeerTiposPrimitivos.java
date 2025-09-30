package ud1.apuntes;

import java.util.Scanner;

public class LeerTiposPrimitivos {
    public static void main(String[] args) {
        System.out.println("Introuce un dato de tipo byte, short,"
        + "int, long, float, double y String");
        
        Scanner sc = new Scanner(System.in);
        
        byte datoByte = sc.nextByte();
        short datoShort = sc.nextShort();
        int datoInt = sc.nextInt();
        long datoLong = sc.nextLong();
        float datoFloat = sc.nextFloat();
        double datoDouble = sc.nextDouble();
        String datoString = sc.nextLine();
        
        sc.close();
        
        System.out.println("Byte: " + datoByte);
        System.out.println("Short: " + datoShort);
        System.out.println("Int: " + datoInt);
        System.out.println("Long: " + datoLong);
        System.out.println("Float: " + datoFloat);
        System.out.println("Double: " + datoDouble);
        System.out.println("String: " + datoString);
    }
    
}
