package day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {

    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere sayilar alin
        // toplam 500 olur veya gecerse deger almayi durdurup
        // kac sayi girildigini ve toplamin kac oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);
        int sayac=0;
        int toplam=0;
        int sayi=0;

        while(toplam < 500){

            System.out.println("toplanmak icin tamsayi giriniz");
            sayi = scanner.nextInt();

            sayac++;
            toplam += sayi;


        }

        System.out.println(sayac + " adet sayinin toplami : " + toplam);


    }
}
