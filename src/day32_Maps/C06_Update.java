package day32_Maps;

import java.util.Map;

public class C06_Update {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();

        // numarasi verilen ogrencinin soyismini, yeni verilen deger ile update edin

        /*
            {
            101=Ali-Can-11-H-MF,
            102=Veli-Cem-10-K-TM,
            103=Ali-Cem-11-K-TM,
            104=Ayse-Can-10-H-MF,
            105=Sevgi-Cem-11-M-TM,
            106=Sevgi-Can-10-K-MF
            }
         */

        // ornek olarak 102 numarali ogrencinin soyismini Han yapalim

        ogrenciMap = MapMethodlar.numaraIleSoyisimUpdateEt(ogrenciMap,105,"Fan");
        ogrenciMap = MapMethodlar.numaraIleSoyisimUpdateEt(ogrenciMap,104,"Han");
        ogrenciMap = MapMethodlar.numaraIleSoyisimUpdateEt(ogrenciMap,101,"San");

        System.out.println(ogrenciMap);
    }
}
