package day32_Maps;

import java.util.*;

public class C01_MapOlusturma {

    public static void main(String[] args) {

        // variable olusturma
        int sayi = 5 ;
        String str= "Java Candir";

        // coklu element barindiran collections olusturma

        List<String> liste = new ArrayList<>();
        Set<Integer> sayiSeti = new HashSet<>();
        liste.add("4");
        sayiSeti.add(34);

        // Map her zaman key-value ikilisi barindirir
        // bu ozelligi sebebiyle Map olustururken
        // key ve value'nun data turleri yazilmalidir

        Map<Integer,String> ogrenciMap= new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        System.out.println(ogrenciMap);
        // Map'i yazdirdigimizda key=value seklinde yazar
        // = atama isareti degildir, yazdirirken bilgi vermek icin boyle yazdirir
        // {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF}

        System.out.println(ogrenciMap.get(101)); // Ali-Can-11-H-MF

        // 103 numarali ogrencinin subesini yazdirin
        // Map'de tum bilgiler String olarak birlestirilen value icerisindedir
        // String'deki bir bilgiye direk ulasamayiz
        // manipulation yapip istedigimiz bilgiye ulasmaliyiz

        // 1- once istenen ogrencinin value'sunu bulalim ve kaydedelim
        String value103= ogrenciMap.get(103); // Ali-Cem-11-K-TM

        // 2- value ozel bir isaretle birlestirilen farkli bilgilerden olusur
        //    split("-") ile bu bilgileri bir array'e donusturup kaydedelim
        String[] valueArr = value103.split("-"); // [Ali, Cem, 11, K, TM]

        // 3- artik istedigim bilgiye tanimli index ile ulasabilirim

        System.out.println(valueArr[3]); // K
    }


}
