package day32_Maps;

import java.util.Map;

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
}