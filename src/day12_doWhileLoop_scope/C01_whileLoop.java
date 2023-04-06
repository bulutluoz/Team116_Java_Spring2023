package day12_doWhileLoop_scope;

import java.util.Scanner;

public class C01_whileLoop {

    public static void main(String[] args) {
        /*
            While loop'da kullanacagimiz variable'lara bastan deger atamamiz gerekir
            eger bu variable'lara yanlis deger atamasi yaparsak
            while loop body'si hic calismayabilir

            Java bu dezavantaji ortadan kaldirmak icin
            do while loop olusturmustur

            do-while loop
            ilk kontrolu yapmadan kodu 1 kez calistirir
            sonra kontrol yapar
         */

        // kullanicidan sayi degerleri alip toplayalim
        // kullanici 0'a bastiginda islem bitsin
        // ve toplami yazdirsin

        Scanner scanner= new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        System.out.println("Lutfen toplamak icin bir sayi yazin \nBitirmek icin 0'a basin");
        sayi= scanner.nextInt();
        toplam+=sayi;

        while(sayi != 0){
            System.out.println("Lutfen toplamak icin bir sayi yazin \nBitirmek icin 0'a basin");
            sayi= scanner.nextInt();
            toplam+=sayi;
        }

        System.out.println("Girilen sayilarin toplami : " + toplam);

    }
}
