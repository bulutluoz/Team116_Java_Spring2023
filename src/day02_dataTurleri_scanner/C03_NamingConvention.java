package day02_dataTurleri_scanner;

public class C03_NamingConvention {
    public static void main(String[] args) {

        int sayı=10;

        short Sayi = 20;
        int sAyi=50;
        int SAYI=45;
        String SAYi= "34";

        System.out.println(SAYi);

        // int 1sayi; variable isimleri sayi ile baslamaz
        int _sayi=34; // java kabul eder ama genel kullanim acisindan tavsiye edilmez
        int s123_abc = 23;

        // int int = 10; isim olarak java'da tanimli keywords kullanilamaz
        // String for = "Java";

        // CamelCase : eger variable ismi birden fazla kelime veya bolumden olusursa
        //              ilk harf kucuk, sonraki her kelimenin ilk harfi buyuk, kalanlar kucuk

        String isimIlkHarf = "d";

        int sinifGecmeNotu=50;

        // variable isimleri buyuk harfle baslamamalidir
        // Java itiraz etmez ama genel kullanimda kabul gormez

        String  Isim = "Bilal";

    }
}
