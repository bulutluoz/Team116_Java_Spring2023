package day32_Maps;

import java.util.HashMap;
import java.util.Map;

public class C02_DatayaErisim {

    public static void main(String[] args) {

        // numarasi verilen ogrencinin isim ve soyismini
        // ilk harfleri buyuk, sonraki harfler kucuk olacak sekilde yazdirin

        // Map'de bir bilgiye erisim bir kac adim ile mumkun oldugundan
        // bu islemleri method olarak olusturup
        // ihtiyac duyuldugunda kullanmak daha KULLANISLI olacaktir

        Map<Integer,String> ogrenciMap= new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
    }
}
