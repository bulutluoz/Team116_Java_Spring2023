package day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C07_SifreKontrolu {

    /*
        Kullanicidan asagidaki sartlari saglayan bir sifre isteyin
        kullanici uygun sifre girinceye kadar yeniden sifre isteyin

        sifrenin kontrolunu bir method'da yapip
        sifre uygunsa true
        degilse false dondurun

        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sifre = "";
        boolean sifreGecerliMi=false;

        while (!sifreGecerliMi){
            System.out.println("Lutfen bir sifre girin");
            sifre= scanner.nextLine();

            sifreGecerliMi=sifreKontrolEt(sifre);
        }

        System.out.println("Sifreniz basarili olarak kaydedildi");
    }





    public static boolean sifreKontrolEt(String sifre) {

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

            return true;

        }else{

            return false;
        }


    }


}
