package day10_nestedForLoop_methodOlusturma;

public class C11_MiniHesapMakinesi {

    public static void main(String[] args) {

        // kullanicinin verdigi iki sayi ve
        // sececegi isleme gore
        // sonucu double olarak bize donduren bir method olusturun
        // ornek sayilar 3, 5,   islem * oldugunda method 15 dondurmeli

        miniHesapMakinesi(5,4,'+');
        // bize sonuc donduren methodlarda,
        // islem sonucunu gormek isterseniz direk yazdirabilir veya
        System.out.println(miniHesapMakinesi(5, 4, '*'));
        // islem sonucunu kaydedip, istedigimizde kullanabiliriz

        double sonuc = miniHesapMakinesi(5,4,'+');



    }

    public static double miniHesapMakinesi(int sayi1, int sayi2,char islemSembolu){

        // islem sembolu olarak + , - , * , / kullanilabilsin
        double sonuc=0;

        switch (islemSembolu){
            case '+' :
                sonuc = sayi1+sayi2;
                break;
            case '-' :
                sonuc = sayi1-sayi2 ;
                break;
            case '*' :
                sonuc = sayi1 * sayi2;
                break;
            case '/' :
                sonuc = (double) sayi1 / sayi2 ;
                break;
            default:
                System.out.println("islem Sembolu yanlis, sonuc 0 olarak atandi");

        }

        return sonuc;
    }
}
