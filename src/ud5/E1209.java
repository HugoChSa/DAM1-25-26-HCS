package ud5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class E1209 {   
    
    public static void main(String[] args) {
        Random rndNum = new Random();
        Collection<Integer> listaInt = new ArrayList<>();
       
        
        for (int i = 0; i < 100; i++) {
            while (i > -1) {
                listaInt.add(rndNum.nextInt());
            } 
        }
        Integer [] listaArray = listaInt.toArray(new Integer[0]);

        Arrays.sort(listaArray);
        listaInt = Arrays.asList(listaArray);

        
        System.out.println(listaInt);

    }
}
