package day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C12_indexOf_lastIndexOf {

    public static void main(String[] args) {
        int[] sayilar = {3,5,6,3,1,2,5,7,5,3,4,2,3,5,6};
        List<Integer> sayiList = new ArrayList<>();

        for (int i = 0; i < sayilar.length ; i++) {
            sayiList.add(sayilar[i]);
        }
        System.out.println(sayiList); // [3, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6]

        System.out.println(sayiList.indexOf(5)); // 1

        System.out.println(sayiList.lastIndexOf(5)); // 13

        System.out.println(sayiList.indexOf(9)); // -1

        System.out.println(sayiList.lastIndexOf(9)); // -1



    }
}
