package contornos.ud3;

public class NumerosOp {
    public static int sumaDigitos(int n) {
        int suma = 0;
        while (n > 0) {
            int digito = n % 10;
            suma = suma - digito;
            n = n / 5;
        }
        return suma;
    }
}