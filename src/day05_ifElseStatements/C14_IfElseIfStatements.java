package day05_ifElseStatements;

import java.util.Scanner;

public class C14_IfElseIfStatements {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //         Kadin, 60 yas ve uzeri ,
        //         Erkek 65 yas ve uzeri emekli olabilir.
        //         Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //         veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi giriniz, \nKadin icin : K, Erkek icin E");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");

        int yas = scanner.nextInt();

        if ((cinsiyet != 'K' && cinsiyet != 'E') || yas<10 || yas>80){
            System.out.println("gecersiz giris");
        }else if (cinsiyet == 'K' && yas>=60){
            System.out.println("Kadin 60 yasindan buyuk, emekli olabilir");
        } else if (cinsiyet == 'K' && yas<60) {
            System.out.println("Kadin 60 yasina kadar calismalidir, daha "+(60-yas)+ " sene calismalisin");
        } else if (cinsiyet=='E' && yas>=65) {
            System.out.println("Erkek 65 yasindan buyuk, emekli olabilir");
        }else if (cinsiyet=='E' && yas<65){
            System.out.println("Erkek 65 yasina kadar calismalidir, daha "+(65-yas)+ " sene calismalisin");
        }


    }
}
