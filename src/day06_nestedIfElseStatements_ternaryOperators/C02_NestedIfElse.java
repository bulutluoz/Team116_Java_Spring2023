package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //         Kadin, 60 yas ve uzeri ,
        //         Erkek 65 yas ve uzeri emekli olabilir.
        //         Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //         veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin

        // once yas veya cinsiyetten birini ana degisken secip
        // ona gore bir if else olusturun

        // Cinsiyet ana degisken olsun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi giriniz, \nKadin icin : K, Erkek icin E");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");

        int yas = scanner.nextInt();

        if (cinsiyet == 'K'){ // Burada sadace kadinlar var

            // buraya kadinlar icin ikinci degisken olan yas'a gore if else olusturalim
            if (yas<10 || yas>80){
                System.out.println("Gecersiz yas");
            } else if (yas<60) {
                System.out.println("Kadin 60 yasina kadar calismalidir, daha "+(60-yas)+ " sene calismalisin");
            }else{
                System.out.println("Emekli olabilirsin");
            }

        } else if (cinsiyet == 'E') { // Burada sadece erkekler var

            // buraya erkekler icin ikinci degisken yas'a gore if else olusturalim
            if (yas<10 || yas>80){
                System.out.println("Gecersiz yas");
            } else if (yas<65) {
                System.out.println("Erkek 65 yasina kadar calismalidir, daha "+(65-yas)+ " sene calismalisin");
            }else{
                System.out.println("Emekli olabilirsin");
            }

        } else{
            System.out.println("Cinsiyet girisi hatali");
        }
    }
}
