package day19_staticKeyword_passByValue;

public class C03_staticBlok {

    static {
        System.out.println("En ustteki static blok calisti");
    }

    public static void main(String[] args) {

        System.out.println("main method calisti");
    }




    static {
        /*
            Static blok'lar class calismaya baslar baslamaz devreye girer
            tum diger kod'lardan HATTA main method'dan bile once calisirlar

            olur da main method calismadan once
            ayarlamamiz gereken bazi uyarlamalar varsa
            veya bazi variable'lara baslangic degerini atamak istiyorsak
            static blok'lar kullanilabilir

            birden fazla static blok varsa
            yukaridan asagi dogru sirali olarak calistirir

         */
        System.out.println("static blok calisti");
    }

    static {
        System.out.println("2.static blok calisti");
    }
}
