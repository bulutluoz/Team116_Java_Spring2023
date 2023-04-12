package day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C08_remove {
    public static void main(String[] args) {
        /*
        Eger listemiz sayilardan olusuyorsa
        Java girilen sayi index mi yoksa obje mi diye dusunmez
        direk index olarak kabul eder

        Illa da objeyi vermek isterseniz
        once silmek istediginiz objeyi olusturup
        sonra iInteger degeri degil, obje ismini yazarak remove edebilirsiniz

        Eger silmek istedigimiz obje birden fazla ise
        ilkini siler
         */

        int[] sayilar = {3,5,6,3,1,2,5,7,5,3,4,2,3,5,6};
        List<Integer> sayiList = new ArrayList<>();

        for (int i = 0; i < sayilar.length ; i++) {
            sayiList.add(sayilar[i]);
        }

        System.out.println(sayiList);// [3, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6]

        System.out.println(sayiList.remove(5)); // 2

        System.out.println(sayiList); // [3, 5, 6, 3, 1, 5, 7, 5, 3, 4, 2, 3, 5, 6]

        System.out.println(sayiList.remove(1)); // 5

        System.out.println(sayiList); // [3, 6, 3, 1, 5, 7, 5, 3, 4, 2, 3, 5, 6]

        Integer silinecekObje= 5;

        System.out.println(sayiList.remove(silinecekObje)); // true

        System.out.println(sayiList); // [3, 6, 3, 1, 7, 5, 3, 4, 2, 3, 5, 6]
    }
}
