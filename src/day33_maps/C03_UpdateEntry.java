package day33_maps;

import day32_Maps.MapMethodlar;

import java.util.Map;

public class C03_UpdateEntry {
    public static void main(String[] args) {
        // ogrenci map'inde yilsonu sinif artirin
        // 12.siniftakiler icin sinif bilgisi olarak mezun yazin
        // mezun yazan varsa bir islem yapilmayacak

        Map<Integer,String > ogrenciMap = MapMethodlar.ogrenciMapOlustur();
        ogrenciMap.put(110,"Ilknur-Cem-12-K-Say");
        ogrenciMap.put(111,"Esat-Han-Mezun-S-TM");

        System.out.println(ogrenciMap);

        ogrenciMap = MapMethodlar.yilSonuSinifArtir(ogrenciMap);

        System.out.println(ogrenciMap);
    }
}
