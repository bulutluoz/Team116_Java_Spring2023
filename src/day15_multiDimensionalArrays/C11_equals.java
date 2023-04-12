package day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C11_equals {
    public static void main(String[] args) {

        List<String> isimler1 = new ArrayList<>();

        isimler1.add("Selgun");
        isimler1.add("Saida");
        isimler1.add("Sevda");


        List<String> isimler2 = new ArrayList<>();

        isimler2.add("Saida");
        isimler2.add("Selgun");
        isimler2.add("Sevda");

        System.out.println(isimler1); // [Selgun, Saida, Sevda]
        System.out.println(isimler2); // [Saida, Selgun, Sevda]

        System.out.println(isimler1.equals(isimler2)); // false

        // Array list bir Collection oldugu icin sort method'unu oradan kullanir
        Collections.sort(isimler1);
        Collections.sort(isimler2);

        System.out.println(isimler1); // [Saida, Selgun, Sevda]
        System.out.println(isimler2); // [Saida, Selgun, Sevda]

        System.out.println(isimler1.equals(isimler2)); // true



    }
}
