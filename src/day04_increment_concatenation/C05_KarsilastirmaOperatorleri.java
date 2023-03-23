package day04_increment_concatenation;

public class C05_KarsilastirmaOperatorleri {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        /*  Karsilastirma operatorleri
            2 varible'i karsilastirip
            istenen sart saglaniyorsa TRUE
            sart saglanmiyorsa FALSE degeri ureten
            operatorerdir

         */

        // a b'ye esit mi ?

        System.out.println(a == b); // false

        System.out.println(2*a == b); // true

        System.out.println( a == b/2); // true

        // a b'nin esit olmadigini kontrol edin

        System.out.println( a != b ); // true

        System.out.println( a != b/2); // false

        // a b'den kucuk mu ?

        System.out.println(a < b); // true

        System.out.println(a < b/2); // false

        // a b'den kucuk degil  sartini kontrol edelim

        System.out.println( !(a < b)); // false

        // a b'den kucuk veya esit mi ?

        System.out.println(a <= b); // true

        System.out.println(2 * a <= b ); // true


        // a b'den buyuk mu ?

        System.out.println(a > b); // false

        System.out.println(5*a > 2*b); // true


        boolean c = 2 * a >= b ;

        // a'nin 3 katinin b'den buyuk olmadigi sartini kontrol edin

        System.out.println(  !(a*3 > b)    ); // false


    }
}
