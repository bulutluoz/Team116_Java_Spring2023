package day32_Maps;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Keys {

    public static void main(String[] args) {

        // her class'da map ile islem yapabilmek icin
        // bir map olusturmak ve ogrencileri eklemek zorundayiz
        // Mapmethod'lar class'inda bir map olusturup,
        // ogrencileri ekleyip bize donduren bir method olusturalim

        /*
        Map<Integer,String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
         */

        Map<Integer,String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();

        // Map'deki tum key'leri yazdirin

        System.out.println(ogrenciMap.keySet()); // [101, 102, 103, 104, 105, 106]

        // bu seti kaydetmek istersek

        Set<Integer> keySeti = ogrenciMap.keySet();

        /* KeySeti'deki ogrenci numaralarini asagidaki formatta yazdirin

            1- 101
            2- 102
            3- 103

         */

        int siraNo=1;
        for (Integer eachKey: keySeti
             ) {
            System.out.println(siraNo + "- "+ eachKey);
            siraNo++;
        }

        // tum ogrencilerin isim ve soyisimlerini bir liste olarak yazdiran
        // bir method olusturun

        MapMethodlar.tumOgrenciListesiYazdir(ogrenciMap);

    }
}
