package day33_maps;

import day32_Maps.MapMethodlar;

import java.util.Map;

public class C05_MapsMethodlari {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapMethodlar.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        ogrenciMap.put(110,"Sevda-Fan-12-H-MF");
        ogrenciMap.put(101,"Ayse-Yan-10-M-MF");


        // map'e element ekler,
        // eklenen key zaten map'de varsa eski value'yu yeni value olarak update eder

        ogrenciMap.replace(102,"Aysegul-Man-11-M-MF");
        // bu haliyle put ile ayni islevi gorur

        ogrenciMap.replace(103,"Ali-Cem-11-K-TM","Kubra-Can-10-K-TM");
        ogrenciMap.replace(104,"Ayse-Cem-10-H-MF","Hasan-Cem-11-H-MF");

        // verilen key'in value'su benim dedigim gibi ise degistirir
        // benim dedigim gibi degilse degistirmez
        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.getOrDefault(105, "Bu ogrenci map'de yok"));
        System.out.println(ogrenciMap.getOrDefault(120, "Bu ogrenci map'de yok"));
        System.out.println(ogrenciMap.get(120));
        // getOrDefault() : aranan key varsa value'sunu dondurur
        //                  aranan key yoksa tanimladigimiz default degeri dondurur
        //                  get()'den farki bulamadiginda null degil default degeri donmesidir

        System.out.println(ogrenciMap.containsKey(105)); // true
        System.out.println(ogrenciMap.containsValue("Ayse")); // false
        System.out.println(ogrenciMap.containsValue("Aysegul-Man-11-M-MF")); // true
        // containsValue, bir butun olarak value'leri kontrol eder
        // value icindeki String'leri kontrol etmez
        // birebir map'deki value'lerle eslesen varsa true doner

        System.out.println(ogrenciMap.putIfAbsent(120, "Nurhayat-Zan-12-M-MF")); // null
        System.out.println(ogrenciMap.putIfAbsent(102, "Ahmet-Yan-10-M-MF")); // Aysegul-Man-11-M-MF

        System.out.println(ogrenciMap);

    }
}
