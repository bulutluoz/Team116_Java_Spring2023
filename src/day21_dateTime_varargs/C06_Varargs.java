package day21_dateTime_varargs;

public class C06_Varargs {
    public static void main(String[] args) {


        // iki tamsayiyi toplayip yazdiran bir method olusturun

        topla(15,6);
        topla(15,20,25);
        topla(10,13,44,35);
        //topla(12,14,14,12,23);
        //topla(1,3,5,7,8,3,4,2);
        // topla(2,3,5,6,7,8,9,1,2,3,5);

    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("sayilarin toplami : " + (sayi1+sayi2+sayi3+sayi4));
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("sayilarin toplami : " + (sayi1+sayi2+sayi3));
    }

    private static void topla(int sayi1, int sayi2) {
        System.out.println("sayilarin toplami : " + (sayi1+sayi2));
    }
}
