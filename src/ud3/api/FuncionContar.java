package ud3.api;

import java.util.Scanner;

public class FuncionContar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //valorClave = sc.nextInt();
    }


    static int contar(int t[], int clave) {

        int valorClave = 0;
        for (int i=0; i < t.length; i++) {
            if (t[i] == clave) {
                valorClave++;
            }
        }
    
       return valorClave;
    }

}
