package day06_nestedIfElseStatements_ternaryOperators;

public class C06_Ternary {
    public static void main(String[] args) {

        // Verilen sayi pozitif ise degerini 2 katina cikarin
        // pozitif degil ise degerini 10 artirin

        int sayi = 10;

        sayi = sayi>0 ? 2*sayi : sayi+10 ;

        // Ternary bize sonuc verir, bu sonucu ya direk yazdirmaliyiz veya variable'a atamaliyiz


        // sayi cift ise 2 katini yazdirin, tek ise "sayi tek" yazdirin.
        sayi++;

        System.out.println(sayi%2==0 ? 2*sayi : "tek sayi");

        /*
            Eger sartin saglanmasi veya saglanmamasi durumunda calisacak kodlar
            farkli data turlerinde ise
            o zaman atama yapamayiz, cunku sonuc tek bir data turunden degil
            bu durumda ternary'i sadece yazdirabiliriz
         */

        // sayi = sayi%2==0 ? 2*sayi : "tek sayi" ;
        // String str = sayi%2==0 ? 2*sayi : "tek sayi" ;

    }
}
