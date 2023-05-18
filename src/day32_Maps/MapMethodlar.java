package day32_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodlar {

    // bu class'da static method'lar olusturalim ki
    // her yerden class ismi ile kullanabilelim

    // map ve ogrenci numarasi verdigimizde, istenen formatta isim soyisim bilgisini
    // bize donduren bir method olusturalim


    public static String numaraIleOgrenciBulma(Map<Integer,String> ogrenciMap,int ogrenciNo){

        // 1- istenen numaraya ait value'yu kaydedelim
        String ogrenciValue= ogrenciMap.get(ogrenciNo); // Ali-Cem-11-K-TM

        // 2- tek bir String olan value'yu bilgileri alabilmek icin split edelim
        String[] valueArr = ogrenciValue.split("-"); // [Ali, Cem, 11, K, TM]

        // 3- istenen bilgileri alip, istenen formatta kaydedelim
        String isim = valueArr[0];
        String soyisim = valueArr[1];
        String formataUygunIsimSoyisim = isim.substring(0,1).toUpperCase() +
                                         isim.substring(1).toLowerCase()+
                                         " "+
                                         soyisim.substring(0,1).toUpperCase()+
                                         soyisim.substring(1).toLowerCase();

        return formataUygunIsimSoyisim;

    }

    public static Map<Integer,String> ogrenciMapOlustur(){

        Map<Integer,String> ogrenciMap= new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }


    public static void tumOgrenciListesiYazdir(Map<Integer,String> ogrenciMap){

        // tum ogrencilerin isim ve soyisimlerini bir liste olarak yazdirin
        // tum ogrencilere ulasabilmek icin, tum ogrencilerin key'lerine ihtiyacimiz var

         Set<Integer> ogrenciKeySeti= ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106]

        // tum key'leri tek tek ele alip
        // o key'e ait isim ve soyismi, yukaridaki method'u kullanarak yazdiralim

        int siraNo=1;
        for (Integer eachKey: ogrenciKeySeti
             ) {

            // her bir key'e ait isim soyismi yazdiralim
            System.out.println(siraNo+"- "+numaraIleOgrenciBulma(ogrenciMap, eachKey));
            siraNo++;
        }
    }

    public static void istenenSiniftakiOgrencileriYazdir(Map<Integer, String> ogrenciMap, int sinif) {

        // istenen siniftaki tum ogrencilerin isim ve soyismlerini yazdirin

        // value'lari kaydedelim
        Collection<String> valueCollection = ogrenciMap.values();

        // siniflari kontrol edip, istenen siniftaki ogrencileri yazdirmak icin
        // herbir value'yu gozden gecirmeliyiz
        int siraNo=1;
        for (String eachValue: valueCollection
             ) { // Ali-Can-11-H-MF

            // herbir value'yu split edip, class bilgisini kontrol etmeliyiz

            String[] eachValueArr= eachValue.split("-"); // [Ali, Can, 11, H, MF]

            // array'den sinif bilgisini kontrol edip
            // istenen sinif degerine esit ise
            // isim ve soyisim degerlerini yazdiralim


            if (eachValueArr[2].equals(sinif+"")) {

                System.out.println(siraNo +"- "+ eachValueArr[0]+" "+eachValueArr[1] +" " + eachValueArr[2]);
                siraNo++;
            }

        }
    }
}
