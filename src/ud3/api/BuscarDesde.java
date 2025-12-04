package ud3.api;

public class BuscarDesde {
    public static void main(String[] args) {
        

    }

    static int buscar(int t[], int clave) {
    for(int i = 0; i < t.length; i++){
        if (t[i] == clave){
            return i;
        }
    }
        return -1;
    }
}
