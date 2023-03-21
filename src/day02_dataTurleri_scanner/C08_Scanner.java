package day02_dataTurleri_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan ismini, soyismini ve yasini alip
        //         asagidaki formatta yazdirin.
        //		   girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen sirasiyla isminizi, soyisminizi ve yasinizi giriniz");

        char isimIlkHarf= scanner.nextLine().toUpperCase().charAt(0);
        String soyisim= scanner.nextLine();
        int yas = scanner.nextInt();

        System.out.println("girilen bilgiler : " + isimIlkHarf + " " +
                                     soyisim+", "+ yas);

    }
}
