package day34_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C01_NestedMap {

    public static void main(String[] args) {

        /*
                ogrenciMap.put(101,"Ali-Can-11-H-MF");
                ogrenciMap.put(102,"Veli-Cem-10-K-TM");
                ogrenciMap.put(103,"Ali-Cem-11-K-TM");
                ogrenciMap.put(104,"Ayse-Can-10-H-MF");
                ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
                ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

                ogrencileri map'e eklerken
                key olarak numara, value olarak tum bilgiyi girdigimizde
                ogrenciyi eklemek tek 1 satir surerken
                ogrencinin bilgisine ulasmak veya update etmek cok uzun suruyor

                Eger bilgilere erisim ve update'in daha hizli yapilabilmesini istersek
                Nested Map kullanabiliriz

                Ogrencileri ve bilgilerini Nested Map olarak girmek uzun olacaktir
                Ancak erisim ve update'in kisa olmasi icin bunu tercih edebiliriz

                ogrenciMap ={ 101 ={ogrenciBilgiMap1}, 102={OgrenciBilgimapi2}.....
         */

        Map<Integer, Map<String,String >> ogrenciMap = new HashMap();


        Map<String,String > ogrenciBilgiMapi101 = new HashMap<>();
        ogrenciBilgiMapi101.put("isim","Ali");
        ogrenciBilgiMapi101.put("soyisim","Can");
        ogrenciBilgiMapi101.put("sinif","11");
        ogrenciBilgiMapi101.put("sube","H");
        ogrenciBilgiMapi101.put("brans","MF");

        ogrenciMap.put(101,ogrenciBilgiMapi101);


        // ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        Map<String,String > ogrenciBilgiMapi102 = new HashMap<>();
        ogrenciBilgiMapi102.put("isim","Veli");
        ogrenciBilgiMapi102.put("soyisim","Cem");
        ogrenciBilgiMapi102.put("sinif","10");
        ogrenciBilgiMapi102.put("sube","K");
        ogrenciBilgiMapi102.put("brans","TM");

        ogrenciMap.put(102,ogrenciBilgiMapi102);

        // ogrenciMap.put(103,"Ali-Cem-11-K-TM");

        Map<String,String > ogrenciBilgiMapi103 = new HashMap<>();
        ogrenciBilgiMapi103.put("isim","Ali");
        ogrenciBilgiMapi103.put("soyisim","Cem");
        ogrenciBilgiMapi103.put("sinif","11");
        ogrenciBilgiMapi103.put("sube","K");
        ogrenciBilgiMapi103.put("brans","TM");

        ogrenciMap.put(103,ogrenciBilgiMapi103);

        System.out.println(ogrenciMap);
        /*
            {
            101={sinif=11, sube=H, soyisim=Can, brans=MF, isim=Ali},
            102={sinif=10, sube=K, soyisim=Cem, brans=TM, isim=Veli},
            103={sinif=11, sube=K, soyisim=Cem, brans=TM, isim=Ali}}
         */

        // 101 numarali ogrencinin bilgilerini iceren map'i yazdirin

        System.out.println(ogrenciMap.get(101));
        // {sinif=11, sube=H, soyisim=Can, brans=MF, isim=Ali}


        // 102 numarali ogrencinin soyismini yazdirin
        System.out.println(ogrenciMap.get(102).get("soyisim")); // Cem

        // 103 numarali ogrencinin bransini yazdirin
        System.out.println(ogrenciMap.get(103).get("brans")); // TM


    }
}
