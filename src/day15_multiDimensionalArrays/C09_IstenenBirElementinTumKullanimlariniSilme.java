package day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_IstenenBirElementinTumKullanimlariniSilme {

    public static void main(String[] args) {

        int[] sayilar = {3,5,6,3,1,2,5,7,5,3,4,2,3,5,6};
        List<Integer> sayiList = new ArrayList<>();

        for (int i = 0; i < sayilar.length ; i++) {
            sayiList.add(sayilar[i]);
        }
        System.out.println(sayiList); // [3, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6]

        Integer silinecekElement = 5 ;


        while(sayiList.contains(silinecekElement)){
            sayiList.remove(silinecekElement);
        }

        System.out.println(sayiList); // [3, 6, 3, 1, 2, 7, 3, 4, 2, 3, 6]
    }
}
