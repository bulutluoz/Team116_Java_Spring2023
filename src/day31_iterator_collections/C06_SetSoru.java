package day31_iterator_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_SetSoru {
    public static void main(String[] args) {

        // verilen bir array'den tekrar eden elementleri silip
        // unique elementlerden olusan halini array'e kaydedin

        Integer[] sayilar ={3,2,4,5,4,3,2,4,5,4,3,2,3,4,5,6,5,4,3,4,5,6,6,1};

        // Set dublication'a izin vermediginden. bir set olusturup tum elementleri
        // set'e ekleyelim

        Set<Integer> sayilarSeti= new HashSet<>();

        for (Integer each:sayilar
             ) {
            sayilarSeti.add(each);
        }

        System.out.println(sayilarSeti); // [1, 2, 3, 4, 5, 6]

        // array'i bu elementlerle guncelleyelim

        sayilar = new Integer[sayilarSeti.size()]; // [0, 0, 0, 0, 0, 0]

        int index=0;
        for (Integer each:sayilarSeti
             ) {
            sayilar[index] = each;
            index++;
        }

        System.out.println("Array'in son hali : "+Arrays.toString(sayilar));
    }
}
