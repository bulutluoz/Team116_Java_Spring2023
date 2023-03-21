package day02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        //         asagidaki formmatta yazdirin.
        //		Isminiz : John
        //		Soyisminiz : DOE
        //		Yasiniz : 44
        //		Kaydiniz basariyla tamamlanmistir.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen sirasiyla isminizi, soyisminizi ve yasinizi giriniz");

        String isim= scanner.nextLine();
        String soyisim= scanner.nextLine().toUpperCase();
        int yas = scanner.nextInt();

        /*
        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");

         */


        System.out.println("Isminiz : " + isim + "\nSoyisminiz : " + soyisim
                           +"\nYasiniz : " + yas + "\nKaydiniz basariyla tamamlanmistir.");
    }
}
