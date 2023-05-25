package day33_maps;

import java.util.Map;
import java.util.TreeMap;

public class C06_PutIfAbsent {

    public static void main(String[] args) {
        /*
        Soru : Verilen bir array’de kullanilan sayilari ve kacar defa kullanildigini yazdirin.

        Input : {"a","b","s","a","s","c","d","b","c","a","a","s","z","k"}
        output :a kullanimi : 4 adet
                b kullanimi : 2 adet
                c kullanimi : 2 adet
                d kullanimi : 1 adet
                k kullanimi : 1 adet
                s kullanimi : 3 adet
                z kullanimi : 1 adet

         */

        String[] harfler = {"a","b","s","a","s","c","d","b","c","a","a","s","z","k"} ;

        // 1.yontem
        Map<String,Integer> harfKullanimMapi = new TreeMap<>();

        // her bir harfi ele alalim
        // harf map'de yoksa key = harf , value =1 olarak ekleyelim
        // harf map'de varsa kullanim sayisi olarak tuttugumuz value'u bir artiralim

        for (String eachHarf: harfler
             ) {

            if (!harfKullanimMapi.containsKey(eachHarf)){
                harfKullanimMapi.put(eachHarf,1);
            }else{

                int mevcutKullanimSayisi= harfKullanimMapi.get(eachHarf);

                harfKullanimMapi.put(eachHarf, mevcutKullanimSayisi+1);
            }


        }

        System.out.println(harfKullanimMapi);


        // 2.yontem
        Map<String,Integer> harfKullanimMapi2 = new TreeMap<>();

        for (String eachHarf: harfler
             ) {

            if (harfKullanimMapi2.putIfAbsent(eachHarf,1) != null){

                int mevcutKullanimSayisi= harfKullanimMapi2.get(eachHarf);

                harfKullanimMapi2.put(eachHarf, mevcutKullanimSayisi+1);
            }
        }
        System.out.println(harfKullanimMapi2);
    }
}
