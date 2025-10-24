package ud2.ejercicios;

public class E0407 {
  /* 

    static int numDivPrimos(int n,int numDivPrimos){
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("NO es primo");
            } else {
                numDivPrimos++;
            }
        }
        return numDivPrimos;
    }
    
    public static void main(String[] args) {
        int numDivPrimos;
        
        
        System.out.println(numDivPrimos(1));
        System.out.println();
    }*/
    
    static boolean esPrimo(int n) {
            if (n <= 1)
                return false;

            boolean esPrimo = true;
            for (int i = 2; esPrimo && i <= n / 2; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                }
            }

            return esPrimo;
        }

    static int numDivisoresPrimos(int n) {
        int numDivisoresPrimos = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0 && esPrimo(i)) {
                numDivisoresPrimos++;
            }
        }

        return numDivisoresPrimos;
    }

    public static void main(String[] args) {
        System.out.println(numDivisoresPrimos(7));
        System.out.println(numDivisoresPrimos(8));
        System.out.println(numDivisoresPrimos(13));
        System.out.println(numDivisoresPrimos(50));
        System.out.println(numDivisoresPrimos(41));
    }
    
}
