package ud5;

import java.util.Arrays;

import ud4.rol.Personaje;

public class Util {

static <U> int numeroDeNulos(U[] tabla) {
    int cont = 0;
    for (U e : tabla)
        if (e == null)
            cont++;
    return cont;
}

public static <U> U[] add(U e, U[] t) {
    t = Arrays.copyOf(t, t.length + 1);
    t[t.length - 1] = e;
    return t;
}

public static void main(String[] args) {
    Integer[] enteros = {4, 7, null, 2, 8, null, null, 10};
    System.out.println(numeroDeNulos(enteros));

    Personaje[] personajes = {
        null,
        new Personaje("Pepe"),
        null
    };
    System.out.println(numeroDeNulos(personajes));

    enteros = add(7, enteros);

    personajes = add(new Personaje("Marta"), personajes);

}



}
