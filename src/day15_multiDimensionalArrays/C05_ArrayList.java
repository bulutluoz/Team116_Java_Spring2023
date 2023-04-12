package day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C05_ArrayList {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Ayse");
        isimler.add("Sevda");
        isimler.add("Isa");

        System.out.println(isimler); // [Ayse, Sevda, Isa]

        // Verilen bir array'deki elementleri yazdiralim
        // Ancak tekrar eden elementler varsa sadece 1 kere yazdirin


        int[] sayilar = {3,5,6,3,1,2,5,7,5,3,4,2,3,5,6};

        List<Integer> tekrarsizListe= new ArrayList<>();

        for (int i = 0; i < sayilar.length ; i++) {

            if (!tekrarsizListe.contains(sayilar[i])){

                tekrarsizListe.add(sayilar[i]);
            }
        }
        System.out.println(tekrarsizListe); // [3, 5, 6, 1, 2, 7, 4]



    }
}
