package day09_stringManipulation_forLoop;

public class C12_ForLoopRakamlarToplami {

    public static void main(String[] args) {
        // Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        int sayi= 1453;

        int basamaksayisi= (""+sayi).length();

        int rakam= 0;
        int rakamlarToplami=0;

        for (int i = 1; i <=basamaksayisi ; i++) {

            rakam = sayi%10;

            rakamlarToplami += rakam;

            sayi /= 10;
        }

        System.out.println("Verilen sayinin rakamlari toplami : " + rakamlarToplami);
    }
}
