package day33_maps;

import java.util.Map;
import java.util.TreeMap;

public class C07_Compute {



    public static void main(String[] args) {
        Map<String,Integer> harfKullanimSayilari = new TreeMap<>();

        harfKullanimSayilari.put("A" ,20);
        harfKullanimSayilari.put("K" ,10);
        harfKullanimSayilari.put("C" ,25);
        harfKullanimSayilari.put("M" ,23);
        harfKullanimSayilari.put("Z" ,32);

        System.out.println(harfKullanimSayilari); //  {A=20, C=25, K=10, M=23, Z=32}

        // A'nin degerini 2 katina cikarin

        int eskiDeger= harfKullanimSayilari.get("A"); // 20
        harfKullanimSayilari.put("A",2*eskiDeger);

        System.out.println(harfKullanimSayilari); // {A=40, C=25, K=10, M=23, Z=32}

        // B varsa degerini 3 artirin

        if (harfKullanimSayilari.containsKey("B")){
            eskiDeger = harfKullanimSayilari.get("B");
            harfKullanimSayilari.put("B",eskiDeger+3);
        }

        System.out.println(harfKullanimSayilari); // {A=40, C=25, K=10, M=23, Z=32}


        /*
            java var olan veya olmayan key'lerin
            value'leri uzerinde islem yapmak icin
            ozel iki method gelistirmis

            bu method'lar functional programing (Lambda) kullanarak calisir
         */

        // A'nin degerini 2 katina cikarin

        harfKullanimSayilari.compute("A",(k,v)-> 2*v );
        System.out.println(harfKullanimSayilari); // {A=80, C=25, K=10, M=23, Z=32}


        // B varsa degerini 3 artirin

        harfKullanimSayilari.computeIfPresent("B",(k,v)-> v+3);
        harfKullanimSayilari.computeIfPresent("M",(k,v)-> v+3);
        System.out.println(harfKullanimSayilari); // {A=80, C=25, K=10, M=26, Z=32}


        // Eger B yoksa degeri 5 olarak ekleyin

        harfKullanimSayilari.putIfAbsent("B",5);
        harfKullanimSayilari.putIfAbsent("A",5);

        System.out.println(harfKullanimSayilari); // {A=80, B=5, C=25, K=10, M=26, Z=32}


        // Eger D yoksa degeri 5 olarak ekleyin

        harfKullanimSayilari.computeIfAbsent("D", v ->5);
        harfKullanimSayilari.computeIfAbsent("C", v ->5);

        System.out.println(harfKullanimSayilari); // {A=80, B=5, C=25, D=5, K=10, M=26, Z=32}

    }
}
