package day03_dataCasting_Increment;

public class C06_IslemOnceligi {
    public static void main(String[] args) {

        System.out.println(8 * 5 +  2 * ( 12 / 4 ) - 19); // 27

        System.out.println( 35 / 5 ); // 7

        System.out.println(20 / 8 ); // 2.5 ==> 2
        // bolunen iki sayi da int olursa sonucu int olarak yazdirir

        double dbl = 20;

        System.out.println(dbl / 8 ); // 2.5

        int sayi1 = 20;
        int sayi2 = 8;

        // sayi1 / sayi2 'yi ondalikli sayi olarak yazdirin

        System.out.println(    (double)sayi1 / sayi2     ); // 2.5

    }
}
