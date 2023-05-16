package day30_exceptions;

public class C02_BaziExceptionTurleri {

    public static void main(String[] args) {

        String str1 = null; // null bir deger degil, pointer'dir

        // System.out.println(str1.concat("Java")); // NullPointerException

        // StringIndexOutOfBoundsException
        // ArrayIndexOutOfBounds

        String a = "34"; // 34a yazarsak parseInt() bunu sayiya ceviremez ve exception firlatir
        String b = "55";
        // a ve b variable'larindaki sayilarin toplamini yazdirin

        int sonuc = Integer.parseInt(a) + Integer.parseInt(b); // NumberFormatException
        System.out.println(sonuc);


        String str = "Nasil amma";
        Object obj = str;

        Integer sayi = (Integer) obj; // ClassCastException

        // FileNotFoundException
        // IOException
        // RunTimeException
        // Exception
        // ArithmeticException
        // InputMisMatchException

    }
}
