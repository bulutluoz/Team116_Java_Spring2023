package day09_stringManipulation_forLoop;

import java.util.Scanner;

public class C02_StringManipulations {
    public static void main(String[] args) {
        // Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        //          ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //          eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //          - ilk harf kucuk harf olmali
        //          - son karakter rakam olmali
        //          - sifre bosluk icermemeli
        //          - uzunlugu en az 10 karakter olmali

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre = scanner.nextLine();

        // tum hatalari raporlamam istendigi icin bagimsiz if cumlesi kullanmaliyim
        // tum sartlari sagladigini kontrol etmek icin sayac kullanalim

        int sayac=0;

        //          - ilk harf kucuk harf olmali
        char ilkHarf=sifre.charAt(0);
        if (!(ilkHarf>='a' && ilkHarf<='z')){
            System.out.println("Ilk harf kucuk harf olmali");
            sayac++;
        }

        //          - son karakter rakam olmali

        char sonHarf= sifre.charAt(sifre.length()-1);

        if (!(sonHarf>='0' && sonHarf<='9')){
            System.out.println("Son karakter sayi olmali");
            sayac++;
        }

        //          - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            sayac++;
        }

        //          - uzunlugu en az 10 karakter olmali

        if (sifre.length()<10){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            sayac++;
        }


        if (sayac==0){
            System.out.println("Sifreniz basari ile kaydedilmistir");
        }
    }
}
