package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class C01_SifreKontrolu {
    public static void main(String[] args) {

        /*
            Kullanicidan bir sayi girmesini isteyin
            Sayi asagidaki 4 sarti sagliyorsa "Mukemmel Sayi" yazdirin

            Saglanmayan sartlarin tamamini kullaniciya soyleyin

            1- sayi 4 basamakli olmalidir
            2- sayi 3 ile bolunebilmelidir
            3- sayi 5 ile bolunememelidir
            4- sayinin birler basamagi tek sayi olmalidir
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        boolean sayiMukemmelMi=true;

        // 1- sayi 4 basamakli olmalidir
        if (sayi<1000 || sayi>9999){
            System.out.println("sayi 4 basamakli olmalidir");
            sayiMukemmelMi=false;
        }

        // 2- sayi 3 ile bolunebilmelidir

        if (sayi %3 != 0){
            System.out.println("sayi 3 ile bolunebilmelidir");
            sayiMukemmelMi=false;
        }

        // 3- sayi 5 ile bolunememelidir

        if (sayi % 5 == 0){
            System.out.println("sayi 5 ile bolunememelidir");
            sayiMukemmelMi=false;
        }


        // 4- sayinin birler basamagi tek sayi olmalidir

        if ((sayi%10)%2 == 0){
            System.out.println("sayinin birler basamagi tek sayi olmalidir");
            sayiMukemmelMi=false;
        }


        if (sayiMukemmelMi){
            System.out.println("Mukemmel Sayi");
        }

    }
}
