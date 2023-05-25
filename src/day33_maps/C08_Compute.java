package day33_maps;

import java.util.Map;
import java.util.TreeMap;

public class C08_Compute {

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

        Map<String,Integer> harfKullanimMapi = new TreeMap<>();

        for (String eachHarf: harfler
             ) {

            harfKullanimMapi.computeIfPresent(eachHarf, (k,v)-> v+1 );
            harfKullanimMapi.putIfAbsent(eachHarf,1);
        }

        System.out.println(harfKullanimMapi);
    }
}
