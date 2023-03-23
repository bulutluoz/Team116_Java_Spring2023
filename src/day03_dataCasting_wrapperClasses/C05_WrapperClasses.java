package day03_dataCasting_wrapperClasses;

public class C05_WrapperClasses {
    public static void main(String[] args) {

        int sayi = 10;

        // primitive data turlerinin hazir methodlari YOKTUR
        // Java primitive data turleri ile bazi method'lari kullanabilmemiz icin
        // ozel Wrapper Class'lar olusturmus

        Integer sayWrap = 10;
        /*
            Byte
            Short
            Integer
            Long
            Float
            Double
            Character
            Boolean
            class'lari primitive data turleri ile ayni degerleri alabilir
            Ayni data turundeki primitive ve Wrapper Class arasinda hicbir casting olmaksizin atama yapilabilir

         */

        sayWrap = sayi;
        sayi = sayWrap;

        System.out.println(Integer.MAX_VALUE); //  2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

        String str1 = "34";
        String str2 = "45";

        // bu iki String icindeki sayilarin toplamini yazdirin

        System.out.println(str1 + str2); // 3445

        System.out.println((Integer.parseInt(str1) + Integer.parseInt(str2))); // 79

        char chr = 'm';

        // chr'yi buyuk harf olarak yazdirin

        System.out.println(Character.toUpperCase(chr));// M

        System.out.println(Character.isAlphabetic(chr)); // true
        System.out.println(Character.isDigit(chr)); // false

        Double dbl = 34.4;
        String doubleStr= "44.3";

        // doubleStr degerinin 5 eksigini yazdirin

        System.out.println(Double.parseDouble(doubleStr) - 5); // 39.3



    }
}
