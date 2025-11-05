package ud2.ejemplos.Recursividad;

public class E0411_MCD {
    public static void main(String[] args) {
     System.out.println(mcd(10, 25)); //5
     System.out.println(mcd(20, 11));
     System.out.println(mcd(8, 60));


    }

    public static int mcd(int a, int b) {
        int mcd = 0;
        if (a ==0)
            mcd = b;
        else if (b == 0)
            mcd = a;
        else if (b > a)
            mcd = mcd (a, b-a);
        else
            mcd = mcd (a - b, b);
        
        return mcd;

    }
}
